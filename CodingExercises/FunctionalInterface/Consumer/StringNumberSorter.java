package CodingExercises.FunctionalInterface.Consumer;

import java.util.Arrays;
import java.util.Comparator;

public class StringNumberSorter {
    public static void main(String[] args) {
        String[] arrayOfNumbers = {"1337", "42", "8080", "777"};

        Arrays.sort(arrayOfNumbers, (a, b) -> Integer.parseInt(a) - Integer.parseInt(b));
        System.out.println("ASC Order: " + Arrays.toString(arrayOfNumbers));
        
        Arrays.sort(arrayOfNumbers, (a, b) -> Integer.parseInt(b) - Integer.parseInt(a));
        System.out.println("DESC Order: " + Arrays.toString(arrayOfNumbers));

        Arrays.sort(arrayOfNumbers, Comparator.naturalOrder());
        System.out.println("NATURAL Order: " + Arrays.toString(arrayOfNumbers));


    }
}

/*
 * Exercise (optional)
Given an array of numbers where every number is represented as string, 
successfully execute a Java program that sorts these numbers in ascending and descending order, using lambdas.
Hint: You are going to use Consumer<T>
 */






































 /*
  * // Step 1: Initialize ArrayList to store number strings
        ArrayList<String> numberString = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Step 2: Take user input
        System.out.println("Please input a string of numbers separated by spaces:");
        String numberInput = scanner.nextLine();

        // Step 3: Split input into an array of strings and add to list
        String[] numberStringArray = numberInput.split("\\s+");
        numberString.addAll(Arrays.asList(numberStringArray));

        // Step 4: Convert list elements to integers for sorting
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            for (String num : numberString) {
                numbers.add(Integer.parseInt(num)); // Convert to Integer
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter only numbers.");
            return; // Exit the program
        }

        // Step 5: Define Consumers for sorting and printing
        Consumer<ArrayList<Integer>> ascendingSorter = list -> {
            Collections.sort(list); // Sort in ascending order
            System.out.println("Ascending Order: " + list);
        };

        Consumer<ArrayList<Integer>> descendingSorter = list -> {
            list.sort(Collections.reverseOrder()); // Sort in descending order
            System.out.println("Descending Order: " + list);
        };

        // Step 6: Use Consumers to sort and display
        ascendingSorter.accept(numbers);
        descendingSorter.accept(numbers);

        // Close scanner
        scanner.close();
  */