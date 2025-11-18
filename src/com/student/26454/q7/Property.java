package com.student._26454.q7;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;
    
    public Property(long id, String createdDate, String updatedDate, String agencyName,
                    String location, String phoneNumber, String agentName, String email,
                    String licenseNumber, String propertyCode, String propertyType,
                    double price) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
              email, licenseNumber);
        if (price <= 0) {
            throw new RealEstateDataException("Price must be greater than 0");
        }
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }
    
    public String getPropertyCode() { return propertyCode; }
    public void setPropertyCode(String propertyCode) { this.propertyCode = propertyCode; }
    public String getPropertyType() { return propertyType; }
    public void setPropertyType(String propertyType) { this.propertyType = propertyType; }
    public double getPrice() { return price; }
    public void setPrice(double price) throws RealEstateDataException {
        if (price <= 0) {
            throw new RealEstateDataException("Price must be greater than 0");
        }
        this.price = price;
    }
}

