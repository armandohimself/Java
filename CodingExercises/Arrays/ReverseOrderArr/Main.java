package CodingExercises.Arrays.ReverseOrderArr;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = randomArrayGenerator(10);
        
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        
        int[] reversedArr = reverseArray(arr);
        
        System.out.println(Arrays.toString(reversedArr));

    }

    public static int[] randomArrayGenerator(int arrayLength) {
        // Generate a random number between 0-99
        Random rand = new Random(100);

        // Generate an array with a specified length
        int[] generatedArr = new int[arrayLength];

        // Iterate over the length of the new array
        for (int i = 0; i < arrayLength; i++) {
            // Input a random int into each index of the array
            generatedArr[i] = rand.nextInt(1000);
        }

        return generatedArr;
    }

    public static int[] reverseArray(int[] orderedArr) {
        int[] reverseArray = new int[orderedArr.length];
        int counter = 0;

        for(int i = orderedArr.length - 1; i >= 0; i--) {
            reverseArray[counter] = orderedArr[i];
            counter++;
        }

        return reverseArray;
    }
}