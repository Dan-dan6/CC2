// Mardaneil Josh A. Mercado
// 9/13/2024
// Laboratory challenge 3

package calcu;

import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variables to store price and quantity of three items
        double price1, price2, price3; //stores items 
        int quantity1, quantity2, quantity3; // stores quantity

        // Asking the user to input price and quantity for item 1
        System.out.print("Enter the price of item 1: ");
        price1 = input.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        quantity1 = input.nextInt();

        
        System.out.print("Enter the price of item 2: ");
        price2 = input.nextDouble(); // reads the users input
        System.out.print("Enter the quantity of item 2: ");
        quantity2 = input.nextInt(); // reads the users input 

       
        System.out.print("Enter the price of item 3: ");
        price3 = input.nextDouble();// reads the users input
        System.out.print("Enter the quantity of item 3: ");
        quantity3 = input.nextInt();// reads the users input

        //total of all items 
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);

        // Applying discount (5% of subtotal)
        double discount = subtotal * 0.05;

        // Subtotal after applying the discount
        double discountedAmount = subtotal - discount;

        // Calculating sales tax (12% of discounted amount)
        double salesTax = discountedAmount * 0.12;

        // Final total to be paid (discounted amount + sales tax)
        double finalTotal = discountedAmount + salesTax;

        // Displaying the results
        System.out.println("\nSubtotal       : PHP " + String.format("%.2f", subtotal));
        System.out.println("Discount       : PHP " + String.format("%.2f", discount));
        System.out.println("Sales Tax      : PHP " + String.format("%.2f", salesTax));
        System.out.println("Final Total    : PHP " + String.format("%.2f", finalTotal));

        // Closing the scanner object
        input.close();
    }
}
