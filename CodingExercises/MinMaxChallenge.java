package CodingExercises;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser() {
        Scanner sc = new Scanner(System.in);
        double maxNumber = 0;
        double lowNumber = 10;
        double userNumber;
        boolean quitProgram = false;
        int counter = 0;

        do {

            System.out.println("Enter a number or any character to quit");
            String userInput = sc.nextLine();
            
            try {
                counter++;
                userNumber = Double.parseDouble(userInput);

                if (userNumber < lowNumber) {
                    lowNumber = userNumber;
                } else if (userNumber > lowNumber) {
                    maxNumber = userNumber;
                }

                if (counter == 1) {
                    lowNumber = userNumber;
                    maxNumber = userNumber;
                }

            } catch (NumberFormatException e) {
                break;
            }


        } while (!quitProgram);

        System.out.println("Min number: " + lowNumber);
        System.out.println("Max number: " + maxNumber);
    }
}