package com.alphabit.isbnscanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlantMstService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PlantMstService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Map<String, String> getS3Credentials(String plant) {
        Map<String, String> credentials = new HashMap<>();

        // Fallback or Test override as instructed by the Senior
        if (plant == null || plant.equalsIgnoreCase("testing") || plant.equalsIgnoreCase("ecommerce")) {
            credentials.put("S3ENDPOINT", "https://objectstore.e2enetworks.net");
            credentials.put("S3BUCKETNAME", "ecommercetesting");
            credentials.put("S3ACCESSKEY", "K3YKHHK3ZN3Q0QSUNRET");
            credentials.put("S3SECRETKEY", "CGRO1VKYRK05OK46J6WBV54S479S22OYYUEZVE9Q");
            return credentials;
        }

        try {
            String query = "SELECT S3ENDPOINT, S3BUCKETNAME, S3ACCESSKEY, S3SECRETKEY FROM [dbo].[PLNTMST] WHERE PLANT = ?";
            List<Map<String, Object>> rows = jdbcTemplate.queryForList(query, plant);

            if (!rows.isEmpty()) {
                Map<String, Object> row = rows.get(0);
                credentials.put("S3ENDPOINT", row.get("S3ENDPOINT") != null ? row.get("S3ENDPOINT").toString() : "");
                credentials.put("S3BUCKETNAME", row.get("S3BUCKETNAME") != null ? row.get("S3BUCKETNAME").toString() : "");
                credentials.put("S3ACCESSKEY", row.get("S3ACCESSKEY") != null ? row.get("S3ACCESSKEY").toString() : "");
                credentials.put("S3SECRETKEY", row.get("S3SECRETKEY") != null ? row.get("S3SECRETKEY").toString() : "");
            }
        } catch (Exception e) {
            System.err.println("Database Error! Failed to fetch MinIO credentials from PLNTMST: " + e.getMessage());
        }

        return credentials;
    }
}
