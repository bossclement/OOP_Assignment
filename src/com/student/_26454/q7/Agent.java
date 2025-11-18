package com.student._26454.q7;

public class Agent extends Agency {
    private String agentName;
    private String email;
    private String licenseNumber;
    
    public Agent(long id, String createdDate, String updatedDate, String agencyName,
                 String location, String phoneNumber, String agentName, String email,
                 String licenseNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber);
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new RealEstateDataException("Invalid email format");
        }
        this.agentName = agentName;
        this.email = email;
        this.licenseNumber = licenseNumber;
    }
    
    public String getAgentName() { return agentName; }
    public void setAgentName(String agentName) { this.agentName = agentName; }
    public String getEmail() { return email; }
    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new RealEstateDataException("Invalid email format");
        }
        this.email = email;
    }
    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
}

