
package com.mycompany.lab6;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number of Students");
         sc.nextInt();
         
         System.out.println("Enter the total number of students");
         int totalNumberStudents = sc.nextInt();
         
         int presentCount= 0;
         int absentCount = 0;
         
         for(int i=1; i <= totalNumberStudents; i++){
             System.out.println("Is Student 1 present?" + "(Y/N): ");
                char attendance = sc.next().toUpperCase().charAt(0);
                    
                if (attendance == 'Y'){
                    presentCount ++;
                } else if(attendance == 'N') 
                    absentCount ++;
                    {
                  System.out.println("Is Student 2 Present?");
                    
                     }
                    System.out.println("Total Present: " +  presentCount);
                    System.out.println("Total Absent: " +  absentCount);
            }
    }
    
}
