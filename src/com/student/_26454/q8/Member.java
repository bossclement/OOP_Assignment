package com.student._26454.q8;

public class Member extends Book {
    private String memberName;
    private long memberId;
    private String contactNumber;
    
    public Member(long id, String createdDate, String updatedDate, String libraryName,
                  String location, String phoneNumber, String sectionName, String sectionCode,
                  String title, String author, String ISBN, String memberName,
                  long memberId, String contactNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName,
              sectionCode, title, author, ISBN);
        if (memberId <= 0) {
            throw new LibraryDataException("Member ID must be greater than 0");
        }
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }
    
    public String getMemberName() { return memberName; }
    public void setMemberName(String memberName) { this.memberName = memberName; }
    public long getMemberId() { return memberId; }
    public void setMemberId(long memberId) throws LibraryDataException {
        if (memberId <= 0) {
            throw new LibraryDataException("Member ID must be greater than 0");
        }
        this.memberId = memberId;
    }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
}

