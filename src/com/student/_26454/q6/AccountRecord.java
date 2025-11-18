package com.student._26454.q6;

public final class AccountRecord extends Payment {
    private static final String STUDENT_ID = "26454";
    
    public AccountRecord(long id, String createdDate, String updatedDate, String bankName,
                        String branchCode, String address, String accountNumber,
                        String accountType, double balance, String customerName,
                        String email, String phoneNumber, String transactionId,
                        String transactionType, double amount, double depositAmount,
                        String depositDate, double withdrawalAmount, String withdrawalDate,
                        double loanAmount, double interestRate, int duration,
                        double paymentAmount, String paymentDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
              accountType, balance, customerName, email, phoneNumber, transactionId,
              transactionType, amount, depositAmount, depositDate, withdrawalAmount,
              withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }
    
    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100.0;
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== BANKING SYSTEM ==========");
        System.out.println(STUDENT_ID + " Bank Name: " + getBankName());
        System.out.println(STUDENT_ID + " Branch Code: " + getBranchCode());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Account Number: " + getAccountNumber());
        System.out.println(STUDENT_ID + " Account Type: " + getAccountType());
        System.out.println(STUDENT_ID + " Balance: $" + getBalance());
        System.out.println(STUDENT_ID + " Customer: " + getCustomerName());
        System.out.println(STUDENT_ID + " Email: " + getEmail());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Transaction ID: " + getTransactionId());
        System.out.println(STUDENT_ID + " Transaction Type: " + getTransactionType());
        System.out.println(STUDENT_ID + " Amount: $" + getAmount());
        System.out.println(STUDENT_ID + " Deposit Amount: $" + getDepositAmount());
        System.out.println(STUDENT_ID + " Deposit Date: " + getDepositDate());
        System.out.println(STUDENT_ID + " Withdrawal Amount: $" + getWithdrawalAmount());
        System.out.println(STUDENT_ID + " Withdrawal Date: " + getWithdrawalDate());
        System.out.println(STUDENT_ID + " Loan Amount: $" + getLoanAmount());
        System.out.println(STUDENT_ID + " Interest Rate: " + getInterestRate() + "%");
        System.out.println(STUDENT_ID + " Duration: " + getDuration() + " months");
        System.out.println(STUDENT_ID + " Payment Amount: $" + getPaymentAmount());
        System.out.println(STUDENT_ID + " Payment Date: " + getPaymentDate());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Calculated Interest: $" + String.format("%.2f", calculateInterest()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

