/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evenodd;

import java.util.Scanner;

/**
 *
 * @author muska
 */
// Brute force approach
public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0 ) {
            System.out.println("Nmber is even: " + number);
        } else {
            System.out.println("Nmber is odd: " + number);
        }
    }

}
