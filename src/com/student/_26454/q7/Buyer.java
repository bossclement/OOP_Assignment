package com.student._26454.q7;

public class Buyer extends Seller {
    private String buyerName;
    private String buyerEmail;
    
    public Buyer(long id, String createdDate, String updatedDate, String agencyName,
                 String location, String phoneNumber, String agentName, String email,
                 String licenseNumber, String propertyCode, String propertyType,
                 double price, String sellerName, String contactNumber,
                 String buyerName, String buyerEmail) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
              email, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
        if (buyerEmail == null || !buyerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new RealEstateDataException("Invalid buyer email format");
        }
        this.buyerName = buyerName;
        this.buyerEmail = buyerEmail;
    }
    
    public String getBuyerName() { return buyerName; }
    public void setBuyerName(String buyerName) { this.buyerName = buyerName; }
    public String getBuyerEmail() { return buyerEmail; }
    public void setBuyerEmail(String buyerEmail) throws RealEstateDataException {
        if (buyerEmail == null || !buyerEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new RealEstateDataException("Invalid buyer email format");
        }
        this.buyerEmail = buyerEmail;
    }
}

