/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayquestion;

import java.util.Arrays;

/**
 *
Remove Duplicates from Sorted Array - LeetCode 26
Given a sorted array number, remove the duplicates in-place such that each element appears only once and 
returns the new length. 
Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Input: number = [1, 1, 2] 
Output: 2

 * @author muska
 */
public class RemoveDuplicateValue {

    public static int[] removeDuplicates(int[] array) {

        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
           boolean isDuplicate = false;
            for (int j = 0; j < index; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                uniqueArray[index++]=array[i];
            }

        }
        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 3, 4, 5};
        int[] uniqueArray = removeDuplicates(array);
        System.out.println(Arrays.toString(uniqueArray)); // Output: [1, 2, 3, 4, 5]
    }

}
/*
public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            // Check in the already processed part of the array (from 0 to index)
            for (int j = 0; j < index; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        // Return the array with only the unique elements
        return Arrays.copyOf(uniqueArray, index);
}
*/
