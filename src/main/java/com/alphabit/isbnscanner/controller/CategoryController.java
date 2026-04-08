package com.alphabit.isbnscanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/category")
@CrossOrigin(origins = "*")
public class CategoryController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CategoryController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Map<String, Object>>> getCategories() {
        String query = "SELECT ID, ITEMGROUPNAME FROM [dbo].[test_ITEMGROUPMST]";
        List<Map<String, Object>> categories = jdbcTemplate.queryForList(query);
        return ResponseEntity.ok(categories);
    }

    @PostMapping("/create")
    public ResponseEntity<Map<String, Object>> createCategory(@RequestBody Map<String, String> payload) {
        String categoryName = payload.get("categoryName");
        
        Map<String, Object> response = new HashMap<>();
        
        if (categoryName == null || categoryName.trim().isEmpty()) {
            response.put("status", "ERROR");
            response.put("message", "categoryName cannot be empty");
            return ResponseEntity.badRequest().body(response);
        }

        // Check if exists
        String checkQuery = "SELECT ID FROM [dbo].[test_ITEMGROUPMST] WHERE ITEMGROUPNAME = ?";
        List<Map<String, Object>> existing = jdbcTemplate.queryForList(checkQuery, categoryName);
        
        if (!existing.isEmpty()) {
            response.put("status", "EXISTING");
            response.put("message", "Category already exists");
            response.put("id", existing.get(0).get("ID"));
            return ResponseEntity.ok(response);
        }

        // Insert new category
        // Note: PLANT is required. Using a default or can be extracted from session later.
        String insertQuery = "INSERT INTO [dbo].[test_ITEMGROUPMST] (PLANT, ITEMGROUPNAME) VALUES (?, ?)";
        try {
            jdbcTemplate.update(insertQuery, "DEFAULT_PLANT", categoryName);
            
            // Fetch the newly created ID
            List<Map<String, Object>> newlyCreated = jdbcTemplate.queryForList(checkQuery, categoryName);
            response.put("status", "CREATED");
            response.put("message", "Category properly inserted into master table.");
            if (!newlyCreated.isEmpty()) {
                response.put("id", newlyCreated.get(0).get("ID"));
            }
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            response.put("status", "ERROR");
            response.put("message", "Failed to insert category: " + e.getMessage());
            return ResponseEntity.internalServerError().body(response);
        }
    }
}
