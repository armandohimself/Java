package CodingExercises.ArrayList;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListConsole {
    public static void main(String[] args) {
        int consoleInput = -1;

        startConsole();
        consoleInput = getUserConsoleInput();

        //* Command Routing
        if (consoleInput == 0) {
            System.exit(consoleInput);
        } else if (consoleInput == 1) {

        } else if (consoleInput == 2) {

        }
    }
    
    
    private static void startConsole() {
        String startMessage = String.format(
            "Available actions:%n" +
            "0 - to shutdown%n" +
            "1 - to add item(s) to list (comma delimited list)%n" +
            "2 - to remove any items (comma delimited list)%n" +
            "Enter a number for which action you want to do:%n"
            );
            
        System.out.println(startMessage);
    }

    private static int getUserConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        int input = -1;

        do {
            try {

                input = scanner.nextInt();

                if (inputChecker(input)) break; // Exit the loop if a valid integer is entered
                else {
                    System.out.println("Please enter a number within the list of available options");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                scanner.next();
            }
        } while(scanner.hasNext());
        
        scanner.close();
        
        return input;
    }

    private static boolean inputChecker(int input) {
        if (input >= 0 && input <= 2) return true;
        else return false;
    }

    //! Add items to a list

    //! remove items from a list
}
