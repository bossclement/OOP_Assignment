package com.student._26454.q10;

public class Customer extends Product {
    private String customerName;
    private String contactNumber;
    private String customerAddress;
    
    public Customer(long id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price);
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new ShoppingDataException("Customer name cannot be empty");
        }
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new ShoppingDataException("Contact number cannot be empty");
        }
        if (customerAddress == null || customerAddress.trim().isEmpty()) {
            throw new ShoppingDataException("Address cannot be empty");
        }
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.customerAddress = customerAddress;
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
    public String getCustomerAddress() { return customerAddress; }
    public void setCustomerAddress(String customerAddress) throws ShoppingDataException {
        if (customerAddress == null || customerAddress.trim().isEmpty()) {
            throw new ShoppingDataException("Address cannot be empty");
        }
        this.customerAddress = customerAddress;
    }
}

