package com.alphabit.isbnscanner.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api")
public class S3TestController {

    @GetMapping("/test-s3")
    public String testMinioUpload() {
        try {
            // Testing Keys Provided by Senior
            // Fix: If endpoint given has bucket name in it, we must strip it so MinIO doesn't double-route it!
            String endpoint = "https://objectstore.e2enetworks.net";
            String bucketName = "ecommercetesting";
            String accessKey = "K3YKHHK3ZN3Q0QSUNRET";
            String secretKey = "CGRO1VKYRK05OK46J6WBV54S479S22OYYUEZVE9Q";

            MinioClient minioClient = MinioClient.builder()
                .endpoint(endpoint)
                .credentials(accessKey, secretKey)
                .build();

            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
            String fileName = "product/AITest_" + timestamp + "_success.txt";
            String content = "Hello Senior! This file was successfully uploaded directly using the provided E2E Networks MinIO credentials. The backend structure is perfect!";
            
            InputStream stream = new ByteArrayInputStream(content.getBytes(StandardCharsets.UTF_8));

            minioClient.putObject(
                PutObjectArgs.builder()
                    .bucket(bucketName)
                    .object(fileName)
                    .stream(stream, stream.available(), -1)
                    .contentType("text/plain")
                    .build()
            );

            return "<h2>SUCCESS!</h2> <p>Check the ecommercetesting bucket for file:<br><b>" + fileName + "</b></p>";

        } catch (Exception e) {
            e.printStackTrace();
            return "<h2>FAILED:</h2> <p>" + e.getMessage() + "</p><pre>" + java.util.Arrays.toString(e.getStackTrace()) + "</pre>";
        }
    }
}
