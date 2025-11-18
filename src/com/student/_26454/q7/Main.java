package com.student._26454.q7;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === REAL ESTATE MANAGEMENT SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Agency Name: ");
            String agencyName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Location: ");
            String location = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Phone Number (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Agent Name: ");
            String agentName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Agent Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Property Code: ");
            String propertyCode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Property Type: ");
            String propertyType = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Seller Name: ");
            String sellerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Seller Contact Number: ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Buyer Name: ");
            String buyerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Buyer Email: ");
            String buyerEmail = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Agreement Date: ");
            String agreementDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Terms: ");
            String terms = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Date: ");
            String paymentDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Commission Rate: ");
            double commissionRate = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Commission Amount: ");
            double commissionAmount = scanner.nextDouble();
            
            RealEstateRecord record = new RealEstateRecord(id, createdDate, updatedDate, agencyName,
                location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType,
                price, sellerName, contactNumber, buyerName, buyerEmail, agreementDate, terms,
                paymentAmount, paymentDate, commissionRate, commissionAmount);
            
            record.displayAllDetails();
            
        } catch (RealEstateDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

