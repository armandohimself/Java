package com.armando.sandbox.CodingExercises.ControlFlow;

public class Sum3And5 {

    public static void main(String[] args) {
        int sum = 0;
        int breakOutCondition = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum+=i;
                breakOutCondition++;

                if (breakOutCondition == 5) break;
            }
        }

        System.out.println("Summed number is: " + sum);
    }
}