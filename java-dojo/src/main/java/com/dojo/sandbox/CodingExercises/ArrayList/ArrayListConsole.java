package com.dojo.sandbox.CodingExercises.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConsole {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> groceriesList = new ArrayList<>();

        while(flag) {
            // Print the actions the user can take as we loop
            printActions1();

            // Command Routing Using Switch
            try {
                switch(Integer.parseInt(scanner.nextLine())) {
                    // The scanner object will read a full line and wait for user to hit enter
                    case 0 -> System.exit(0);
                    case 1 -> addItems(groceriesList);
                    case 2 -> removeItems(groceriesList);
                    default -> {
                        System.out.println("Number was not in the options, shutting down now.");
                        System.out.println("Invalid entry, shutting down now.");
                        flag = false;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Can't accept type of letters or symbols, shutting down now.");
                flag = false;
            }
        }
    }
    
    //! Print Actions 
    private static void printActions1() {
        String startMessage = String.format(
            "Available actions:%n" +
            "0 - to shutdown%n" +
            "1 - to add item(s) to list (comma delimited list)%n" +
            "2 - to remove any items (comma delimited list)%n" +
            "Enter a number for which action you want to do:%n"
            );
            
        System.out.println(startMessage);
    }

    //! Add Item(s)
    private static void addItems(ArrayList<String> groceriesList) {
        System.out.println("Enter grocery item(s) [separate items by comma]: ");

        String[] groceriesEntered = scanner.nextLine().split(",");
        // Takes the string and splits it into an array where ever there was a comma

        //! The issue with the code below is that it adds all of the items at once including duplicates
        // groceriesList.addAll(List.of(groceriesEntered));

        for(String item: groceriesEntered) {
            String trimmed = item.trim(); // Removes trailing or leading white space

            if(groceriesList.indexOf(trimmed) < 0) { // Returns the position of the first occurence of the specified characters/string in the string (CASE SEN.)
                // If a -1 is returned, that means that there wasn't a duplicate found in our code so we can add it (aka if duplicate found, the index that points to it is returned)
                groceriesList.add(trimmed);
                // Add the cleaned up item into the array list
            }
        }

        System.out.println("Current list now has: " + groceriesList);
    }

    //! Remove Item(s)
    private static void removeItems(ArrayList<String> groceriesList) {
        System.out.println("Enter grocery item(s) [separate items by comma to remove]: ");

        String[] groceriesToRemove = scanner.nextLine().split(",");

        for(String item: groceriesToRemove) {
            String trimmed = item.trim();
            //! NOTE: You still want to clean up all of the users input to future proof the code
            groceriesList.remove(trimmed);
        }

        System.out.println("Current list now has: " + groceriesList);
    }
}
