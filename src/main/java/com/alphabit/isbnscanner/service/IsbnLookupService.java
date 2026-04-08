package com.alphabit.isbnscanner.service;

import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class IsbnLookupService {

    // Ideally, this key sits in application.properties! We will hardcode it for immediate testing as requested.
    private static final String API_KEY = "62677_2ac6e541af34e9c600a60cfc1d00ecbd";

    /**
     * Replicates the Senior's exact HTTP URL Connection to pull Book Metadata.
     * @param isbn The 13-digit barcode (e.g. 9781934759486)
     * @return The raw JSON response string from api2.isbndb.com
     */
    public String lookupBookByIsbn(String isbn) {
        String apiUrl = "https://api2.isbndb.com/book/" + isbn;
        HttpURLConnection con = null;

        System.out.println("-> Hitting ISBNdb.com API for ISBN: " + isbn);

        try {
            URL myurl = new URL(apiUrl);
            con = (HttpURLConnection) myurl.openConnection();
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", API_KEY);
            con.setRequestMethod("GET");

            int responseCode = con.getResponseCode();
            System.out.println("-> API Response Code: " + responseCode);

            if(responseCode != 200) {
                 System.err.println("-> External API failed to find book or unauthorized.");
                 return null;
            }

            StringBuilder content = new StringBuilder();
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String line;
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            return content.toString();

        } catch (Exception e) {
            System.err.println("-> Error communicating with ISBNdb API");
            e.printStackTrace();
            return null;
        } finally {
            if (con != null) {
                con.disconnect();
            }
        }
    }
}
