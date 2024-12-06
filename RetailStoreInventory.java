/*
Final Challenge
Mardaneil Josh A. Mercado
11/06/2024
*/
package com.mycompany.retailstoreinventory;
import java.util.Scanner;

public class RetailStoreInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Arrays to store stock levels and prices
        int[] stockLevels = new int[10];
        double[] prices = new double[10];
        
        // Input: Get stock levels and prices for each product
        System.out.println("Enter stock levels and prices for 10 products:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Product " + (i + 1) + " stock level: ");
            stockLevels[i] = sc.nextInt();
            System.out.print("Product " + (i + 1) + " price: ");
            prices[i] = sc.nextDouble();
        }

        // Calculate total stock value, average value, highest and lowest values
        double totalValue = 0;
        double highestValue = 0;
        double lowestValue = Double.MAX_VALUE;
        
        for (int i = 0; i < 10; i++) {
            double productValue = stockLevels[i] * prices[i];
            totalValue += productValue;
            if (productValue > highestValue) {
                highestValue = productValue;
            }
            if (productValue < lowestValue) {
                lowestValue = productValue;
            }
        }
        
        double averageValue = totalValue / 10;

        // Output the results
        System.out.printf("Total stock value: $%.2f%n", totalValue);
        System.out.printf("Average stock value: $%.2f%n", averageValue);
        System.out.printf("Highest stock value: $%.2f%n", highestValue);
        System.out.printf("Lowest stock value: $%.2f%n", lowestValue);
        
        sc.close();
    }
}

