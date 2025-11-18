package com.student._26454.q2;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === SCHOOL MANAGEMENT SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter School Name: ");
            String schoolName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter School Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter School Phone (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter School Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Department Code (alphanumeric, >=3 chars): ");
            String departmentCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Teacher Name: ");
            String teacherName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Subject: ");
            String subject = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Teacher Email: ");
            String teacherEmail = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Teacher Phone (10 digits): ");
            String phone = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Grade: ");
            String grade = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Course Name: ");
            String courseName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Course Code: ");
            String courseCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Credit Hours: ");
            int creditHours = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Exam Name: ");
            String examName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Max Marks: ");
            double maxMarks = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Exam Date: ");
            String examDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Obtained Marks: ");
            double obtainedMarks = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Remarks: ");
            String remarks = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Tuition Fee: ");
            double tuitionFee = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Exam Fee: ");
            double examFee = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Total Fee: ");
            double totalFee = scanner.nextDouble();
            
            StudentRecord record = new StudentRecord(id, createdDate, updatedDate, schoolName,
                address, phoneNumber, email, departmentName, departmentCode, teacherName,
                subject, teacherEmail, phone, studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours, examName, maxMarks, examDate,
                obtainedMarks, remarks, tuitionFee, examFee, totalFee);
            
            record.displayAllDetails();
            
        } catch (SchoolDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

