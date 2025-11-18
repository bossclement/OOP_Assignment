package com.student._26454.q1;

public final class HospitalRecord extends Bill {
    private static final String STUDENT_ID = "26454";
    
    public HospitalRecord(long id, String createdDate, String updatedDate, String hospitalName,
                         String address, String phoneNumber, String email, String departmentName,
                         String departmentCode, String doctorName, String specialization,
                         String doctorEmail, String phone, String nurseName, String shift,
                         int yearsOfExperience, String patientName, int age, String gender,
                         String contactNumber, String admissionDate, String roomNumber,
                         double roomCharges, String diagnosis, String treatmentGiven,
                         double treatmentCost, double doctorFee, double medicineCost,
                         double totalBill) throws HospitalDataException {
        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
              departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
              nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
              admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
              doctorFee, medicineCost, totalBill);
    }
    
    public double generateBill() {
        return getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== HOSPITAL MANAGEMENT SYSTEM ==========");
        System.out.println(STUDENT_ID + " Hospital Name: " + getHospitalName());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Email: " + getEmail());
        System.out.println(STUDENT_ID + " Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println(STUDENT_ID + " Doctor: " + getDoctorName() + " - " + getSpecialization());
        System.out.println(STUDENT_ID + " Doctor Email: " + getDoctorEmail());
        System.out.println(STUDENT_ID + " Doctor Phone: " + getPhone());
        System.out.println(STUDENT_ID + " Nurse: " + getNurseName() + " (Shift: " + getShift() + ", Experience: " + getYearsOfExperience() + " years)");
        System.out.println(STUDENT_ID + " Patient: " + getPatientName());
        System.out.println(STUDENT_ID + " Age: " + getAge());
        System.out.println(STUDENT_ID + " Gender: " + getGender());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Admission Date: " + getAdmissionDate());
        System.out.println(STUDENT_ID + " Room Number: " + getRoomNumber());
        System.out.println(STUDENT_ID + " Room Charges: $" + getRoomCharges());
        System.out.println(STUDENT_ID + " Diagnosis: " + getDiagnosis());
        System.out.println(STUDENT_ID + " Treatment: " + getTreatmentGiven());
        System.out.println(STUDENT_ID + " Treatment Cost: $" + getTreatmentCost());
        System.out.println(STUDENT_ID + " Doctor Fee: $" + getDoctorFee());
        System.out.println(STUDENT_ID + " Medicine Cost: $" + getMedicineCost());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Final Computed Bill: $" + generateBill());
        System.out.println(STUDENT_ID + " =================================================");
    }
}

