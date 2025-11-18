package com.student._26454.q7;

public class Entity {
    private long id;
    private String createdDate;
    private String updatedDate;
    
    public Entity(long id, String createdDate, String updatedDate) throws RealEstateDataException {
        if (id <= 0) throw new RealEstateDataException("ID must be greater than 0");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    public long getId() { return id; }
    public void setId(long id) throws RealEstateDataException {
        if (id <= 0) throw new RealEstateDataException("ID must be greater than 0");
        this.id = id;
    }
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }
    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) { this.updatedDate = updatedDate; }
}

