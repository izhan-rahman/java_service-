package com.alphabit.isbnscanner.controller;

import com.alphabit.isbnscanner.model.SaveBookRequest;
import com.alphabit.isbnscanner.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/inventory")
@CrossOrigin(origins = "*") // Allow the App to call this from anywhere
public class InventoryController {

    private final InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    /**
     * Endpoint 1: The "Door" for the app developer to send the saved book data.
     */
    @PostMapping("/receive-book")
    public ResponseEntity<Map<String, String>> receiveBook(
            @RequestBody SaveBookRequest bookRequest,
            @RequestParam(required = false) String purchaseOrderNo) {

        System.out.println("\n[API Call] Received POST Request at /api/inventory/receive-book");

        boolean success = inventoryService.handleBookReceiving(bookRequest, purchaseOrderNo);

        Map<String, String> response = new HashMap<>();
        if (success) {
            response.put("status", "SUCCESS");
            response.put("message", "Book successfully processed and saved to database.");
            return ResponseEntity.ok(response);
        } else {
            response.put("status", "ERROR");
            response.put("message", "Failed to process the book data.");
            return ResponseEntity.internalServerError().body(response);
        }
    }
    
    /**
     * Endpoint 2: Master Data Retrieval
     * Eventually, you will build this so the app avoids hardcoded dropdowns.
     */
    @GetMapping("/master-data")
    public ResponseEntity<String> getMasterData() {
        return ResponseEntity.ok("This will return Categories, Locations, etc from the DB soon!");
    }
}
