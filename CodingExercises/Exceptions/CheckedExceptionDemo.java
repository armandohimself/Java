package CodingExercises.Exceptions;

import java.io.*;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        readFromFile_OldWay();
        readFromFile_TryWithResource();
    }

    public static void readFromFile_OldWay() {
        // This will cause a compile-time error if not handled.
        //FileReader reader = new FileReader("example.txt"); 

        FileReader reader = null;
        BufferedReader bufferedReader = null;
        
        try {
            reader = new FileReader("CodingExercises/Exceptions/example.txt"); 
            bufferedReader = new BufferedReader(reader); // Wrap it with BufferedReader for efficient reading

            String line; // Variable to store each line
            
            while ((line = bufferedReader.readLine()) != null) { // Read each line until EOF
                System.out.println(line); // Print the line to the terminal
            }

            bufferedReader.close(); // Close the BufferedReader to free resources

        } catch (FileNotFoundException e) {
            System.out.println("The exception error message is: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            /*
            * Ensure all resources are closed properly.
            * Prevents:
            * - Memory leaks (holding unused memory)
            * - File locking (marked as "in use")
            */

            try {
                if (bufferedReader != null) bufferedReader.close();
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }

    public static void readFromFile_TryWithResource() {
        // This will execute and close the resources of FileReader automatically at the end of the try block.

        try (FileReader reader = new FileReader("CodingExercises/Exceptions/example.txt");
            BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } // Notice how there is no need for a finally clause here and the resource gets closed automatically
        // Less boilerplate is good 👍🏽

        }
    }
