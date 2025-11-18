package com.student._26454.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    
    public Company(long id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber) throws RentalDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RentalDataException("Phone number must be exactly 10 digits");
        }
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RentalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RentalDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}

