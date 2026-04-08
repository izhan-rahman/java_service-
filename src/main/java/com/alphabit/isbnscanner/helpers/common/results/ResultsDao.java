package com.alphabit.isbnscanner.helpers.common.results;

public class ResultsDao {
    private Object results;
    private int pageNumber;
    private int pageSize;
    private String message;
    private int totalCount;
    private double totalAmount;

    public Object getResults() { return results; }
    public void setResults(Object results) { this.results = results; }
    public int getPageNumber() { return pageNumber; }
    public void setPageNumber(int pageNumber) { this.pageNumber = pageNumber; }
    public int getPageSize() { return pageSize; }
    public void setPageSize(int pageSize) { this.pageSize = pageSize; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public int getTotalCount() { return totalCount; }
    public void setTotalCount(int totalCount) { this.totalCount = totalCount; }
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
