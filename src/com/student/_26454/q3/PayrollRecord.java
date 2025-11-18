package com.student._26454.q3;

public final class PayrollRecord extends Salary {
    private static final String STUDENT_ID = "26454";
    
    public PayrollRecord(long id, String createdDate, String updatedDate, String companyName,
                        String address, String phoneNumber, String email, String departmentName,
                        String departmentCode, String managerName, String managerEmail,
                        String phone, String employeeName, long employeeId, String designation,
                        String contactNumber, int totalDays, int presentDays, int leaveDays,
                        double housingAllowance, double transportAllowance, double taxDeduction,
                        double loanDeduction, double basicSalary, double grossSalary,
                        double netSalary) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, phone,
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays,
              leaveDays, housingAllowance, transportAllowance, taxDeduction, loanDeduction,
              basicSalary, grossSalary, netSalary);
    }
    
    public double calculateNetSalary() {
        return getBasicSalary() + getHousingAllowance() + getTransportAllowance() 
               - getTaxDeduction() - getLoanDeduction();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== EMPLOYEE PAYROLL SYSTEM ==========");
        System.out.println(STUDENT_ID + " Company Name: " + getCompanyName());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Email: " + getEmail());
        System.out.println(STUDENT_ID + " Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println(STUDENT_ID + " Manager: " + getManagerName());
        System.out.println(STUDENT_ID + " Manager Email: " + getManagerEmail());
        System.out.println(STUDENT_ID + " Manager Phone: " + getPhone());
        System.out.println(STUDENT_ID + " Employee: " + getEmployeeName());
        System.out.println(STUDENT_ID + " Employee ID: " + getEmployeeId());
        System.out.println(STUDENT_ID + " Designation: " + getDesignation());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Total Days: " + getTotalDays());
        System.out.println(STUDENT_ID + " Present Days: " + getPresentDays());
        System.out.println(STUDENT_ID + " Leave Days: " + getLeaveDays());
        System.out.println(STUDENT_ID + " Housing Allowance: $" + getHousingAllowance());
        System.out.println(STUDENT_ID + " Transport Allowance: $" + getTransportAllowance());
        System.out.println(STUDENT_ID + " Tax Deduction: $" + getTaxDeduction());
        System.out.println(STUDENT_ID + " Loan Deduction: $" + getLoanDeduction());
        System.out.println(STUDENT_ID + " Basic Salary: $" + getBasicSalary());
        System.out.println(STUDENT_ID + " Gross Salary: $" + getGrossSalary());
        System.out.println(STUDENT_ID + " Net Salary: $" + getNetSalary());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Calculated Net Salary: $" + String.format("%.2f", calculateNetSalary()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

