package com.alphabit.isbnscanner.auth.dao;

public class LoginRequestDao {
    private String email;
    private String password;
    private String plant;

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getPlant() { return plant; }
    public void setPlant(String plant) { this.plant = plant; }
}
