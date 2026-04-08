package com.alphabit.isbnscanner.model;

/**
 * This class accurately maps the JSON payload that the App Developer will send.
 * We are using the exact snake_case and camelCase variables as defined in the frontend.
 */
public class SaveBookRequest {
    
    private String isbn;
    private String b_title;
    private String b_author;
    private Double price;
    private Double cost;
    private Integer quantity;
    private String location;
    private String category;
    private String sub_category;
    private String condition;
    private String book_type;

    // Default constructor is required for Jackson JSON Parsing
    public SaveBookRequest() {}

    // Getters and Setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getB_title() { return b_title; }
    public void setB_title(String b_title) { this.b_title = b_title; }

    public String getB_author() { return b_author; }
    public void setB_author(String b_author) { this.b_author = b_author; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public Double getCost() { return cost; }
    public void setCost(Double cost) { this.cost = cost; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getSub_category() { return sub_category; }
    public void setSub_category(String sub_category) { this.sub_category = sub_category; }

    public String getCondition() { return condition; }
    public void setCondition(String condition) { this.condition = condition; }

    public String getBook_type() { return book_type; }
    public void setBook_type(String book_type) { this.book_type = book_type; }
}
