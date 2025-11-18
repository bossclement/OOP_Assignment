package com.student._26454.q8;

public class Payment extends Fine {
    private String paymentDate;
    private String paymentMode;
    
    public Payment(long id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber, String sectionName, String sectionCode,
                   String title, String author, String ISBN, String memberName,
                   long memberId, String contactNumber, String borrowDate,
                   String returnDate, double fineAmount, int daysLate,
                   String paymentDate, String paymentMode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName,
              sectionCode, title, author, ISBN, memberName, memberId, contactNumber,
              borrowDate, returnDate, fineAmount, daysLate);
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new LibraryDataException("Payment date cannot be empty");
        }
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new LibraryDataException("Payment mode cannot be empty");
        }
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }
    
    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws LibraryDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) {
            throw new LibraryDataException("Payment date cannot be empty");
        }
        this.paymentDate = paymentDate;
    }
    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) throws LibraryDataException {
        if (paymentMode == null || paymentMode.trim().isEmpty()) {
            throw new LibraryDataException("Payment mode cannot be empty");
        }
        this.paymentMode = paymentMode;
    }
}

