package com.dojo.sandbox.CodingExercises.ControlFlow;

public class SharedDigit {
    
    public static void main(String[] args) {
        // System.out.println(hasSharedDigit(-12, 23));
        // System.out.println(hasSharedDigit(12, 103));
        // System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(19, 99));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        //! All numbers will be 2 digits which helps our scope here 
        
        int n1L = num1 / 10;
        int n1R = num1 % 10;
        
        int n2L = num2 / 10;
        int n2R = num2 % 10;

        //Guard Clause
        if (num1 < 10 || num1 > 99) return false;
        if (num2 < 10 || num2 > 99) return false;
        
        return n1L == n2L 
            || n1L == n2R 
            || n1R == n2L 
            || n1R == n2R;
    }
}