package com.student._26454.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;
    
    public Transaction(long id, String createdDate, String updatedDate, String bankName,
                      String branchCode, String address, String accountNumber,
                      String accountType, double balance, String customerName,
                      String email, String phoneNumber, String transactionId,
                      String transactionType, double amount) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
              accountType, balance, customerName, email, phoneNumber);
        if (amount <= 0) {
            throw new BankingDataException("Amount must be greater than 0");
        }
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }
    
    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) { this.transactionId = transactionId; }
    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) throws BankingDataException {
        if (amount <= 0) {
            throw new BankingDataException("Amount must be greater than 0");
        }
        this.amount = amount;
    }
}

