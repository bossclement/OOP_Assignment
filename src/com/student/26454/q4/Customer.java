package com.student._26454.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;
    
    public Customer(long id, String createdDate, String updatedDate, String hotelName,
                    String address, String phoneNumber, String email, String roomNumber,
                    String roomType, double pricePerNight, String customerName,
                    String customerEmail, String contactNumber) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight);
        if (customerEmail == null || !customerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HotelDataException("Invalid customer email format");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new HotelDataException("Contact number must be exactly 10 digits");
        }
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) throws HotelDataException {
        if (customerEmail == null || !customerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HotelDataException("Invalid customer email format");
        }
        this.customerEmail = customerEmail;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws HotelDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new HotelDataException("Contact number must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
}

