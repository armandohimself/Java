package com.armando.sandbox.CodingExercises.MultiDimensional.MultiDimensionalBreakdown;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        //! 2 Dimensional Instantiated Array 
        String[][] array2d = {
            {"first", "second", "third"}, 
            {"fourth", "fifth"}
        };
        System.out.println(Arrays.deepToString(array2d));
        /*
         * For multidimensional arrays, if you want the output, then you have to use deepToString
         */


        //! 2 Dimensional Empty Anonymous ArrayList
        ArrayList<ArrayList<String>> multiDList = new ArrayList<>();
        System.out.println(multiDList);
    }

}