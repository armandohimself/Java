package com.armando.sandbox.RevatureStudyGuide;

import java.util.Scanner;

public class FindFirstCommonElement {

    public static Integer findCommon(Integer[] arr1, Integer[] arr2) {
        // Your implementation here
        return null; // Replace null with your solution
    }

    // DO NOT TOUCH THE CODE BELOW
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        Integer[] arr1 = new Integer[s1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int s2 = sc.nextInt();
        Integer[] arr2 = new Integer[s2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(findCommon(arr1, arr2));
    }
}

/*
 * Prompt:
Write the logic for the findCommon method to find and return the first common integer between two arrays (arr1 and arr2). Follow these steps:

Understand the Inputs and Outputs:

Inputs:
Two integer arrays: arr1 and arr2.
Output:
The first common integer found in both arrays. If no common integer exists, return null.
Think About the Logic:

Compare each element in arr1 with each element in arr2.
Use a nested loop to iterate through both arrays.
When a common integer is found, immediately return it.
Edge Cases to Consider:

One or both arrays are empty.
No common integers exist between the arrays.
Arrays contain duplicate integers.
Optimization (Optional):

If you’ve learned about sets or hash tables, consider using them to make the search faster instead of using nested loops.
 */
