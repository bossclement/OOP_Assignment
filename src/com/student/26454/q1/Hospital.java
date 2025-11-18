package com.student._26454.q1;

public class Hospital extends Entity {
    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;
    
    public Hospital(long id, String createdDate, String updatedDate, String hospitalName, 
                   String address, String phoneNumber, String email) throws HospitalDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HospitalDataException("Phone number must be exactly 10 digits");
        }
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HospitalDataException("Invalid email format");
        }
        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public String getHospitalName() {
        return hospitalName;
    }
    
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) throws HospitalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new HospitalDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) throws HospitalDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HospitalDataException("Invalid email format");
        }
        this.email = email;
    }
}

