package com.alphabit.isbnscanner.auth.dao;

public class Result {
    private String token;
    private String user_id;
    private String plant;

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public String getUser_id() { return user_id; }
    public void setUser_id(String user_id) { this.user_id = user_id; }
    public String getPlant() { return plant; }
    public void setPlant(String plant) { this.plant = plant; }
}
