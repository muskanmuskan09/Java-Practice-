/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posneg;
import java.util.Scanner;
/**
 *
 * @author muska
 * 
 * So here, In this question, I have to find whether a number is positive or negative using 3 ways 
 * 1. Brute force
 * 2. Nested If-else
 * 3. Ternary Operator
 */

// This is the first approach Brute Force

public class PosNeg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=scanner.nextInt();
        if(input<0){
            System.out.println("Number is Negative");
        }else if(input>0){
            System.out.println("Number is Positive");      
        }else{
            System.out.println("Number is Zero");      
        }
    }
    
}
