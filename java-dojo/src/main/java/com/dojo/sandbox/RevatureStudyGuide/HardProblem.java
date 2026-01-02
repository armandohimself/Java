package com.armando.sandbox.RevatureStudyGuide;

import java.util.Arrays;

public class HardProblem {

    public static String advancedArrayOperations(int[] arr1, int[] arr2) {
        int newLengthArr = arr1.length + arr2.length;
        int[] combinedArr = Arrays.copyOf(arr1, newLengthArr);
        int counter = 0;

        for (int i = newLengthArr - arr2.length; i < newLengthArr; i++) {
            combinedArr[i] = arr2[counter];
            counter++;
        }
        // Your implementation here
        Arrays.sort(combinedArr);

        int[] tempArr = new int[combinedArr.length];
        int uniqueIndex = 0;

        for(int i = 0; i < tempArr.length - 1; i++) {
            if(tempArr[i] != combinedArr[i + 1]) {
                tempArr[uniqueIndex++] = combinedArr[i];
            }
        }

        tempArr[uniqueIndex++] = combinedArr[combinedArr.length - 1];
        
        int[] finalArr = Arrays.copyOf(tempArr, uniqueIndex);
        
        return Arrays.toString(finalArr); // Replace null with your solution
    }

    public static void main(String[] args) {
        // Test cases
        int[] input1 = {1, 2, 3};
        int[] input2 = {3, 4, 5};

        System.out.println(advancedArrayOperations(input1, input2));
        // Expected: Resulting Array: [1, 2, 3, 4, 5], contains 5: true
    }
}


/*
**Hard Problem:**
Write a method that takes two arrays of integers as input and performs the following:
1. Combine the two arrays into one using `Arrays.copyOf` and `System.arraycopy`.
2. Sort the combined array using `Arrays.sort`.
3. Remove duplicate values from the array manually.
4. Check if the combined array contains a specific number (e.g., 5) using `Arrays.binarySearch`.
5. Return the resulting array as well as whether the number was found.

**Requirements:**
- Use `Arrays.copyOf`, `System.arraycopy`, `Arrays.sort`, and `Arrays.binarySearch`.

**Example:**
Input: [1, 2, 3], [3, 4, 5]  
Output: Resulting Array: [1, 2, 3, 4, 5], contains 5: true

**Time Estimate:** 30-50 minutes
*/