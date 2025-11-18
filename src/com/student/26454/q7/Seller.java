package com.student._26454.q7;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;
    
    public Seller(long id, String createdDate, String updatedDate, String agencyName,
                  String location, String phoneNumber, String agentName, String email,
                  String licenseNumber, String propertyCode, String propertyType,
                  double price, String sellerName, String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
              email, licenseNumber, propertyCode, propertyType, price);
        if (sellerName == null || sellerName.trim().isEmpty()) {
            throw new RealEstateDataException("Seller name cannot be empty");
        }
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new RealEstateDataException("Contact number cannot be empty");
        }
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }
    
    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) throws RealEstateDataException {
        if (sellerName == null || sellerName.trim().isEmpty()) {
            throw new RealEstateDataException("Seller name cannot be empty");
        }
        this.sellerName = sellerName;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws RealEstateDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) {
            throw new RealEstateDataException("Contact number cannot be empty");
        }
        this.contactNumber = contactNumber;
    }
}

