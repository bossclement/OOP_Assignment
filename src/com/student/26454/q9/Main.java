package com.student._26454.q9;

import java.util.Scanner;

public class Main {
    private static final String STUDENT_ID = "26454";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println(STUDENT_ID + " === AIRLINE TICKETING SYSTEM - DATA ENTRY ===");
            
            System.out.print(STUDENT_ID + " Enter ID: ");
            long id = scanner.nextLong();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Created Date: ");
            String createdDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Updated Date: ");
            String updatedDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Airline Name: ");
            String airlineName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Flight Number: ");
            String flightNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Destination: ");
            String destination = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Departure Time: ");
            String departureTime = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Passenger Name: ");
            String passengerName = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Passport Number: ");
            String passportNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Nationality: ");
            String nationality = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Seat Number: ");
            String seatNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Seat Type (Economy/Business): ");
            String seatType = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Price: ");
            double price = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Baggage Weight: ");
            double baggageWeight = scanner.nextDouble();
            
            System.out.print(STUDENT_ID + " Enter Baggage Fee: ");
            double baggageFee = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Date: ");
            String paymentDate = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Payment Mode: ");
            String paymentMode = scanner.nextLine();
            
            System.out.print(STUDENT_ID + " Enter Total Fare: ");
            double totalFare = scanner.nextDouble();
            
            TicketRecord record = new TicketRecord(id, createdDate, updatedDate, airlineName,
                address, contactEmail, flightNumber, destination, departureTime, passengerName,
                passportNumber, nationality, seatNumber, seatType, ticketNumber, price,
                baggageWeight, baggageFee, paymentDate, paymentMode, totalFare);
            
            record.displayAllDetails();
            
        } catch (AirlineDataException e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println(STUDENT_ID + " ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}

