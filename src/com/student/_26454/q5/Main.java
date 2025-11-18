package com.student._26454.q5;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === VEHICLE RENTAL SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Name: ");
            String companyName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Company Phone (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Branch Name: ");
            String branchName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Location Code (>=3 chars): ");
            String locationCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Vehicle Type: ");
            String vehicleType = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Registration Number: ");
            String registrationNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Daily Rate: ");
            double dailyRate = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Rental Date: ");
            String rentalDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Return Date: ");
            String returnDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Rental Days: ");
            int rentalDays = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Rental Charge: ");
            double rentalCharge = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Penalty Charge: ");
            double penaltyCharge = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Transaction ID: ");
            String transactionId = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Total Charge: ");
            double totalCharge = scanner.nextDouble();
            
            RentalRecord record = new RentalRecord(id, createdDate, updatedDate, companyName,
                address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber,
                dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate,
                rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId, totalCharge);
            
            record.displayAllDetails();
            
        } catch (RentalDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

