package com.student._26454.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;
    
    public Airline(long id, String createdDate, String updatedDate, String airlineName,
                   String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new AirlineDataException("Invalid email format");
        }
        this.airlineName = airlineName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
    
    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { this.airlineName = airlineName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) throws AirlineDataException {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new AirlineDataException("Invalid email format");
        }
        this.contactEmail = contactEmail;
    }
}

