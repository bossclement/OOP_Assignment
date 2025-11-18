package com.student._26454.q9;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;
    
    public Baggage(long id, String createdDate, String updatedDate, String airlineName,
                   String address, String contactEmail, String flightNumber,
                   String destination, String departureTime, String passengerName,
                   String passportNumber, String nationality, String seatNumber,
                   String seatType, String ticketNumber, double price,
                   double baggageWeight, double baggageFee) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime, passengerName, passportNumber,
              nationality, seatNumber, seatType, ticketNumber, price);
        if (baggageWeight < 0) {
            throw new AirlineDataException("Baggage weight must be >= 0");
        }
        if (baggageFee < 0) {
            throw new AirlineDataException("Baggage fee must be >= 0");
        }
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }
    
    public double getBaggageWeight() { return baggageWeight; }
    public void setBaggageWeight(double baggageWeight) throws AirlineDataException {
        if (baggageWeight < 0) {
            throw new AirlineDataException("Baggage weight must be >= 0");
        }
        this.baggageWeight = baggageWeight;
    }
    public double getBaggageFee() { return baggageFee; }
    public void setBaggageFee(double baggageFee) throws AirlineDataException {
        if (baggageFee < 0) {
            throw new AirlineDataException("Baggage fee must be >= 0");
        }
        this.baggageFee = baggageFee;
    }
}

