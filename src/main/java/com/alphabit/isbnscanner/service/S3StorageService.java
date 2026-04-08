package com.alphabit.isbnscanner.service;

import io.minio.MinioClient;
import io.minio.PutObjectArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Service
public class S3StorageService {

    private final PlantMstService plantMstService;

    @Autowired
    public S3StorageService(PlantMstService plantMstService) {
        this.plantMstService = plantMstService;
    }

    public String uploadExternalImageToS3(String imageUrl, String isbn, String plant) {
        try {
            // Fetch credentials actively exactly as the Senior's code snippet
            Map<String, String> creds = plantMstService.getS3Credentials(plant);
            String S3ENDPOINT = creds.get("S3ENDPOINT");
            String S3BUCKETNAME = creds.get("S3BUCKETNAME");
            String S3ACCESSKEY = creds.get("S3ACCESSKEY");
            String S3SECRETKEY = creds.get("S3SECRETKEY");
            String bucketName = S3BUCKETNAME;

            if (S3ENDPOINT == null || S3ENDPOINT.isEmpty()) {
                System.out.println("❌ MinIO S3 Credentials missing for plant: " + plant + ". Cannot upload image.");
                return null;
            }

            System.out.println("Downloading external image to stream directly to MinIO...");
            URL url = new URL(imageUrl);
            URLConnection conn = url.openConnection();

            long contentLength = conn.getContentLengthLong();
            String contentType = conn.getContentType();

            String urlpath = url.getPath(); 
            String cfileName = urlpath.substring(urlpath.lastIndexOf("/") + 1);

            if (cfileName == null || cfileName.isEmpty()) {
                cfileName = isbn + ".jpg"; // fallback native filename
            }

            // Generate timestamp using Java 8+ exactly as Senior requested
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

            // Reconstruct path inside the product folder with timestamp
            cfileName = "product/" + timestamp + "_" + cfileName;
            String catlogpath = S3ENDPOINT + "/" + bucketName + "/" + cfileName; // Format to return

            try (InputStream inputStream = conn.getInputStream()) {
                // Initialize MinIO client builder locally
                MinioClient minioClient = MinioClient.builder()
                        .endpoint(S3ENDPOINT)
                        .credentials(S3ACCESSKEY, S3SECRETKEY)
                        .build();

                // Stream directly entirely into MinIO
                minioClient.putObject(
                        PutObjectArgs.builder()
                                .bucket(bucketName)
                                .object(cfileName)
                                .stream(inputStream, contentLength, -1)
                                .contentType(contentType != null ? contentType : "image/jpeg")
                                .build()
                );
            }

            return catlogpath;
        } catch (Exception e) {
            System.err.println("Failed to upload image to E2E MinIO: " + e.getMessage());
            return null;
        }
    }
}
