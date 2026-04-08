package com.alphabit.isbnscanner.auth.dao;

public class AuthTokensDao {
    private String accessToken;
    private String refreshToken;

    public AuthTokensDao(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public AuthTokensDao() {}

    public String getAccessToken() { return accessToken; }
    public void setAccessToken(String accessToken) { this.accessToken = accessToken; }
    public String getRefreshToken() { return refreshToken; }
    public void setRefreshToken(String refreshToken) { this.refreshToken = refreshToken; }
}
