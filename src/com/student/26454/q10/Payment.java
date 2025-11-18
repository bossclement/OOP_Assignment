package com.student._26454.q10;

public class Payment extends Order {
    private String paymentMethod;
    private String paymentStatus;
    
    public Payment(long id, String createdDate, String updatedDate, String storeName,
                   String address, String email, String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderDate, String orderId, String paymentMethod,
                   String paymentStatus) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price, customerName, contactNumber,
              address, orderDate, orderId);
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new ShoppingDataException("Payment method cannot be empty");
        }
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) {
            throw new ShoppingDataException("Payment status cannot be empty");
        }
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
    
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws ShoppingDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new ShoppingDataException("Payment method cannot be empty");
        }
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(String paymentStatus) throws ShoppingDataException {
        if (paymentStatus == null || paymentStatus.trim().isEmpty()) {
            throw new ShoppingDataException("Payment status cannot be empty");
        }
        this.paymentStatus = paymentStatus;
    }
}

