// Laboratory Challenge 7
// Mardaneil Josh A. Mercado
// Anna Rhodara Quitaleg

package com.mycompany.labchall7;
import java.util.Scanner;

public class LabChall7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        boolean isValid;

        System.out.println("Password must be at least 8 characters long, contain at least one uppercase letter, and one number.");

        do {
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            isValid = validatePassword(password);

            if (!isValid) {
                System.out.println("Invalid password. Please try again.");
            }
        } while (!isValid);

        System.out.println("Your password is valid!");
        sc.close();
    }

    // Function to validate password
    private static boolean validatePassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }

            // If both conditions are met, no need to continue checking
            if (hasUppercase && hasNumber) {
                return true;
            }
        }
        return false; // Return false if conditions are not met
    }
}

//use JOPtionPane on FChall 5