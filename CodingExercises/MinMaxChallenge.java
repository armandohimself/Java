package CodingExercises;

import java.util.Scanner;

public class MinMaxChallenge {

    public static void main(String[] args) {
        promptUser();
    }

    public static void promptUser() {
        Scanner sc = new Scanner(System.in);
        double maxNumber = 0;
        double lowNumber = 0;
        double userNumber;
        boolean quitProgram = false;
        int counter = 0;

        do {

            System.out.println("Enter a number or any character to quit");
            String userInput = sc.nextLine();
            
            try {
                userNumber = Double.parseDouble(userInput);
                
                if (userNumber < lowNumber || counter == 0) {
                    lowNumber = userNumber;
                } else if (userNumber > lowNumber || counter == 0) {
                    maxNumber = userNumber;
                }
                
            } catch (NumberFormatException e) {
                break;
            }
            
            counter++;

        } while (!quitProgram);

        if (counter > 0) {
            System.out.println("min = " + lowNumber + ", max = " + maxNumber);
        } else {
            System.out.println("No valid data entered");
        }
    }
}