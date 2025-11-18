package com.student._26454.q1;

public class Nurse extends Doctor {
    private String nurseName;
    private String shift;
    private int yearsOfExperience;
    
    public Nurse(long id, String createdDate, String updatedDate, String hospitalName,
                 String address, String phoneNumber, String email, String departmentName,
                 String departmentCode, String doctorName, String specialization,
                 String doctorEmail, String phone, String nurseName, String shift,
                 int yearsOfExperience) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone);
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new HospitalDataException("Shift must be 'Day' or 'Night'");
        }
        if (yearsOfExperience < 0) {
            throw new HospitalDataException("Years of experience must be >= 0");
        }
        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }
    
    public String getNurseName() {
        return nurseName;
    }
    
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }
    
    public String getShift() {
        return shift;
    }
    
    public void setShift(String shift) throws HospitalDataException {
        if (!shift.equals("Day") && !shift.equals("Night")) {
            throw new HospitalDataException("Shift must be 'Day' or 'Night'");
        }
        this.shift = shift;
    }
    
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    
    public void setYearsOfExperience(int yearsOfExperience) throws HospitalDataException {
        if (yearsOfExperience < 0) {
            throw new HospitalDataException("Years of experience must be >= 0");
        }
        this.yearsOfExperience = yearsOfExperience;
    }
}

