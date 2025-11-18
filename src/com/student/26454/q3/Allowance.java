package com.student._26454.q3;

public class Allowance extends Attendance {
    private double housingAllowance;
    private double transportAllowance;
    
    public Allowance(long id, String createdDate, String updatedDate, String companyName,
                     String address, String phoneNumber, String email, String departmentName,
                     String departmentCode, String managerName, String managerEmail,
                     String phone, String employeeName, long employeeId, String designation,
                     String contactNumber, int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, phone,
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays, leaveDays);
        if (housingAllowance < 0) {
            throw new PayrollDataException("Housing allowance must be >= 0");
        }
        if (transportAllowance < 0) {
            throw new PayrollDataException("Transport allowance must be >= 0");
        }
        this.housingAllowance = housingAllowance;
        this.transportAllowance = transportAllowance;
    }
    
    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) throws PayrollDataException {
        if (housingAllowance < 0) {
            throw new PayrollDataException("Housing allowance must be >= 0");
        }
        this.housingAllowance = housingAllowance;
    }
    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) throws PayrollDataException {
        if (transportAllowance < 0) {
            throw new PayrollDataException("Transport allowance must be >= 0");
        }
        this.transportAllowance = transportAllowance;
    }
}

