package com.armando.sandbox.CodingExercises.Arrays.MinimumElement;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] arrayResults = readIntegers();
        System.out.println(Arrays.toString(arrayResults));

        int minValue = findMin(arrayResults);
        System.out.println("Min number in array is: " + minValue);
    }
    
    //! Read an integer from the user
    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        boolean continueReading = true;
        int[] intArray = new int[0];
        int input = 0;
        int count = 0;

        System.out.println("Enter a list of integer; press a letter to exit");
        while (continueReading) {
            // Assume we want to stop reading for else condition to hit
            continueReading = false;

            // Continue if there is still a valid input
            if (scanner.hasNextInt()) {

                // Assume the input is an integer
                input = scanner.nextInt();

                // Create a new array with an extra index than count
                int[] newArray = new int[count + 1];

                // Copy what's in intArray (has less items) into newArray (has extra index for input)
                for(int i = 0; i < count; i++) {
                    // Loop and store
                    newArray[i] = intArray[i];
                }
                
                // At the last count add the input in the sequence stream
                newArray[count] = input;
                
                // Update the reference so that if we continue looping then we grab all the numbers
                intArray = newArray;

                // Increment the count
                count++;

                // Assume we want to ask for one more integer/ get next input from user
                continueReading = true;

                // We tell the user we are leaving this method
            } else {
                System.out.println("Exited entering integers. Good bye!");
            }
        }

        scanner.close();
        return intArray;
    }


    public static int findMin(int[] array) {
        int MIN_VALUE = Integer.MAX_VALUE;

        for( int el : array) {
            if (el < MIN_VALUE) {
                MIN_VALUE = el;
            }
        }
        return MIN_VALUE;
    }
}
/*
 
public class MinimumElement {
    
    private static int readInteger() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }
    
    private static int[] readElements(int count) {
        
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
    
    private static int findMin(int[] array) {
 
        int cmv = Integer.MAX_VALUE;                 // 1
        for (int i = 0; i < array.length; i++) {     // 2
            if (array[i] < cmv) {                    // 3
                cmv = array[i];                      // 4
            }     
        }
        return cmv;
    }
}

 */
