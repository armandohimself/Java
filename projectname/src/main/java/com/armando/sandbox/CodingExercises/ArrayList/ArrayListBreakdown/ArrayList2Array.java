package com.armando.sandbox.CodingExercises.ArrayList.ArrayListBreakdown;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2Array {
    public static void main(String[] args) {
    //! Create ArrayList
        ArrayList<String> arrayList = new ArrayList<>(List.of("keyboard", "mouse", "monitor"));

    //! Use .toArray() method
        String[] array = arrayList.toArray(new String[0]);
        /* I can pass (new String[0]) to specify that I want an array with the size zero
         * however, I don't need to worry because ArrayList see's that I have 3 elements
         * and sizes the array automatically for me to the actual array length
        */
        
        System.out.println(Arrays.toString(array));
    }
}
