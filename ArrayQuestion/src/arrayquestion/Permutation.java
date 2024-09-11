/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayquestion;

/**
 Permutation
Your are given two integer arrays. Write a program to check if they are permutation of each other.

Example

int[] array1 = {1,2,3,4,5};
int[] array2 = {5,1,2,3,4};
permutation(array1, array2)
Output

true
 * @author muska
 */
public class Permutation {
    /**
     * Checks if two arrays are permutations of each other by comparing their sums and products.
     *
     * @param array1 The first array.
     * @param array2 The second array.
     * @return true if array1 is a permutation of array2, false otherwise.
     */
    public boolean permutation(int[] array1, int[] array2) {
        // Check if arrays have the same length
        if (array1.length != array2.length) {
            return false; // Arrays with different lengths cannot be permutations of each other
        }

        // Initialize variables to hold sum and product of array elements
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;

        // Calculate sum and product for both arrays
        for (int i = 0; i < array1.length; i++) { // Complexity :- O(N)
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }

        // Check if both the sum and product of the arrays are equal
        // If both are equal, arrays might be permutations of each other
        return sum1 == sum2 && mul1 == mul2;
    }

    public static void main(String[] args) {
        Permutation exercise = new Permutation();
        
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1}; // This is a permutation of array1
        
        int[] array3 = {1, 2, 3, 5}; // Not a permutation of array1
        
        System.out.println("Are array1 and array2 permutations of each other? " + exercise.permutation(array1, array2)); // Expected output: true
        System.out.println("Are array1 and array3 permutations of each other? " + exercise.permutation(array1, array3)); // Expected output: false
    }
}
