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
// Using bitwise operator
public class EvenOdd2 {
    
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        // Check if the number is even or odd using bitwise operator
        if ((number & 1) == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        

    }
}
    