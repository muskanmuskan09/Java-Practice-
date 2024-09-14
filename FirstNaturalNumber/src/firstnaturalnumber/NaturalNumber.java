/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstnaturalnumber;

import java.util.Scanner;

/**
 *
 * @author muska
 */
public class NaturalNumber {
    
    public static void main(String[] agrs){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("Enter a number");
        int number2 = scanner.nextInt();
        int sum=0;
        for(int i=number1;i<=number2;i++){
            sum+=i;
        }
        System.out.println("The sum is: "+sum);
        
        /*
        
       For the given integer input intervals number1 and number2
       Initialize the required variables.
       Apply the given formula sum = b*(b+1)/2 – a*(a+1)/2 + a.
       Print the sum variable as output.
        */
          // Using formula
        int formulaSum = (number2 * (number2 + 1)) / 2 - ((number1 - 1) * number1) / 2;
        System.out.println("Sum using formula: " + formulaSum);
        //Using recursion
         int recursiveSum = getSum(number1, number2);
        System.out.println("Sum using recursion: " + recursiveSum);
        
        
    }
    static int getSum(int number1, int number2) {
        if (number1 > number2) {
            return 0; // base case
        }
        return number1 + getSum(number1 + 1, number2);
    }
}
