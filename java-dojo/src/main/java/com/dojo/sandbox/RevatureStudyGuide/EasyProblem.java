package com.armando.sandbox.RevatureStudyGuide;

/*
**Easy Problem:**
Write a method that takes an array of integers as input, sorts it in ascending order, and then reverses it. Return the reversed array as output.

**Requirements:**
- Use the `Arrays.sort()` method to sort the array.
- Reverse the sorted array by iterating through it manually.

**Example:**
Input: [3, 1, 2]  
Output: [3, 2, 1]

**Time Estimate:** 5-15 minutes
*/
import java.util.Arrays;

public class EasyProblem {

    public static int[] sortAndReverse(int[] arr) {
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int[] reversedArr = new int[arr.length];
        int counter = 0;

        for (int i = reversedArr.length - 1; i >= 0; i --) {
            //System.out.println("arr[" + i + "] is " + arr[i]);
            reversedArr[counter] = arr[i];
            counter++;
        }
        // Your implementation here
        return reversedArr; // Replace null with your solution
    }

    public static void main(String[] args) {
        // Test cases
        int[] input1 = {3, 1, 2};
        int[] input2 = {5, 4, 7, 1};

        System.out.println("Reversed Sorted Array: " + Arrays.toString(sortAndReverse(input1))); // Expected: [3, 2, 1]
        System.out.println("Reversed Sorted Array: " + Arrays.toString(sortAndReverse(input2))); // Expected: [7, 5, 4, 1]
    }
}
