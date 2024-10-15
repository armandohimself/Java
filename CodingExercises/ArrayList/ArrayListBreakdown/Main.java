package CodingExercises.ArrayList.ArrayListBreakdown;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Empty ArrayList of String
        ArrayList<String> arrayList = new ArrayList<String>();
        System.out.println(arrayList);

        // Instantiated Lists & ArrayList
        ArrayList<String> instantiatedArrayList = new ArrayList<String>(List.of("first", "second", "third"));
        System.out.println(instantiatedArrayList);
        /*
         * //! List.of() is a factory method which uses variable arguements to create a pass through immutable list
         * Factories help create centralized abstract objects when passing options through an arguement
         */

         System.out.println(
            String.format(
                "Does ArrayList contain \"first\" = %s", 
                instantiatedArrayList.contains("first") ? "Yes" : "No"
            )
        );

        //containsAll

        //indexOf

        //lastIndexOf


    }


    public static void randomNotes() {
        // Instantiated Array
        String[] array = new String[] {"One", "Two", "Three"};
        int[] intArray = new int[] {1, 2, 3};

        // Anonymous Array
        String[] anonArray = {"Four", "Five", "Six"};
        int[] anonIntArr = {4, 5, 6};
    }

    public static boolean usingContains(ArrayList<String> arrayList) {


        return false;
    }
}