//Final Challege 2
//Mardaneil Josh A. Mercado
//11/20//24


package com.mycompany.finalchal2;

import java.util.Scanner;
public class FinalChal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Constants for number of cities and days
        final int cities = 3; // Number of cities being tracked
        final int days = 7;   // Number of days for temperature data

        // 2D array to store temperature data
        double[][] temperatures = new double[cities][days];

        
         //Collect daily temperature data from the user.
         
        System.out.println("Enter the daily temperatures for " + cities + " cities over " + days + " days:");
        for (int i = 0; i < cities; i++) {
            System.out.println("City " + (i + 1) + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temperatures[i][j] = sc.nextDouble();
            }
        }

        /**
         * calculate:
         * - Average temperature for each city.
         * - Highest temperature recorded for each city.
         */
        for (int i = 0; i < cities; i++) {
            double total = 0;             // Variable to store the sum of temperatures for the city
            double highest = Double.MIN_VALUE; // Variable to store the highest temperature for the city

            // Traverse the days to compute total and highest temperature
            for (int j = 0; j < days; j++) {
                total += temperatures[i][j];
                if (temperatures[i][j] > highest) {
                    highest = temperatures[i][j];
                }
            }

            // Calculate the average temperature
            double average = total / days;

            
              //Display the results for the current city.
             
            System.out.println("\nCity " + (i + 1) + " Analysis:");
            System.out.printf("Average Temperature: %.2f°C%n", average);
            System.out.printf("Highest Temperature: %.2f°C%n", highest);
        }

        // Close the scanner resource
        sc.close();
    }
}
