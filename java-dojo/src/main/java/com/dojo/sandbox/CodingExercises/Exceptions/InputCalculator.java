package com.armando.sandbox.CodingExercises.Exceptions;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage () {
        boolean quitProgram = false;
        int sum = 0;
        int counter = 0;

        // Read int numbers from keyboard input using Scanner
        Scanner sc = new Scanner(System.in);
        
        do {

            String userInput = sc.nextLine();
            // Validate the input
            try {
                int validNumber = Integer.parseInt(userInput);

                sum += validNumber;

                counter++;

            } catch (NumberFormatException e) {
                if (counter == 0) { System.out.println("SUM = " + 0 + " AVG = " + 0); break; }

                System.out.println("SUM = " + sum + " AVG = " + sum/counter);
                break;
            }
        } while (!quitProgram);
    }
}

/*
 * import java.util.Scanner;
 
public class InputCalculator {
 
    public static void inputThenPrintSumAndAverage() {
        
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
 
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();

            if (!hasNextInt) {
                * break the loop on invalid input
                break;
            }

            sum += scanner.nextInt();
            
            count++;
            
            * clear buffer e.g. remove line separator
            
            scanner.nextLine();
        }
         
        if (count > 0) {
            avg = Math.round((double) sum / count);
        }
 
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
 */