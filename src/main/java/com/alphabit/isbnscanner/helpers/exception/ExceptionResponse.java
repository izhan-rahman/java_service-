package com.alphabit.isbnscanner.helpers.exception;

public class ExceptionResponse {
    private String message;
    private String dateTime;

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public String getDateTime() { return dateTime; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }
}
