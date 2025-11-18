package com.student._26454.q3;

public class Employee extends Manager {
    private String employeeName;
    private long employeeId;
    private String designation;
    private String contactNumber;
    
    public Employee(long id, String createdDate, String updatedDate, String companyName,
                    String address, String phoneNumber, String email, String departmentName,
                    String departmentCode, String managerName, String managerEmail,
                    String phone, String employeeName, long employeeId, String designation,
                    String contactNumber) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, phone);
        if (employeeId <= 0) {
            throw new PayrollDataException("Employee ID must be greater than 0");
        }
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Contact number must be exactly 10 digits");
        }
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.designation = designation;
        this.contactNumber = contactNumber;
    }
    
    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public long getEmployeeId() { return employeeId; }
    public void setEmployeeId(long employeeId) throws PayrollDataException {
        if (employeeId <= 0) {
            throw new PayrollDataException("Employee ID must be greater than 0");
        }
        this.employeeId = employeeId;
    }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws PayrollDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) {
            throw new PayrollDataException("Contact number must be exactly 10 digits");
        }
        this.contactNumber = contactNumber;
    }
}

