package com.student._26454.q9;

public final class TicketRecord extends Invoice {
    private static final String STUDENT_ID = "26454";
    
    public TicketRecord(long id, String createdDate, String updatedDate, String airlineName,
                       String address, String contactEmail, String flightNumber,
                       String destination, String departureTime, String passengerName,
                       String passportNumber, String nationality, String seatNumber,
                       String seatType, String ticketNumber, double price,
                       double baggageWeight, double baggageFee, String paymentDate,
                       String paymentMode, double totalFare) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime, passengerName, passportNumber,
              nationality, seatNumber, seatType, ticketNumber, price, baggageWeight,
              baggageFee, paymentDate, paymentMode, totalFare);
    }
    
    public double generateInvoice() {
        return getPrice() + getBaggageFee();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== AIRLINE TICKETING SYSTEM ==========");
        System.out.println(STUDENT_ID + " Airline Name: " + getAirlineName());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Contact Email: " + getContactEmail());
        System.out.println(STUDENT_ID + " Flight Number: " + getFlightNumber());
        System.out.println(STUDENT_ID + " Destination: " + getDestination());
        System.out.println(STUDENT_ID + " Departure Time: " + getDepartureTime());
        System.out.println(STUDENT_ID + " Passenger: " + getPassengerName());
        System.out.println(STUDENT_ID + " Passport: " + getPassportNumber());
        System.out.println(STUDENT_ID + " Nationality: " + getNationality());
        System.out.println(STUDENT_ID + " Seat Number: " + getSeatNumber());
        System.out.println(STUDENT_ID + " Seat Type: " + getSeatType());
        System.out.println(STUDENT_ID + " Ticket Number: " + getTicketNumber());
        System.out.println(STUDENT_ID + " Price: $" + getPrice());
        System.out.println(STUDENT_ID + " Baggage Weight: " + getBaggageWeight() + " kg");
        System.out.println(STUDENT_ID + " Baggage Fee: $" + getBaggageFee());
        System.out.println(STUDENT_ID + " Payment Date: " + getPaymentDate());
        System.out.println(STUDENT_ID + " Payment Mode: " + getPaymentMode());
        System.out.println(STUDENT_ID + " Total Fare: $" + getTotalFare());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Generated Invoice: $" + String.format("%.2f", generateInvoice()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

