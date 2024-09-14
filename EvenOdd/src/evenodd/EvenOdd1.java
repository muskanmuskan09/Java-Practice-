/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author muska
 */

// Using ternary operator
public class EvenOdd1 {
   static public void main(String[] args){
         System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        String answer=number%2==0?"Number is even : ":"Number is odd : ";
        System.out.println(answer+number);
    }
}
