/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author muska
 */
public class LeapYear {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Method 1
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%400==0||(number%4==0 && number%100!=0)){
            System.out.println(number+" is a Leap Year");
        }else{
            System.out.println(number+" is not a Leap Year");
        }
        
        
         // MEthod-2  The year must be divisible by 4 but not 100.
        int year = 2020;
        boolean leap;

        if (year % 400 == 0)
            leap = true;

        else if(year % 4 == 0 && year % 100 != 0)
            leap = true;

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    }
    
}
