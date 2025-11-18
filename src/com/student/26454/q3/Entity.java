package com.student._26454.q3;

public class Entity {
    private long id;
    private String createdDate;
    private String updatedDate;
    
    public Entity(long id, String createdDate, String updatedDate) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID must be greater than 0");
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new PayrollDataException("Created date cannot be null");
        }
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new PayrollDataException("Updated date cannot be null");
        }
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    public long getId() { return id; }
    public void setId(long id) throws PayrollDataException {
        if (id <= 0) throw new PayrollDataException("ID must be greater than 0");
        this.id = id;
    }
    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) throws PayrollDataException {
        if (createdDate == null || createdDate.trim().isEmpty()) {
            throw new PayrollDataException("Created date cannot be null");
        }
        this.createdDate = createdDate;
    }
    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) throws PayrollDataException {
        if (updatedDate == null || updatedDate.trim().isEmpty()) {
            throw new PayrollDataException("Updated date cannot be null");
        }
        this.updatedDate = updatedDate;
    }
}

