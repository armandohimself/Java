package CodingExercises.Arrays.ReverseArrayExamples;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3 ,4 , 5, 6};

        // My code which doesn't mutate
        System.out.println("Testing reverseArray");
        reverseArray(originalArray);
        System.out.println("Original array should be {1, 2, 3 ,4 , 5, 6} \n" + Arrays.toString(originalArray));

        // Instructors code which mutated the array
        // System.out.println("Testing reverse");
        // reverse(originalArray);
        // System.out.println("Original array should be {1, 2, 3 ,4 , 5, 6} \n" + Arrays.toString(originalArray));

        // Next example using an advanced for loop
        //! Be careful when uncommenting code, above changes the reference to the original array
        System.out.println("Testing reverseCopy");
        reverseCopy(originalArray);
    }

    //! Example I came up with from memory
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        int counter = 0;

        for(int i  = array.length - 1; i >= 0; i--) {
            reversedArray[counter] = array[i];
            counter++;
        }

        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
    }

    //! Instructor's example
    public static void reverse(int[] array) {
        //! This unfortunately mutated the array which may not be desirable depending on the situation 
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++)  {
            System.out.println(" -->> " + Arrays.toString(array));
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(" -->> " + Arrays.toString(array));
     }

     //! Second example that copies the length of a given array and uses advanced for loop
     private static int[] reverseCopy(int[] array) {

        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }

        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
     }

}