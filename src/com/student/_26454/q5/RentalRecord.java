package com.student._26454.q5;

public final class RentalRecord extends Invoice {
    private static final String STUDENT_ID = "26454";
    
    public RentalRecord(long id, String createdDate, String updatedDate, String companyName,
                       String address, String phoneNumber, String branchName, String locationCode,
                       String vehicleType, String registrationNumber, double dailyRate,
                       String customerName, String licenseNumber, String contactNumber,
                       String rentalDate, String returnDate, int rentalDays,
                       double rentalCharge, double penaltyCharge, String paymentMode,
                       String transactionId, double totalCharge) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName,
              locationCode, vehicleType, registrationNumber, dailyRate, customerName,
              licenseNumber, contactNumber, rentalDate, returnDate, rentalDays,
              rentalCharge, penaltyCharge, paymentMode, transactionId, totalCharge);
    }
    
    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== VEHICLE RENTAL SYSTEM ==========");
        System.out.println(STUDENT_ID + " Company Name: " + getCompanyName());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Branch: " + getBranchName() + " (" + getLocationCode() + ")");
        System.out.println(STUDENT_ID + " Vehicle Type: " + getVehicleType());
        System.out.println(STUDENT_ID + " Registration: " + getRegistrationNumber());
        System.out.println(STUDENT_ID + " Daily Rate: $" + getDailyRate());
        System.out.println(STUDENT_ID + " Customer: " + getCustomerName());
        System.out.println(STUDENT_ID + " License: " + getLicenseNumber());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Rental Date: " + getRentalDate());
        System.out.println(STUDENT_ID + " Return Date: " + getReturnDate());
        System.out.println(STUDENT_ID + " Rental Days: " + getRentalDays());
        System.out.println(STUDENT_ID + " Rental Charge: $" + getRentalCharge());
        System.out.println(STUDENT_ID + " Penalty Charge: $" + getPenaltyCharge());
        System.out.println(STUDENT_ID + " Payment Mode: " + getPaymentMode());
        System.out.println(STUDENT_ID + " Transaction ID: " + getTransactionId());
        System.out.println(STUDENT_ID + " Total Charge: $" + getTotalCharge());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Calculated Total Charge: $" + String.format("%.2f", calculateTotalCharge()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

