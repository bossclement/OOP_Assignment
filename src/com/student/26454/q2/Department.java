package com.student._26454.q2;

public class Department extends School {
    private String departmentName;
    private String departmentCode;
    
    public Department(long id, String createdDate, String updatedDate, String schoolName,
                     String address, String phoneNumber, String email, String departmentName,
                     String departmentCode) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (departmentCode == null || departmentCode.length() < 3) {
            throw new SchoolDataException("Department code must be at least 3 characters");
        }
        if (!departmentCode.matches("^[A-Za-z0-9]+$")) {
            throw new SchoolDataException("Department code must be alphanumeric");
        }
        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }
    
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
    public String getDepartmentCode() { return departmentCode; }
    public void setDepartmentCode(String departmentCode) throws SchoolDataException {
        if (departmentCode == null || departmentCode.length() < 3) {
            throw new SchoolDataException("Department code must be at least 3 characters");
        }
        if (!departmentCode.matches("^[A-Za-z0-9]+$")) {
            throw new SchoolDataException("Department code must be alphanumeric");
        }
        this.departmentCode = departmentCode;
    }
}

