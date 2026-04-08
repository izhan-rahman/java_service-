package com.alphabit.isbnscanner.helpers.common.results;

public class ReportStatusDao {
    private String name;
    private int no;

    public ReportStatusDao(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getNo() { return no; }
    public void setNo(int no) { this.no = no; }
}
