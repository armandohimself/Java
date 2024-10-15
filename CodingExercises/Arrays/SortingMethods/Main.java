package CodingExercises.Arrays.SortingMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] songNames = { 
            "COULD BE WRONG - LOSTBOYJAY", 
            "Pushing On (Tchami Remix) - Oliver Dollar & Jimi Jules", 
            "Atmosphere - FISHER & Kita Alexander", 
            "stay - Yaman Khadzi"
        };

        String[] numbersArray = {
            "one", "Second", "Third"
        };

        //! Arrays.sort
        /* For arrays with numeric primitive types, wrapper classes, Strings, & StringBuilders
         * numeric primitive types = int, long, short, byte
         * wrapper classes = Integer[] numsWrapper = {5, 2, 8, 3}
         * StringBuilder = StringBuilder[] sbArr = {new StringBuilder("Banana"), new StringBuilder("Apple")};
         */
        Arrays.sort(numbersArray);
        System.out.println(Arrays.toString(numbersArray));

        /* end */
    }
}