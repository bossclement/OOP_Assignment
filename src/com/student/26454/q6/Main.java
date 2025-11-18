package com.student._26454.q6;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === BANKING SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Bank Name: ");
            String bankName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Branch Code (>=3 chars): ");
            String branchCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Account Number: ");
            String accountNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Account Type: ");
            String accountType = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Transaction ID: ");
            String transactionId = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Transaction Type: ");
            String transactionType = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Amount: ");
            double amount = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Deposit Amount: ");
            double depositAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Deposit Date: ");
            String depositDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Withdrawal Amount: ");
            double withdrawalAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Withdrawal Date: ");
            String withdrawalDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Loan Amount: ");
            double loanAmount = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Interest Rate: ");
            double interestRate = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Duration (months): ");
            int duration = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Date: ");
            String paymentDate = scanner.nextLine();
            
            AccountRecord record = new AccountRecord(id, createdDate, updatedDate, bankName,
                branchCode, address, accountNumber, accountType, balance, customerName,
                email, phoneNumber, transactionId, transactionType, amount, depositAmount,
                depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate,
                duration, paymentAmount, paymentDate);
            
            record.displayAllDetails();
            
        } catch (BankingDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

