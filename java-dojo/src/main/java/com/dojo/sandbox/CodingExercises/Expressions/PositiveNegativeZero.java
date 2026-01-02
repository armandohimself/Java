package com.armando.sandbox.CodingExercises.Expressions;

public class PositiveNegativeZero {
    public static void checkNumber (int number) {
        //We want an exception handle for if it's not a number and how to handle it. 
        
        if (number < 0) {
            System.out.println("negative");
        }  else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegativeZero PNZ = new PositiveNegativeZero();
        PNZ.checkNumber(0);
        PNZ.checkNumber(5);
        PNZ.checkNumber(-10);
    }
}

/**
 * Positive, Negative or Zero
Write a method called checkNumber with an int parameter named number.

The method should not return any value, and it needs to print out:

    - "positive" if the parameter number is > 0

    - "negative" if the parameter number is < 0

    - "zero" if the parameter number is equal to 0

NOTE:  The checkNumber method needs to be defined as public static like we have been doing so far in the course.

NOTE:  Do not add a main method to your solution code!

Test Cases
Failed: 0, Passed: 7 of 7 tests

- Evaluate.testGroupedNestedTestClasses
- Evaluate$A_MethodDeclarationTest.declarations
- Evaluate$CheckNumberParamsTest.printTest
- Evaluate$CheckNumberParamsTest.printTest
- Evaluate$CheckNumberParamsTest.printTest
- Evaluate$CheckNumberParamsTest.printTest
- Evaluate$CheckNumberParamsTest.printTest
 */