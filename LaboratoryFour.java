// Mardaneil Josh A. Mercado
// CC2 1N-A
// September 26,2024

package com.mycompany.laboratoryfour;
import java.util.Scanner;

public class LaboratoryFour {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the total Ammount (PHP): ");
        double totalAmount = sc.nextDouble();
      
        double discount = 0.0;
        double finalPrice;
      
      if(totalAmount >= 1000 && totalAmount <= 5000 ){
          discount = .05;
        } else if (totalAmount >= 5001 && totalAmount <= 10000) {
            discount = 0.1;
        } else if (totalAmount >= 10000) {
            discount = .15;
        }
      
         finalPrice = totalAmount - (totalAmount * discount);
         System.out.println(finalPrice);
    }
}
    
       