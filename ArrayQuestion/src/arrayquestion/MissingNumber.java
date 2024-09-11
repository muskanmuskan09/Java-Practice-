/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayquestion;

/**
 *Missing Number
Write Java function called findMissingNumberInArray that takes an integer array containing n-1 
unique elements from a range of 1 to n, with one missing number, and returns the missing number.
Example
myArray = {1,2,3,4,6}
findMissingNumberInArray(myArray, 6) // 5
Hint:
Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.

  

 * @author muska
 */
// This code is having O(N)

public class MissingNumber {
    static int findMissingNumberInArray(int[] arr) {
       int n=arr.length;// Number of elements in the array
       int sum=0;  // Initialize sum of array elements
       
     // Calculate the expected sum of the first n + 1 natural numbers
    int totalSum=((n * (n + 1)) / 2 );
    // Add each element to sum
    for(int i=0;i<n;i++){
        sum+=i;// Add each element to sum
    }
    // The missing number is the difference between totalSum and sum
    return totalSum-sum;
  }
    // Main method to test the findMissingNumberInArray method
public static void main(String[] args) {
        // Test array
        int[] array = {1, 2, 3, 4, 6}; // Example array with missing number 3
        
        
        // Call the method to find the missing number
        int missingNumber = findMissingNumberInArray(array);
        
        // Print the result
        System.out.println("The missing number is: " + missingNumber);
    }
    
}
