package com.student._26454.q10;

public class Shipping extends Payment {
    private String shippingAddress;
    private double shippingCost;
    
    public Shipping(long id, String createdDate, String updatedDate, String storeName,
                    String address, String email, String categoryName, String categoryCode,
                    String productName, String productCode, double price,
                    String customerName, String contactNumber, String customerAddress,
                    String orderDate, String orderId, String paymentMethod,
                    String paymentStatus, String shippingAddress, double shippingCost) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price, customerName, contactNumber,
              customerAddress, orderDate, orderId, paymentMethod, paymentStatus);
        if (shippingCost < 0) {
            throw new ShoppingDataException("Shipping cost must be >= 0");
        }
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }
    
    public String getShippingAddress() { return shippingAddress; }
    public void setShippingAddress(String shippingAddress) { this.shippingAddress = shippingAddress; }
    public double getShippingCost() { return shippingCost; }
    public void setShippingCost(double shippingCost) throws ShoppingDataException {
        if (shippingCost < 0) {
            throw new ShoppingDataException("Shipping cost must be >= 0");
        }
        this.shippingCost = shippingCost;
    }
}

