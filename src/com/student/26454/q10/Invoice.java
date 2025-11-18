package com.student._26454.q10;

public class Invoice extends Shipping {
    private double totalAmount;
    
    public Invoice(long id, String createdDate, String updatedDate, String storeName,
                   String address, String email, String categoryName, String categoryCode,
                   String productName, String productCode, double price,
                   String customerName, String contactNumber, String address,
                   String orderDate, String orderId, String paymentMethod,
                   String paymentStatus, String shippingAddress, double shippingCost,
                   double totalAmount) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price, customerName, contactNumber,
              address, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress, shippingCost);
        if (totalAmount <= 0) {
            throw new ShoppingDataException("Total amount must be greater than 0");
        }
        this.totalAmount = totalAmount;
    }
    
    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) throws ShoppingDataException {
        if (totalAmount <= 0) {
            throw new ShoppingDataException("Total amount must be greater than 0");
        }
        this.totalAmount = totalAmount;
    }
}

