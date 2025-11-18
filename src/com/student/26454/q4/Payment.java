package com.student._26454.q4;

public class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;
    
    public Payment(long id, String createdDate, String updatedDate, String hotelName,
                   String address, String phoneNumber, String email, String roomNumber,
                   String roomType, double pricePerNight, String customerName,
                   String customerEmail, String contactNumber, String bookingDate,
                   String checkInDate, String checkOutDate, String serviceName,
                   double serviceCost, String paymentMethod, String paymentDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new HotelDataException("Payment method cannot be null");
        }
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new HotelDataException("Payment date cannot be null");
        }
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }
    
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws HotelDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new HotelDataException("Payment method cannot be null");
        }
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws HotelDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new HotelDataException("Payment date cannot be null");
        }
        this.paymentDate = paymentDate;
    }
}

