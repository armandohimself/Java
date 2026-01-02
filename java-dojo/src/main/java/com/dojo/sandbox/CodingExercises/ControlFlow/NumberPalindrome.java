package com.dojo.sandbox.CodingExercises.ControlFlow;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(1234);
    }


    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        
        
        while (number != 0) {
            
            reverse = (reverse * 10) + (number % 10);
            
            //Loop condition
            number = number / 10;
        }
        
        System.out.println("reversed: " + reverse);
        System.out.println("original: " + original);

        return original == reverse? true : false;
        
    }
}