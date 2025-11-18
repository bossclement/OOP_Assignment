package com.student._26454.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;
    
    public Bank(long id, String createdDate, String updatedDate, String bankName,
                String branchCode, String address) throws BankingDataException {
        super(id, createdDate, updatedDate);
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankingDataException("Branch code must be at least 3 characters");
        }
        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
    }
    
    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }
    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) throws BankingDataException {
        if (branchCode == null || branchCode.length() < 3) {
            throw new BankingDataException("Branch code must be at least 3 characters");
        }
        this.branchCode = branchCode;
    }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}

