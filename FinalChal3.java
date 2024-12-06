/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalchal3;

import java.util.Scanner;

public class FinalChal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: One-dimensional array for student names
        String[] students = new String[5];

        // Step 2: Two-dimensional array for grades (5 students, 3 subjects each)
        double[][] grades = new double[5][3];

        // Input: Get student names and grades
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();

            System.out.println("Enter grades for " + students[i] + " in 3 subjects:");
            for (int j = 0; j < 3; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                grades[i][j] = sc.nextDouble();
            }
            sc.nextLine(); // Consume the newline character
        }

        // Output: Display each student's name and average grade
        System.out.println("\nStudent Grades Summary:");
        for (int i = 0; i < students.length; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += grades[i][j];
            }
            double average = sum / 3;
            System.out.printf("%s's Average Grade: %.2f%n", students[i], average);
        }

        sc.close();
    }
}

