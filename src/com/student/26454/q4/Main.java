package com.student._26454.q4;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === HOTEL RESERVATION SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hotel Name: ");
            String hotelName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hotel Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hotel Phone (10 digits): ");
            String phoneNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Hotel Email: ");
            String email = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Room Number: ");
            String roomNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Room Type: ");
            String roomType = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Price Per Night: ");
            double pricePerNight = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Customer Email: ");
            String customerEmail = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Booking Date: ");
            String bookingDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Check-in Date: ");
            String checkInDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Check-out Date: ");
            String checkOutDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Service Name: ");
            String serviceName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Service Cost: ");
            double serviceCost = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Date: ");
            String paymentDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Room Charge: ");
            double roomCharge = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Service Charge: ");
            double serviceCharge = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Total Bill: ");
            double totalBill = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Rating (1-5): ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Comments: ");
            String comments = scanner.nextLine();
            
            ReservationRecord record = new ReservationRecord(id, createdDate, updatedDate, hotelName,
                address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName,
                customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName,
                serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill,
                rating, comments);
            
            record.displayAllDetails();
            
        } catch (HotelDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

