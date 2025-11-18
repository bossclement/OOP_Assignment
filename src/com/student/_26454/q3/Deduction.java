package com.student._26454.q3;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;
    
    public Deduction(long id, String createdDate, String updatedDate, String companyName,
                     String address, String phoneNumber, String email, String departmentName,
                     String departmentCode, String managerName, String managerEmail,
                     String phone, String employeeName, long employeeId, String designation,
                     String contactNumber, int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance, double taxDeduction,
                     double loanDeduction) throws PayrollDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
              departmentName, departmentCode, managerName, managerEmail, phone,
              employeeName, employeeId, designation, contactNumber, totalDays, presentDays,
              leaveDays, housingAllowance, transportAllowance);
        if (taxDeduction < 0) {
            throw new PayrollDataException("Tax deduction must be >= 0");
        }
        if (loanDeduction < 0) {
            throw new PayrollDataException("Loan deduction must be >= 0");
        }
        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }
    
    public double getTaxDeduction() { return taxDeduction; }
    public void setTaxDeduction(double taxDeduction) throws PayrollDataException {
        if (taxDeduction < 0) {
            throw new PayrollDataException("Tax deduction must be >= 0");
        }
        this.taxDeduction = taxDeduction;
    }
    public double getLoanDeduction() { return loanDeduction; }
    public void setLoanDeduction(double loanDeduction) throws PayrollDataException {
        if (loanDeduction < 0) {
            throw new PayrollDataException("Loan deduction must be >= 0");
        }
        this.loanDeduction = loanDeduction;
    }
}

