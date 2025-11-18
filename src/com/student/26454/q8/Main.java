package com.student._26454.q8;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === LIBRARY MANAGEMENT SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Library Name: ");
            String libraryName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Location: ");
            String location = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Section Name: ");
            String sectionName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Section Code (>=3 chars): ");
            String sectionCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Book Title: ");
            String title = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Author: ");
            String author = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter ISBN (>=10 chars): ");
            String ISBN = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Member Name: ");
            String memberName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Member ID: ");
            long memberId = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Borrow Date: ");
            String borrowDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Return Date: ");
            String returnDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Fine Amount: ");
            double fineAmount = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Days Late: ");
            int daysLate = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Date: ");
            String paymentDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Total Fine: ");
            double totalFine = scanner.nextDouble();
            
            LibraryRecord record = new LibraryRecord(id, createdDate, updatedDate, libraryName,
                location, phoneNumber, sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber, borrowDate, returnDate, fineAmount,
                daysLate, paymentDate, paymentMode, totalFine);
            
            record.displayAllDetails();
            
        } catch (LibraryDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

