package com.alphabit.isbnscanner.helpers.exception.custom;

public class ResourceNotFoundException extends RuntimeException {
    private String message;

    public ResourceNotFoundException() { super(); }
    public ResourceNotFoundException(String message) { super(); this.message = message; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
