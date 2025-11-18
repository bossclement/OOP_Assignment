package com.student._26454.q10;

public class Order extends Customer {
    private String orderDate;
    private String orderId;
    
    public Order(long id, String createdDate, String updatedDate, String storeName,
                 String address, String email, String categoryName, String categoryCode,
                 String productName, String productCode, double price,
                 String customerName, String contactNumber, String customerAddress,
                 String orderDate, String orderId) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price, customerName, contactNumber, customerAddress);
        if (orderDate == null || orderDate.trim().isEmpty()) {
            throw new ShoppingDataException("Order date cannot be empty");
        }
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new ShoppingDataException("Order ID cannot be empty");
        }
        this.orderDate = orderDate;
        this.orderId = orderId;
    }
    
    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) throws ShoppingDataException {
        if (orderDate == null || orderDate.trim().isEmpty()) {
            throw new ShoppingDataException("Order date cannot be empty");
        }
        this.orderDate = orderDate;
    }
    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) throws ShoppingDataException {
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new ShoppingDataException("Order ID cannot be empty");
        }
        this.orderId = orderId;
    }
}

