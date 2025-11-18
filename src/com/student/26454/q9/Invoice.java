package com.student._26454.q9;

public class Invoice extends Payment {
    private double totalFare;
    
    public Invoice(long id, String createdDate, String updatedDate, String airlineName,
                   String address, String contactEmail, String flightNumber,
                   String destination, String departureTime, String passengerName,
                   String passportNumber, String nationality, String seatNumber,
                   String seatType, String ticketNumber, double price,
                   double baggageWeight, double baggageFee, String paymentDate,
                   String paymentMode, double totalFare) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime, passengerName, passportNumber,
              nationality, seatNumber, seatType, ticketNumber, price, baggageWeight,
              baggageFee, paymentDate, paymentMode);
        if (totalFare <= 0) {
            throw new AirlineDataException("Total fare must be greater than 0");
        }
        this.totalFare = totalFare;
    }
    
    public double getTotalFare() { return totalFare; }
    public void setTotalFare(double totalFare) throws AirlineDataException {
        if (totalFare <= 0) {
            throw new AirlineDataException("Total fare must be greater than 0");
        }
        this.totalFare = totalFare;
    }
}

