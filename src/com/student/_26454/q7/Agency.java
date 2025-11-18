package com.student._26454.q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;
    
    public Agency(long id, String createdDate, String updatedDate, String agencyName,
                  String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("Phone number must be exactly 10 digits");
        }
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    
    public String getAgencyName() { return agencyName; }
    public void setAgencyName(String agencyName) { this.agencyName = agencyName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RealEstateDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new RealEstateDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}

