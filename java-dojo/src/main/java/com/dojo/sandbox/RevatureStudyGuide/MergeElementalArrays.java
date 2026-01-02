package com.dojo.sandbox.RevatureStudyGuide;

import java.util.Arrays;

public class MergeElementalArrays {

    public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] finalArr = Arrays.copyOf(firstArray, firstArray.length);

        for(int i = 0; i < finalArr.length; i++) {
            finalArr[i] = firstArray[i] + secondArray[i];
        }

        return finalArr;
    }

    public static void main(String[] args) {
        // Test cases
        int[][] testCase1 = {{1, 2, 3}, {4, 5, 6}}; // Expected: [5, 7, 9]
        int[][] testCase2 = {{1, 1, 1, 1}, {2, 2, 2, 2}}; // Expected: [3, 3, 3, 3]
        int[][] testCase3 = {{1, 2, 3, 4, 5}, {5, 4, 3, 2, 1}}; // Expected: [6, 6, 6, 6, 6]
        int[][] testCase4 = {{10, 20, 30}, {-10, -20, -30}}; // Expected: [0, 0, 0]
        int[][] testCase5 = {{0, 1, 2, 3}, {3, 2, 1, 0}}; // Expected: [3, 3, 3, 3]

        // Array of test cases
        int[][][] testCases = {testCase1, testCase2, testCase3, testCase4, testCase5};

        // Iterate through each test case
        for (int i = 0; i < testCases.length; i++) {
            int[] result = mergeArrays(testCases[i][0], testCases[i][1]);
            System.out.println("Test Case " + (i + 1) + ": " + Arrays.toString(result));
        }
    }
}

/*
**Challenge: Merge Elemental Arrays**
**File Name:** MergeElementalArrays.java

In the mystical land of Arraydonia, there exist magical stones that hold the energies of the elements. 
There are two ancient temples - the Temple of Fire and the Temple of Water. Each temple contains an 
array of elemental stones, with each stone holding a different intensity of elemental power.

Your task is to fulfill the prophecy by merging the energies of the stones from both temples. 
Write a method `mergeArrays` that takes two integer arrays of the same length as input 
and returns a new array containing the sum of powers from the corresponding stones.

**Input:**
1. Two arrays of equal length, each containing the elemental powers of the stones.

**Output:**
A single array of the same length, where each element is the sum of the powers of the corresponding 
stones in the two input arrays.

**Edge Cases:**
1. Arrays containing all zeroes (e.g., [0, 0, 0] and [0, 0, 0]).
2. Arrays with negative and positive numbers (e.g., [10, 20, -30] and [-10, -20, 30]).
3. Large arrays to test efficiency.
4. Single-element arrays (e.g., [42] and [58] → [100]).

**Example Input/Output:**
Input:
[1, 2, 3]
[4, 5, 6]
Output:
[5, 7, 9]

Input:
[1, 1, 1, 1]
[2, 2, 2, 2]
Output:
[3, 3, 3, 3]

Good luck, young prodigy! May your code unite the elements and fulfill the prophecy.
*/
