package CodingExercises.Arrays.MinimumElement;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {

    }

    public static int[] readIntegers() {
        System.out.println("Enter a list of integers, separated by commas:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        scanner.close();

        return values;
    }


    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        
        for(int el : array) {
            if (el < min) {
                min = el;
            }
        }

        return min;
    }

}
