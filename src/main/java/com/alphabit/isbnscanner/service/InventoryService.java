package com.alphabit.isbnscanner.service;

import com.alphabit.isbnscanner.model.SaveBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
import java.util.Map;

@Service
public class InventoryService {

    private final JdbcTemplate jdbcTemplate;
    private final IsbnLookupService isbnLookupService;
    private final S3StorageService s3StorageService;

    @Autowired
    public InventoryService(JdbcTemplate jdbcTemplate, IsbnLookupService isbnLookupService, S3StorageService s3StorageService) {
        this.jdbcTemplate = jdbcTemplate;
        this.isbnLookupService = isbnLookupService;
        this.s3StorageService = s3StorageService;
    }

    public boolean handleBookReceiving(SaveBookRequest request, String purchaseOrderNo) {

        System.out.println("\n--- [START] Processing New Scanned Book (" + request.getIsbn() + ") ---");
        
        // Data mappings matching the iba.sql table definition
        String isbn = request.getIsbn();
        String title = request.getB_title() != null ? request.getB_title() : "";
        Double unitPrice = request.getPrice() != null ? request.getPrice() : 0.0;
        Double cost = request.getCost() != null ? request.getCost() : 0.0;
        String uom = request.getBook_type() != null ? request.getBook_type() : "PCS";

        // =======================================================
        // STEP 1: Duplicate Check using JDBC
        // =======================================================
        // We use test_ITEMMST based on what was found in the iba.sql script. 
        // 5-parameter check: ISBN (stored in USERFLD1 or checked against ITEM), Description, UOM, Cost, Price
        // Since ISBN is usually the barcode but there might be multiple codes for 1 barcode, we check if ANY item with this barcode has perfect 5 parameters.
        String query = "SELECT ITEM, ITEMDESC, UnitPrice, COST, STKUOM FROM [dbo].[test_ITEMMST] WHERE USERFLD1 = ?";
        
        List<Map<String, Object>> existingItems;
        try {
            existingItems = jdbcTemplate.queryForList(query, isbn);
        } catch (Exception e) {
            System.err.println("Database Error! Make sure your SQL Server is running and connection is valid.");
            e.printStackTrace();
            return false;
        }

        boolean foundExactMatch = false;
        String finalItemCode = null;

        if (!existingItems.isEmpty()) {
            System.out.println("Barcode found in database! Checking all 5 parameters against variants...");
            for (Map<String, Object> dbItem : existingItems) {
                double dbPrice = dbItem.get("UnitPrice") != null ? Double.parseDouble(dbItem.get("UnitPrice").toString()) : 0.0;
                double dbCost = dbItem.get("COST") != null ? Double.parseDouble(dbItem.get("COST").toString()) : 0.0;
                String dbDesc = dbItem.get("ITEMDESC") != null ? dbItem.get("ITEMDESC").toString() : "";
                String dbUom = dbItem.get("STKUOM") != null ? dbItem.get("STKUOM").toString() : "";

                // Strict 5-parameter validation (Price, Cost, Desc, UOM, and it already matched Barcode)
                if (dbPrice == unitPrice && dbCost == cost && dbDesc.equalsIgnoreCase(title) && dbUom.equalsIgnoreCase(uom)) {
                    foundExactMatch = true;
                    finalItemCode = dbItem.get("ITEM").toString();
                    System.out.println("✅ Exact Match! Reusing Item Code: " + finalItemCode);
                    break;
                }
            }
        } 
        
        if (!foundExactMatch) {
            System.out.println("❌ No exact 5-parameter match found. Generating new Item Code for this variant.");
            finalItemCode = "ITEM-" + System.currentTimeMillis(); // Generating distinct 
            System.out.println("✨ Fetching official details from ISBNdb API for new item: " + finalItemCode);
            String jsonResponse = isbnLookupService.lookupBookByIsbn(isbn);
            if (jsonResponse != null && !jsonResponse.isEmpty()) {
                try {
                    ObjectMapper mapper = new ObjectMapper();
                    JsonNode root = mapper.readTree(jsonResponse);
                    JsonNode bookNode = root.path("book");
                    if (!bookNode.isMissingNode()) {
                        title = bookNode.path("title").asText(title);
                        String image = bookNode.path("image").asText("");
                        System.out.println("-> ✅ Successfully pulled Title: " + title);
                        System.out.println("-> ✅ External Image URL linked: " + image);
                        
                        if (!image.isEmpty()) {
                            String plant = "testing"; // Using testing mode to hit ecommerce bucket
                            System.out.println("-> Triggering MinIO Upload pipeline to e2enetworks...");
                            String finalS3Url = s3StorageService.uploadExternalImageToS3(image, finalItemCode, plant);
                            if (finalS3Url != null) {
                                System.out.println("-> ✅ S3 Upload complete! MinIO Linked URL: " + finalS3Url);
                            }
                        }
                    }
                } catch (Exception e) {
                    System.err.println("-> Failed to parse JSON from ISBNdb API.");
                }
            }
        }

        // =======================================================
        // STEP 2: Database Insertions & Updates
        // =======================================================
        try {
            String plant = "testing"; // Using testing mode
            String loc = request.getLocation() != null ? request.getLocation() : "DEFAULT_LOC";
            int qty = request.getQuantity() != null ? request.getQuantity() : 1;

            if (!foundExactMatch) {
                // Insert into Master Profile (test_ITEMMST)
                String insertMasterSql = "INSERT INTO [dbo].[test_ITEMMST] (PLANT, ITEM, ITEMDESC, UnitPrice, COST, STKUOM, PRD_CLS_ID, USERFLD1, ARTIST, TITLE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                jdbcTemplate.update(insertMasterSql, plant, finalItemCode, title, unitPrice, cost, uom, request.getCategory() != null ? request.getCategory() : "GENERAL", isbn, request.getB_author(), title);
                System.out.println("-> INSERTED inside test_ITEMMST");
            }

            // Insert into Receipts Log (test_RECVDET)
            String insertRecvSql = "INSERT INTO [dbo].[test_RECVDET] (PLANT, ITEM, LOC, QTY, COST, UPAT) VALUES (?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(insertRecvSql, plant, finalItemCode, loc, qty, cost, String.valueOf(System.currentTimeMillis()));
            System.out.println("-> INSERTED inside test_RECVDET log table.");

            // Update or Insert into Inventory Master (test_INVMST) based on Location
            String checkInvSql = "SELECT QTY FROM [dbo].[test_INVMST] WHERE ITEM = ? AND LOC = ?";
            List<Map<String, Object>> invRecord = jdbcTemplate.queryForList(checkInvSql, finalItemCode, loc);

            if (invRecord.isEmpty()) {
                String insertInvSql = "INSERT INTO [dbo].[test_INVMST] (PLANT, ITEM, LOC, QTY, WHID) VALUES (?, ?, ?, ?, ?)";
                jdbcTemplate.update(insertInvSql, plant, finalItemCode, loc, qty, loc); // Usually WHID matches LOC
                System.out.println("-> INSERTED initial stock into test_INVMST for location: " + loc);
            } else {
                String updateInvSql = "UPDATE [dbo].[test_INVMST] SET QTY = QTY + ? WHERE ITEM = ? AND LOC = ?";
                jdbcTemplate.update(updateInvSql, qty, finalItemCode, loc);
                System.out.println("-> UPDATED stock levels in test_INVMST for location: " + loc + " by +" + qty);
            }
            
        } catch (Exception e) {
            System.err.println("Failed to insert inventory records!");
            e.printStackTrace();
            return false;
        }

        System.out.println("--- [END] Process Completed Successfully ---\n");
        return true;
    }
}
