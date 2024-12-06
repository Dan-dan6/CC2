// Mardaneil Josh A. Mercado
// CC2 
// Octuber 10, 2024
// Laboratory Challenge 5


package com.mycompany.lab5;
import java.util.Scanner; // to allow scanner in our code

public class Lab5 { // Class name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For scanner activation
        int choice, quantity; // Declaration of users input
        double totalBill = 0; // Declaration
        
        //Displays the overall Menu for the user to choose
        System.out.println("Welcome! Here's the MENU");
        System.out.println("1. Burger \t\t  : PHP  100");
        System.out.println("2. Fries \t\t  : PHP  50");
        System.out.println("3. Soda  \t\t  : PHP  30");
        System.out.println("4. Icecream \t\t  : PHP  45");
        System.out.println("5. Exit");
        
        //If the user proceed with its choices 
        System.out.println("Select a number of your choice");
        choice = sc.nextInt();//user's input
        
        //Declaration for the input of the user 
        switch (choice) // The system will now choose and select the number that the user input
            // The system will now input the user's selected number
        {
            case 1 -> {
                // The system will display this statement if the user select number 1
                System.out.println("Enter a quantity");
                quantity = sc.nextInt(); // determining the user's input
                totalBill = 100 * quantity; // calculates the price and the users input 
                System.out.println("You ordered Burger."); // Success
                // Stop the loop
            }
            case 2 -> {
                //The system will display this statement if the user select number 2
                System.out.println("Enter a quantity");
                quantity = sc.nextInt();
                totalBill = 50 * quantity;
                System.out.println("You ordered Fries.");
            } 
                
            case 3 -> {
                //The system will display this statement if the user select number 3
                System.out.println("Enter a quantity");
                quantity = sc.nextInt();
                totalBill = 30 * quantity;
                System.out.println("You ordered Soda.");
            }
                
            case 4 -> {
                //The system will display this statement if the user select number 4
                System.out.println("Enter a quantity");
                quantity = sc.nextInt();
                totalBill = 45 * quantity;
                System.out.println("You ordered Ice Cream.");
            }
                
            case 5 -> {
                //The system will display this statement if the user select number 5
                System.out.println("Thank You Stay Safe!");
                return; // For the next user 
            }
            default -> {
                System.out.println("Error"); // If the user input a number more than 6
                return;// Try again       
            }
           }

         System.out.println("Total amount : " + totalBill + "PHP");// Calculates the overall price and quantity of the user's order
         
         //close the scanner 
         sc.close();
    }
}
