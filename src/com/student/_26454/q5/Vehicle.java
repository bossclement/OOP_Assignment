package com.student._26454.q5;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;
    
    public Vehicle(long id, String createdDate, String updatedDate, String companyName,
                   String address, String phoneNumber, String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);
        if (dailyRate <= 0) {
            throw new RentalDataException("Daily rate must be greater than 0");
        }
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }
    
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) throws RentalDataException {
        if (dailyRate <= 0) {
            throw new RentalDataException("Daily rate must be greater than 0");
        }
        this.dailyRate = dailyRate;
    }
}

