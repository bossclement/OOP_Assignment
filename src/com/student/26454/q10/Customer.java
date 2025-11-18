package com.student._26454.q10;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String address;
    
    public Customer(long id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String address) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price);
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new ShoppingDataException("Customer name cannot be empty");
        }
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("Contact number cannot be empty");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new ShoppingDataException("Address cannot be empty");
        }
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws ShoppingDataException {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new ShoppingDataException("Customer name cannot be empty");
        }
        this.customerName = customerName;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws ShoppingDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
    }
    public String getAddress() { return address; }
    public void setAddress(String address) throws ShoppingDataException {
        if (address == null || address.trim().isEmpty()) {
            throw new ShoppingDataException("Address cannot be empty");
        }
        this.address = address;
    }
}

