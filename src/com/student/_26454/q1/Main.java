package com.student._26454.q1;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === HOSPITAL MANAGEMENT SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hospital Name: ");
            String hospitalName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hospital Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hospital Phone (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hospital Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Department Code (alphanumeric, >=3 chars): ");
            String departmentCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Doctor Name: ");
            String doctorName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Specialization: ");
            String specialization = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Doctor Email: ");
            String doctorEmail = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Doctor Phone (10 digits): ");
            String phone = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Nurse Name: ");
            String nurseName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Shift (Day/Night): ");
            String shift = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Years of Experience: ");
            int yearsOfExperience = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Patient Name: ");
            String patientName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Patient Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Admission Date: ");
            String admissionDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Room Number: ");
            String roomNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Room Charges: ");
            double roomCharges = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Diagnosis: ");
            String diagnosis = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Treatment Given: ");
            String treatmentGiven = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Treatment Cost: ");
            double treatmentCost = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Doctor Fee: ");
            double doctorFee = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Medicine Cost: ");
            double medicineCost = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Total Bill: ");
            double totalBill = scanner.nextDouble();
            
            HospitalRecord record = new HospitalRecord(id, createdDate, updatedDate, hospitalName,
                address, phoneNumber, email, departmentName, departmentCode, doctorName,
                specialization, doctorEmail, phone, nurseName, shift, yearsOfExperience,
                patientName, age, gender, contactNumber, admissionDate, roomNumber,
                roomCharges, diagnosis, treatmentGiven, treatmentCost, doctorFee,
                medicineCost, totalBill);
            
            record.displayAllDetails();
            
        } catch (HospitalDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

