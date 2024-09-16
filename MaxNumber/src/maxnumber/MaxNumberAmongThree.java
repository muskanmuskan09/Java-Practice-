/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maxnumber;

import java.util.Scanner;

/**
 *
 * @author muska
 * 
Find the Greatest of the Three Numbers in Java
Given Three integer inputs number1, number2 and number3, the objective is ti write a code to Find the Largest of the Three Numbers
in Java Language. In this article we will see a  Java program to Find Greatest of three numbers. We will use if else 
conditions and ternary operator too to find the same. Here are some of the methods to solve the above mentioned problem,

Method 1: Using if-else Statements 2
Method 2: Using Ternary Operator
 
 */
public class MaxNumberAmongThree {
    
    public static void main(String[] args){
        
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Enter a number");
        int number2 = scanner.nextInt();
         System.out.println("Enter a number");
        int number3 = scanner.nextInt();
         if (number1 >= number2 && number1 >= number2)
        System.out.println (number1 + " is the greatest");

    //checking if num2 is greatest
    else if (number2 >= number1 && number2 >= number3)
        System.out.println (number2 + " is the greatest");

    //checking if num2 is greatest
    else if (number3 >= number1 && number3 >= number2)
        System.out.println (number3 + " is the greatest");
        
        
        
    }
}
