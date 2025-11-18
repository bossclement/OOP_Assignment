package com.student._26454.q8;

public final class LibraryRecord extends Record {
    private static final String STUDENT_ID = "26454";
    
    public LibraryRecord(long id, String createdDate, String updatedDate, String libraryName,
                        String location, String phoneNumber, String sectionName, String sectionCode,
                        String title, String author, String ISBN, String memberName,
                        long memberId, String contactNumber, String borrowDate,
                        String returnDate, double fineAmount, int daysLate,
                        String paymentDate, String paymentMode, double totalFine) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName,
              sectionCode, title, author, ISBN, memberName, memberId, contactNumber,
              borrowDate, returnDate, fineAmount, daysLate, paymentDate, paymentMode, totalFine);
    }
    
    public double calculateFine() {
        return getFineAmount() * getDaysLate();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== LIBRARY MANAGEMENT SYSTEM ==========");
        System.out.println(STUDENT_ID + " Library Name: " + getLibraryName());
        System.out.println(STUDENT_ID + " Location: " + getLocation());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Section: " + getSectionName() + " (" + getSectionCode() + ")");
        System.out.println(STUDENT_ID + " Book Title: " + getTitle());
        System.out.println(STUDENT_ID + " Author: " + getAuthor());
        System.out.println(STUDENT_ID + " ISBN: " + getISBN());
        System.out.println(STUDENT_ID + " Member: " + getMemberName());
        System.out.println(STUDENT_ID + " Member ID: " + getMemberId());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Borrow Date: " + getBorrowDate());
        System.out.println(STUDENT_ID + " Return Date: " + getReturnDate());
        System.out.println(STUDENT_ID + " Fine Amount: $" + getFineAmount());
        System.out.println(STUDENT_ID + " Days Late: " + getDaysLate());
        System.out.println(STUDENT_ID + " Payment Date: " + getPaymentDate());
        System.out.println(STUDENT_ID + " Payment Mode: " + getPaymentMode());
        System.out.println(STUDENT_ID + " Total Fine: $" + getTotalFine());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Calculated Fine: $" + String.format("%.2f", calculateFine()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

