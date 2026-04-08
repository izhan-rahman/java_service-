package com.alphabit.isbnscanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class IsbnScannerApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IsbnScannerApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(IsbnScannerApplication.class, args);
        System.out.println("✅ ISBN Scanner API Service Started Successfully!");
    }
}
