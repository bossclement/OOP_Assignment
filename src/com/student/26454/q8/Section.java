package com.student._26454.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;
    
    public Section(long id, String createdDate, String updatedDate, String libraryName,
                   String location, String phoneNumber, String sectionName,
                   String sectionCode) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionCode == null || sectionCode.length() < 3) {
            throw new LibraryDataException("Section code must be at least 3 characters");
        }
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }
    
    public String getSectionName() { return sectionName; }
    public void setSectionName(String sectionName) { this.sectionName = sectionName; }
    public String getSectionCode() { return sectionCode; }
    public void setSectionCode(String sectionCode) throws LibraryDataException {
        if (sectionCode == null || sectionCode.length() < 3) {
            throw new LibraryDataException("Section code must be at least 3 characters");
        }
        this.sectionCode = sectionCode;
    }
}

