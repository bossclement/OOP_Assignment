package com.student._26454.q3;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === EMPLOYEE PAYROLL SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Name: ");
            String companyName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Phone (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Department Code (alphanumeric, >=3 chars): ");
            String departmentCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Manager Name: ");
            String managerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Manager Email: ");
            String managerEmail = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Manager Phone (10 digits): ");
            String phone = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Employee ID: ");
            long employeeId = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Designation: ");
            String designation = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Total Days: ");
            int totalDays = scanner.nextInt();
            
            System.out.print(STUDENT_ID + " Enter Present Days: ");
            int presentDays = scanner.nextInt();
            
            System.out.print(STUDENT_ID + " Enter Leave Days: ");
            int leaveDays = scanner.nextInt();
            
            System.out.print(STUDENT_ID + " Enter Housing Allowance: ");
            double housingAllowance = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Tax Deduction: ");
            double taxDeduction = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Loan Deduction: ");
            double loanDeduction = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Basic Salary: ");
            double basicSalary = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Gross Salary: ");
            double grossSalary = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Net Salary: ");
            double netSalary = scanner.nextDouble();
            
            PayrollRecord record = new PayrollRecord(id, createdDate, updatedDate, companyName,
                address, phoneNumber, email, departmentName, departmentCode, managerName,
                managerEmail, phone, employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays, housingAllowance, transportAllowance,
                taxDeduction, loanDeduction, basicSalary, grossSalary, netSalary);
            
            record.displayAllDetails();
            
        } catch (PayrollDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

