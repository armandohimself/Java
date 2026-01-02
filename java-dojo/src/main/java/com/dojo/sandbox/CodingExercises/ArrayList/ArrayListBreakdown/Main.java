package com.armando.sandbox.CodingExercises.ArrayList.ArrayListBreakdown;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Empty ArrayList of String
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(arrayList);

        // Instantiated Lists & ArrayList
        ArrayList<String> instantiatedArrayList = new ArrayList<String>(List.of("first", "second", "third", "first"));
        System.out.println(instantiatedArrayList);
        /*
         * //! List.of() is a factory method which uses variable arguements to create a pass through immutable list
         * Factories help create centralized abstract objects when passing options through an arguement
         */

    //! contains method
         System.out.println(
            String.format(
                "Does ArrayList contain \"first\" = %s", 
                instantiatedArrayList.contains("first") ? "Yes" : "No"
            )
        );

    //! containsAll
        System.out.println(
            String.format(
                "Does ArrayList contain all of these: \"first\" & \"second\" = %b",
                instantiatedArrayList.containsAll(List.of("first", "second"))
            )
        );

        // You could have also broken it down further; simplified example
        ArrayList<String> mammalArrayList = new ArrayList<>(List.of("Cat", "Dog", "Elephant", "Horse", "Dolphin"));
        // Create a list to check against
        List<String> mammalsToCheck = List.of("Cat", "Dog");
        // Boolean results stored somewhere for later
        boolean results = mammalArrayList.containsAll(mammalsToCheck);
        // Print the results
        System.out.println("Does instantiatedArrayList contain all elements? " + results);

    //! indexOf
        System.out.println(
            String.format(
                "Second is at index of: = %d",
                instantiatedArrayList.indexOf("second")
            )
        );

    //! lastIndexOf - find last occurence of a specific element; return -1 if not found
        System.out.println(
            String.format(
                "The last occurence of \"first\" is at index = %d",
                instantiatedArrayList.lastIndexOf("first")
            )
        );


    //! SORTING
    /* Comparator tells sort how to perform below */
        instantiatedArrayList.sort(Comparator.naturalOrder());
        System.out.println(
            String.format(
                "Sorted ArrayList using Comparator.naturalOrder() %s",
                instantiatedArrayList
            )
        );

        instantiatedArrayList.sort(Comparator.reverseOrder());
        System.out.println(
            String.format(
                "Sorted ArrayList using Comparator.reverseOrder() %s",
                instantiatedArrayList
            )
        );


    }


    public static void randomNotes() {
        // Instantiated Array
        String[] array = new String[] {"One", "Two", "Three"};
        int[] intArray = new int[] {1, 2, 3};

        // Anonymous Array
        String[] anonArray = {"Four", "Five", "Six"};
        int[] anonIntArr = {4, 5, 6};
    }
}