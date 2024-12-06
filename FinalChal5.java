
package com.mycompany.finalchal5;

// Custom Exception Class
class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

// Main Program
public class FinalChal5 {
    public static void main(String[] args) {
        int stock = 10; // Available stock
        int quantity = -5; // User-provided quantity (can modify for testing)

        try {
            if (quantity < 0 || quantity > stock) {
                throw new InvalidQuantityException("Invalid quantity. Please enter a value between 0 and " + stock + ".");
            }
            System.out.println("You have successfully added " + quantity + " item(s) to your cart.");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

