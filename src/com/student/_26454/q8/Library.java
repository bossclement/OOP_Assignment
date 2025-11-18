package com.student._26454.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;
    
    public Library(long id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber) throws LibraryDataException {
        super(id, createdDate, updatedDate);
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new LibraryDataException("Phone number must be exactly 10 digits");
        }
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }
    
    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) { this.libraryName = libraryName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws LibraryDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new LibraryDataException("Phone number must be exactly 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }
}

