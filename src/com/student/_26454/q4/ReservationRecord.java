package com.student._26454.q4;

public final class ReservationRecord extends Feedback {
    private static final String STUDENT_ID = "26454";
    
    public ReservationRecord(long id, String createdDate, String updatedDate, String hotelName,
                            String address, String phoneNumber, String email, String roomNumber,
                            String roomType, double pricePerNight, String customerName,
                            String customerEmail, String contactNumber, String bookingDate,
                            String checkInDate, String checkOutDate, String serviceName,
                            double serviceCost, String paymentMethod, String paymentDate,
                            double roomCharge, double serviceCharge, double totalBill,
                            int rating, String comments) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
              roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber,
              bookingDate, checkInDate, checkOutDate, serviceName, serviceCost,
              paymentMethod, paymentDate, roomCharge, serviceCharge, totalBill, rating, comments);
    }
    
    public double generateBill() {
        return getRoomCharge() + getServiceCharge();
    }
    
    public void displayAllDetails() {
        System.out.println(STUDENT_ID + " ========== HOTEL RESERVATION SYSTEM ==========");
        System.out.println(STUDENT_ID + " Hotel Name: " + getHotelName());
        System.out.println(STUDENT_ID + " Address: " + getAddress());
        System.out.println(STUDENT_ID + " Phone: " + getPhoneNumber());
        System.out.println(STUDENT_ID + " Email: " + getEmail());
        System.out.println(STUDENT_ID + " Room Number: " + getRoomNumber());
        System.out.println(STUDENT_ID + " Room Type: " + getRoomType());
        System.out.println(STUDENT_ID + " Price Per Night: $" + getPricePerNight());
        System.out.println(STUDENT_ID + " Customer: " + getCustomerName());
        System.out.println(STUDENT_ID + " Customer Email: " + getCustomerEmail());
        System.out.println(STUDENT_ID + " Contact: " + getContactNumber());
        System.out.println(STUDENT_ID + " Booking Date: " + getBookingDate());
        System.out.println(STUDENT_ID + " Check-in Date: " + getCheckInDate());
        System.out.println(STUDENT_ID + " Check-out Date: " + getCheckOutDate());
        System.out.println(STUDENT_ID + " Service: " + getServiceName());
        System.out.println(STUDENT_ID + " Service Cost: $" + getServiceCost());
        System.out.println(STUDENT_ID + " Payment Method: " + getPaymentMethod());
        System.out.println(STUDENT_ID + " Payment Date: " + getPaymentDate());
        System.out.println(STUDENT_ID + " Room Charge: $" + getRoomCharge());
        System.out.println(STUDENT_ID + " Service Charge: $" + getServiceCharge());
        System.out.println(STUDENT_ID + " Total Bill: $" + getTotalBill());
        System.out.println(STUDENT_ID + " Rating: " + getRating() + "/5");
        System.out.println(STUDENT_ID + " Comments: " + getComments());
        System.out.println(STUDENT_ID + " =================================================");
        System.out.println(STUDENT_ID + " Generated Bill: $" + String.format("%.2f", generateBill()));
        System.out.println(STUDENT_ID + " =================================================");
    }
}

