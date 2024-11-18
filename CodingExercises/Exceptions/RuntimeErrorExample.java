package CodingExercises.Exceptions;

import java.util.Arrays;

public class RuntimeErrorExample {
    
    public static void main(String[] args) {
        // Create an array with 3 elements
        int[] numbers = {1, 2, 3};

        // Try to access an index that doesn't exist
        System.out.println(numbers[5]); // This will throw an IndexOutOfBoundsException
    }

}