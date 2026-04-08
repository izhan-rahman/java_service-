package com.alphabit.isbnscanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/location")
@CrossOrigin(origins = "*")
public class LocationController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public LocationController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Map<String, Object>>> getLocations() {
        String query = "SELECT LOC, LOCDESC FROM [dbo].[test_LOCMST]";
        List<Map<String, Object>> locations = jdbcTemplate.queryForList(query);
        return ResponseEntity.ok(locations);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createLocation(@RequestBody Map<String, String> payload) {
        String locCode = payload.get("locationCode");
        String locDesc = payload.get("locationDesc");
        
        Map<String, Object> response = new HashMap<>();
        
        if (locCode == null || locCode.trim().isEmpty()) {
            response.put("status", "ERROR");
            response.put("message", "locationCode cannot be empty");
            return ResponseEntity.badRequest().body(response);
        }

        // Check if exists
        String checkQuery = "SELECT LOC FROM [dbo].[test_LOCMST] WHERE LOC = ?";
        List<Map<String, Object>> existing = jdbcTemplate.queryForList(checkQuery, locCode);
        
        if (!existing.isEmpty()) {
            response.put("status", "EXISTING");
            response.put("message", "Location already exists");
            return ResponseEntity.ok(response);
        }

        // Insert new location
        // Note: PLANT and WHID are required based on schema.
        String insertQuery = "INSERT INTO [dbo].[test_LOCMST] (PLANT, WHID, LOC, LOCDESC) VALUES (?, ?, ?, ?)";
        try {
            jdbcTemplate.update(insertQuery, "DEFAULT_PLANT", locCode, locCode, locDesc);
            
            response.put("status", "CREATED");
            response.put("message", "Location properly inserted into master table.");
            response.put("location", locCode);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("status", "ERROR");
            response.put("message", "Failed to insert location: " + e.getMessage());
            return ResponseEntity.internalServerError().body(response);
        }
    }
}
