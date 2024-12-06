
package com.mycompany.finalchal5booking;
// Custom Exception Class
class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}

// Main Program
public class FinalChal5Booking {
    public static void main(String[] args) {
        int totalSeats = 10; // Total seats on the flight
        int bookedSeats = 10; // Seats already booked (modify for testing)

        try {
            if (bookedSeats >= totalSeats) {
                throw new NoSeatsAvailableException("No seats available for this flight.");
            }
            System.out.println("Seat booking successful! " + (totalSeats - bookedSeats) + " seat(s) remaining.");
        } catch (NoSeatsAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
