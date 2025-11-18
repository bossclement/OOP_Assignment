package com.student._26454.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;
    
    public Customer(long id, String createdDate, String updatedDate, String bankName,
                    String branchCode, String address, String accountNumber,
                    String accountType, double balance, String customerName,
                    String email, String phoneNumber) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber,
              accountType, balance);
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new BankingDataException("Invalid email format");
        }
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new BankingDataException("Phone number must be exactly 10 digits");
        }
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public String getEmail() { return email; }
    public void setEmail(String email) throws BankingDataException {
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new BankingDataException("Invalid email format");
        }
        this.email = email;
    }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws BankingDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new BankingDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}

