package com.student._26454.q1;

public class Doctor extends Department {
    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;
    
    public Doctor(long id, String createdDate, String updatedDate, String hospitalName,
                  String address, String phoneNumber, String email, String departmentName,
                  String departmentCode, String doctorName, String specialization,
                  String doctorEmail, String phone) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode);
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new HospitalDataException("Specialization cannot be empty");
        }
        if (doctorEmail == null || !doctorEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HospitalDataException("Invalid doctor email format");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new HospitalDataException("Doctor phone must be exactly 10 digits");
        }
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }
    
    public String getDoctorName() {
        return doctorName;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getSpecialization() {
        return specialization;
    }
    
    public void setSpecialization(String specialization) throws HospitalDataException {
        if (specialization == null || specialization.trim().isEmpty()) {
            throw new HospitalDataException("Specialization cannot be empty");
        }
        this.specialization = specialization;
    }
    
    public String getDoctorEmail() {
        return doctorEmail;
    }
    
    public void setDoctorEmail(String doctorEmail) throws HospitalDataException {
        if (doctorEmail == null || !doctorEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new HospitalDataException("Invalid doctor email format");
        }
        this.doctorEmail = doctorEmail;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) throws HospitalDataException {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new HospitalDataException("Doctor phone must be exactly 10 digits");
        }
        this.phone = phone;
    }
}

