/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstnaturalnumber;

import java.util.Scanner;

/**
 *
 * @author muska
Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. 
To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion
 */


//Using for Loop
public class FirstNaturalNumber {

    /**
     * @param args the command line arguments
     */
    static int getSum(int number){
        if(number==0){
            return 0;
        }
        return number+getSum(number-1);
    }
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;
        for(int i=0;i<=number;i++){
            sum+=i;
        }
        System.out.println("The total sum of first natural number are: "+sum);
        
//Method 2: Using Formula for the Sum of Nth Term

        int formula=(number*(number+1)/2);
        System.out.println("The sum using formula is : "+formula);
        
//Method 3: Using Recursion

  int result=getSum(number);
  System.out.println("The sum using recursion is: "+result);
  
  
        
    }
    
}
