/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayquestion;

/**
 *
 * 
Best Score
Given an array, write a function to get first, second best scores from the array and return it in new array.
* 
Array may contain duplicates.
Example
myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray) // {90, 87}
* 
* 
 * @author muska
 */
public class FindSecondHighest {

    // Method to find the top two scores in an array
    public static int[] findTopTwoScores(int[] array){
        int first = Integer.MIN_VALUE;  // Initialize first highest score
        int second = Integer.MIN_VALUE; // Initialize second highest score
        
        // Loop through the array to find the top two scores
        for(int i = 0; i < array.length; i++){
            if(array[i] > first){       // If current element is greater than first
                second = first;         // Update second to previous first
                first = array[i];       // Update first to current element
            } else if(array[i] > second && array[i] != first){ // If current element is greater than second
                second = array[i];      // Update second to current element
            }
        }
        
        return new int[]{first, second}; // Return the top two scores
    }

    // Main method to test the findTopTwoScores method
    public static void main(String[] args) {
        // Test array
        int[] array = {30, 50, 40, 20, 60};

        // Find top two scores
        int[] topTwoScores = findTopTwoScores(array);

        // Print the results
        System.out.println("First highest score: " + topTwoScores[0]);
        System.out.println("Second highest score: " + topTwoScores[1]);
    }
}
