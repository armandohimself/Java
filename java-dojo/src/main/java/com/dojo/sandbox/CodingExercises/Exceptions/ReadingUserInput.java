package com.dojo.sandbox.CodingExercises.Exceptions;

import java.util.Scanner;

public class ReadingUserInput {
    
    public static void main(String[] args) {
        userInput();
    }

    public static void userInput() {
        try (Scanner sc = new Scanner(System.in)) {
            int counter = 1;
            double sum = 0;

            
            do {
            
            System.out.println("Enter number #" + counter + ":");
            String numberInput = sc.nextLine();

            try {
            sum += Double.parseDouble(numberInput);
            System.out.println("Number inputed is: " + numberInput);
            } catch (NumberFormatException e) {
                // System.out.println("Please enter numbers only!");
                System.out.println("Invalid number");
                continue;
            }

            counter++;
            } while (counter <= 5);

            System.out.println("Summed number is: " + sum);
        }
    }
}