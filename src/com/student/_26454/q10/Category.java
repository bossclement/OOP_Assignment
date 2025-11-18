package com.student._26454.q10;

public class Category extends Store {
    private String categoryName;
    private String categoryCode;
    
    public Category(long id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String categoryName,
                    String categoryCode) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email);
        if (categoryCode == null || categoryCode.length() < 3) {
            throw new ShoppingDataException("Category code must be at least 3 characters");
        }
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
    
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    public String getCategoryCode() { return categoryCode; }
    public void setCategoryCode(String categoryCode) throws ShoppingDataException {
        if (categoryCode == null || categoryCode.length() < 3) {
            throw new ShoppingDataException("Category code must be at least 3 characters");
        }
        this.categoryCode = categoryCode;
    }
}

