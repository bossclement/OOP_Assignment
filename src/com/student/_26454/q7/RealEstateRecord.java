package com.student._26454.q7;

public final class RealEstateRecord extends Commission {
    private static final String STUDENT_ID = "26454";
    
    public RealEstateRecord(long id, String createdDate, String updatedDate, String agencyName,
                           String location, String phoneNumber, String agentName, String email,
                           String licenseNumber, String propertyCode, String propertyType,
                           double price, String sellerName, String contactNumber,
                           String buyerName, String buyerEmail, String agreementDate,
                           String terms, double paymentAmount, String paymentDate,
                           double commissionRate, double commissionAmount) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName,
              email, licenseNumber, propertyCode, propertyType, price, sellerName,
              contactNumber, buyerName, buyerEmail, agreementDate, terms, paymentAmount,
              paymentDate, commissionRate, commissionAmount);
    }
    
    public double calculateCommission() {
        return (getPrice() * getCommissionRate()) / 100.0;
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== REAL ESTATE MANAGEMENT SYSTEM ==========");
        System.out.println(STUDENT_ID + " Agency Name: " + getAgencyName());
        System.out.println(STUDENT_ID + " Location: " + getLocation());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Agent: " + getAgentName());
        System.out.println(STUDENT_ID + " Agent Email: " + getEmail());
        System.out.println(STUDENT_ID + " License Number: " + getLicenseNumber());
        System.out.println(STUDENT_ID + " Property Code: " + getPropertyCode());
        System.out.println(STUDENT_ID + " Property Type: " + getPropertyType());
        System.out.println(STUDENT_ID + " Price: $" + getPrice());
        System.out.println(STUDENT_ID + " Seller: " + getSellerName());
        System.out.println(STUDENT_ID + " Seller Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Buyer: " + getBuyerName());
        System.out.println(STUDENT_ID + " Buyer Email: " + getBuyerEmail());
        System.out.println(STUDENT_ID + " Agreement Date: " + getAgreementDate());
        System.out.println(STUDENT_ID + " Terms: " + getTerms());
        System.out.println(STUDENT_ID + " Payment Amount: $" + getPaymentAmount());
        System.out.println(STUDENT_ID + " Payment Date: " + getPaymentDate());
        System.out.println(STUDENT_ID + " Commission Rate: " + getCommissionRate() + "%");
        System.out.println(STUDENT_ID + " Commission Amount: $" + getCommissionAmount());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Calculated Commission: $" + String.format("%.2f", calculateCommission()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

