package com.student._26454.q10;

public class Store extends Entity {
    private String storeName;
    private String address;
    private String email;
    
    public Store(long id, String createdDate, String updatedDate, String storeName,
                 String address, String email) throws ShoppingDataException {
        super(id, createdDate, updatedDate);
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new ShoppingDataException("Invalid email format");
        }
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }
    
    public String getStoreName() { return storeName; }
    public void setStoreName(String storeName) { this.storeName = storeName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getEmail() { return email; }
    public void setEmail(String email) throws ShoppingDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new ShoppingDataException("Invalid email format");
        }
        this.email = email;
    }
}

