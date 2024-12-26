package com.armando.sandbox.CodingExercises.Expressions;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double input1, double input2) {
         
        double scaledInput1 = Math.round(input1 * 1000);
        double scaledInput2 = Math.round(input2 * 1000);
        System.out.println(scaledInput1);
        System.out.println(scaledInput2);
        
       if (scaledInput1 == scaledInput2) {
           return true;
       }
       else {
           return false;
       }
   }

   public static void main(String[] args) {
      DecimalComparator DC = new DecimalComparator();
      DC.areEqualByThreeDecimalPlaces(3.1756, 3.175);

   }

}

/*
 *  A better more elegant solution   
 * 
 * long scaledInput1 = (long) (input1 * 1000);
    long scaledInput2 = (long) (input2 * 1000);
    System.err.println(scaledInput1);
    System.err.println(scaledInput2);
        
    return scaledInput1 == scaledInput2;
    //*! Learned that if I have an if/else that I could simplify with implementation above

DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.



EXAMPLES OF INPUT/OUTPUT:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places

areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.



TIP: Use paper and pencil.

TIP: Use casting.

NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static ​like we have been doing so far in the course.
NOTE: Do not add a  main method to solution code.



Alternative solution 

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        BigDecimal firstDecimal = new BigDecimal(Double.toString(first));
        BigDecimal secondDecimal = new BigDecimal(Double.toString(second));
        
        firstDecimal = firstDecimal.setScale(3, RoundingMode.DOWN);
        secondDecimal = secondDecimal.setScale(3, RoundingMode.DOWN);
        
        return firstDecimal.equals(secondDecimal);
    }
}


 */