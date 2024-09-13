/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posneg;

import java.util.Scanner;

/**
 *
 * @author muska
 */
// Using ternary Operator
public class PosNeg2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        //Condition to check if the number is negative or positive

        if (num == 0) {
            System.out.println("Zero");
        } else {
            String result = num > 0 ? "The number is positive" : "The number is negative";
            System.out.println(result);
        }
    }
}
