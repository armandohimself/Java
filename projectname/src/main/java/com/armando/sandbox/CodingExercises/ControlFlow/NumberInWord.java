package com.armando.sandbox.CodingExercises.ControlFlow;

public class NumberInWord {
    public static void printNumberInWord(int num) {
        switch (num) {
            case 0: System.out.println("ZERO");
            break;
            case 1: System.out.println("ONE");
            break;
            case 2: System.out.println("TWO");
            break;
            case 3: System.out.println("THREE");
            break;
            case 4: System.out.println("FOUR");
            break;
            case 5: System.out.println("FIVE");
            break;
            case 6: System.out.println("SIX");
            break;
            case 7: System.out.println("SEVEN");
            break;
            case 8: System.out.println("EIGHT");
            break;
            case 9: System.out.println("NINE");
            break;
            default: System.out.println("OTHER");
        }
    }

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-1);
    }
}

/*
 * //!Number In Word Challenge
[X] Write a method called printNumberInWord. 
[X] The method has one parameter number which is the whole number. 
[] The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. 
[] You can use if-else statement or switch statement whatever is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.
 */