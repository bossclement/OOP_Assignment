package com.student._26454.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Hotel(long id, String createdDate, String updatedDate, String hotelName,
                 String address, String phoneNumber, String email) throws HotelDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HotelDataException("Phone number must be exactly 10 digits");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HotelDataException("Invalid email format");
        }
        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) { this.hotelName = hotelName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws HotelDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HotelDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() { return email; }
    public void setEmail(String email) throws HotelDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HotelDataException("Invalid email format");
        }
        this.email = email;
    }
}

