package com.dojo.sandbox.CodingExercises.ControlFlow;

public class FirstLastDigitSum {

     public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
     }

     public static int sumFirstAndLastDigit (int number) {
        
        int firstDigit = 0;
        int lastDigit = number % 10;
        
        // Guard Clause
        if ( number < 0) return -1;
        
        while (number != 0) {
            firstDigit = number % 10;
            number = number / 10;
        }
        
        return firstDigit + lastDigit;
    }
}