/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxnumber;

import java.util.Scanner;

/**
 *
 * @author muska
 * 
Find the Greatest of the Two Numbers in Java
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and 
Find the Greatest of the Two Numbers. To do so we’ll use if-else statements and print the output. 
Some methods to solve the above-mentioned Problem are given below.

Method 1: Using if-else Statements
Method 2: Using Ternary Operator
Method 3: Using inbuilt max Function
 */
public class MaxNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Enter a number");
        int number2 = scanner.nextInt();
        
        //This is a first approach using if-else
        if (number1 == number2) {
            System.out.println("Numbers are equal");
        } else if (number1 < number2) {
            System.out.println("The second number is greater : " + number2);
        } else {
            System.out.println("The first number is greater : " + number1);
        }
        int result=number1>number2?number1:number2;
        System.out.println("The Max number is: "+result);
        
        int result1=Math.max(number1, number2);
        System.out.println("The max number is : "+ result1);
    }

}
