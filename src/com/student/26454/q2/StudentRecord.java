package com.student._26454.q2;

public final class StudentRecord extends Fee {
    private static final String STUDENT_ID = "26454";
    
    public StudentRecord(long id, String createdDate, String updatedDate, String schoolName,
                        String address, String phoneNumber, String email, String departmentName,
                        String departmentCode, String teacherName, String subject,
                        String teacherEmail, String phone, String studentName, int rollNumber,
                        String grade, String contactNumber, String courseName, String courseCode,
                        int creditHours, String examName, double maxMarks, String examDate,
                        double obtainedMarks, String remarks, double tuitionFee, double examFee,
                        double totalFee) throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
              departmentName, departmentCode, teacherName, subject, teacherEmail, phone,
              studentName, rollNumber, grade, contactNumber, courseName, courseCode,
              creditHours, examName, maxMarks, examDate, obtainedMarks, remarks,
              tuitionFee, examFee, totalFee);
    }
    
    public double calculateAverageMarks() {
        if (getMaxMarks() == 0) return 0;
        return (getObtainedMarks() / getMaxMarks()) * 100;
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== SCHOOL MANAGEMENT SYSTEM ==========");
        System.out.println(STUDENT_ID + " School Name: " + getSchoolName());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Email: " + getEmail());
        System.out.println(STUDENT_ID + " Department: " + getDepartmentName() + " (" + getDepartmentCode() + ")");
        System.out.println(STUDENT_ID + " Teacher: " + getTeacherName() + " - " + getSubject());
        System.out.println(STUDENT_ID + " Teacher Email: " + getTeacherEmail());
        System.out.println(STUDENT_ID + " Teacher Phone: " + getPhone());
        System.out.println(STUDENT_ID + " Student: " + getStudentName());
        System.out.println(STUDENT_ID + " Roll Number: " + getRollNumber());
        System.out.println(STUDENT_ID + " Grade: " + getGrade());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Course: " + getCourseName() + " (" + getCourseCode() + ")");
        System.out.println(STUDENT_ID + " Credit Hours: " + getCreditHours());
        System.out.println(STUDENT_ID + " Exam: " + getExamName());
        System.out.println(STUDENT_ID + " Max Marks: " + getMaxMarks());
        System.out.println(STUDENT_ID + " Exam Date: " + getExamDate());
        System.out.println(STUDENT_ID + " Obtained Marks: " + getObtainedMarks());
        System.out.println(STUDENT_ID + " Remarks: " + getRemarks());
        System.out.println(STUDENT_ID + " Tuition Fee: $" + getTuitionFee());
        System.out.println(STUDENT_ID + " Exam Fee: $" + getExamFee());
        System.out.println(STUDENT_ID + " Total Fee: $" + getTotalFee());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Average Marks: " + String.format("%.2f", calculateAverageMarks()) + "%");
        System.out.println(STUDENT_ID + " =================================================");
    }
}

