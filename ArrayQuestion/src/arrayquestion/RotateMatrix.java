/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayquestion;

/**
 
Rotate Matrix   Leetcode Question- 48
Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.

DO NOT allocate another 2D matrix and do the rotation.


 * @author muska
 */
public class RotateMatrix {
    public boolean rotateMatrix(int[][] matrix) {
        // Check if the matrix is empty or not square
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        int n = matrix.length;

        // Rotate the matrix layer by layer
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last - offset][first];
                matrix[last - offset][first] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }

    // Method to print the matrix
    public void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");   //Complexity:- O(N^2)
            }
            System.out.println();
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        RotateMatrix rm = new RotateMatrix();
        
        // Example 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        rm.printMatrix(matrix);

        // Rotate the matrix
        rm.rotateMatrix(matrix);

        System.out.println("Matrix after 90 degrees rotation:");
        rm.printMatrix(matrix);
    }
}
