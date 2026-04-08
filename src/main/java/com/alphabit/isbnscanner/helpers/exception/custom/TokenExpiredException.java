package com.alphabit.isbnscanner.helpers.exception.custom;

public class TokenExpiredException extends RuntimeException {
    private String message;
    public TokenExpiredException(String message) { super(); this.message = message; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
