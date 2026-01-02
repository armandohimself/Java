package com.armando.sandbox.CodingExercises.Generics.Excercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestContainer {
    public static void main(String[] args) {
        //? Why code below shows IDE warning
        // Container container = new Container();
        // container.setObject("Hello");
        /*
         * You are calling a method onan instance that is a raw tyoe and the CLASS || METHOD needs to be parameterized
         * 
         * Since we called the method and passed a string, let's parameterize with String
         */

        Container<String> stringContainer = new Container<>();
        stringContainer.setObject("Armando's string literal");

        System.out.println(stringContainer.getObject());

        /*
            ! Exercises (Test)
            [X] Test the countElement generic method that has a specific property (for example, odd integers, prime numbers, palindromes).
        */

        Container<Integer> intContainer = new Container<>();
        ArrayList<Integer> intArrList = new ArrayList<>(List.of(1, 2, 3, 24, 7));



        //TODO: Odd Integers
        int totalNumOfElements = intContainer.countElements(intArrList, n -> {
            return n % 2 != 0;   
        });
        System.out.println("Total odd numbers: " + totalNumOfElements);



        //TODO: Prime Numbers
        int totalPrimeNumbers = intContainer.countElements(intArrList, n -> {
            boolean isPrime = false;
            //Guard Clause - Prime must be > 1
            if (n > 1) {
                // Guard Clause - Not prime if < 2
                if(n < 2) return isPrime;

                for(int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) return isPrime;
                }
                isPrime = true;
            }
            return isPrime; 
        });
        System.out.println("Total prime number found: " + totalPrimeNumbers);



        //TODO: Palindromes
        int totalPalindromes = intContainer.countElements(intArrList, n -> {
            String str = String.valueOf(n);
            return str.equals(new StringBuilder(str).reverse().toString());
        });
        System.out.println("Total palindromes found: " + totalPalindromes);

        /*
            ! Exercises (Test)
            [ ] Test the generic method to exchange the positions of two different elements in an array.
        */



        //TODO: Exchange Positions
        Container<String[]> stringArrayContainer = new Container<>();
        String[] stringArr = {"Mouse", "Keyboard", "Monitor", "Headphones"};
        System.out.println("Before the switch: " + Arrays.toString(stringArr));

        stringArrayContainer.switchPositions(stringArr, 2, 3);
        System.out.println("After the switch: " + Arrays.toString(stringArr));

        
    }

}