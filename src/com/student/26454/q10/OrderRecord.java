package com.student._26454.q10;

public final class OrderRecord extends Invoice {
    private static final String STUDENT_ID = "26454";
    
    public OrderRecord(long id, String createdDate, String updatedDate, String storeName,
                      String address, String email, String categoryName, String categoryCode,
                      String productName, String productCode, double price,
                      String customerName, String contactNumber, String address,
                      String orderDate, String orderId, String paymentMethod,
                      String paymentStatus, String shippingAddress, double shippingCost,
                      double totalAmount) throws ShoppingDataException {
        super(id, createdDate, updatedDate, storeName, address, email, categoryName,
              categoryCode, productName, productCode, price, customerName, contactNumber,
              address, orderDate, orderId, paymentMethod, paymentStatus, shippingAddress,
              shippingCost, totalAmount);
    }
    
    public double calculateTotalAmount() {
        return getPrice() + getShippingCost();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== ONLINE SHOPPING SYSTEM ==========");
        System.out.println(STUDENT_ID + " Store Name: " + getStoreName());
        System.out.println(STUDENT_ID + " Store Address: " + getAddress());
        System.out.println(STUDENT_ID + " Store Email: " + getEmail());
        System.out.println(STUDENT_ID + " Category: " + getCategoryName() + " (" + getCategoryCode() + ")");
        System.out.println(STUDENT_ID + " Product: " + getProductName() + " (" + getProductCode() + ")");
        System.out.println(STUDENT_ID + " Price: $" + getPrice());
        System.out.println(STUDENT_ID + " Customer: " + getCustomerName());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Customer Address: " + getAddress());
        System.out.println(STUDENT_ID + " Order Date: " + getOrderDate());
        System.out.println(STUDENT_ID + " Order ID: " + getOrderId());
        System.out.println(STUDENT_ID + " Payment Method: " + getPaymentMethod());
        System.out.println(STUDENT_ID + " Payment Status: " + getPaymentStatus());
        System.out.println(STUDENT_ID + " Shipping Address: " + getShippingAddress());
        System.out.println(STUDENT_ID + " Shipping Cost: $" + getShippingCost());
        System.out.println(STUDENT_ID + " Total Amount: $" + getTotalAmount());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Calculated Total Amount: $" + String.format("%.2f", calculateTotalAmount()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

