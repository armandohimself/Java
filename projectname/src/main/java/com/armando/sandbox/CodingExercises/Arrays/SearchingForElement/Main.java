package com.armando.sandbox.CodingExercises.Arrays.SearchingForElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        // Start with a sorted array
        int[] arrayExample = {1, 2, 3, 4, 5, 6 ,7 ,8};

        //! Using Binary Search
        int result = Arrays.binarySearch(arrayExample, 5);
        System.out.println(String.format("Your key is at index %d of the array you just passed", result));
    }
}
