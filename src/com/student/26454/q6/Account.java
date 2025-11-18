package com.student._26454.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;
    
    public Account(long id, String createdDate, String updatedDate, String bankName,
                   String branchCode, String address, String accountNumber,
                   String accountType, double balance) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        if (balance < 0) {
            throw new BankingDataException("Balance must be >= 0");
        }
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    
    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) throws BankingDataException {
        if (balance < 0) {
            throw new BankingDataException("Balance must be >= 0");
        }
        this.balance = balance;
    }
}

