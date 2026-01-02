package com.dojo.sandbox.CodingExercises.Exceptions.UserProfileCollectorProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    // read input from various sources like keyboard input, files, or strings and System.in is a standard input stream (typically the keyboard).
    static boolean profileCreated = false;

    public static void main(String[] args) {
        UserProfile user = createProfile();
        System.out.println(user.toString());
    }

    public static UserProfile createProfile() {
        String name = "";
        int age = -1;
        float heightInMeters = 0;
        String[] hobbiesArr = null;
        boolean likesJava = false;

        while (!profileCreated) {
            //! If exception thrown, we will pick up where we left off to try again
            try {
                if (name.isEmpty()) name = nameInput();
                if (age == -1) age = ageInput();
                if (heightInMeters == 0.0f) heightInMeters = heightInMetersInput();
                if (hobbiesArr == null) hobbiesArr = hobbiesInput();
                if (!profileCreated) likesJava = likesJavaInput();
    
                profileCreated = true; // Set to true after all inputs succeed
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        UserProfile newProfile = new UserProfile(name, age, heightInMeters, hobbiesArr, likesJava);
        return newProfile;
    }

    //! Person's Name (case-sentitve; letters & spaces only)
    public static String nameInput() throws InvalidInputException{
        boolean isNameValid = false;
        String name = "";
        
        System.out.println("Enter the person's name (case-sensitive)");
        while(!isNameValid) {
            name = sc.nextLine();

            // Guard Clause: Making sure the string is letters and spaces only
            if(name.matches("^[a-zA-Z\\s]+$")) {
                // ^ start of a string, the regex maches any letters or spaces, + ensures one or more valid chars are present, $ is the end of the string
                System.out.println("You've choosen " + name + " as the name! \nDo you wish to proceed? Y/N");
                String proceed = sc.nextLine().trim().toUpperCase();

                if(proceed.equals("Y") || proceed.equals("YES")) {
                    isNameValid = true;
                } else if (proceed.equals("N") || proceed.equals("NO")) {
                    throw new InvalidInputException("Name was rejected, let's try again.", null);
                } else {
                    System.out.println("Invalid response. Please answer with Y or N.");
                }
            } else {
                throw new InvalidInputException("That is not a valid name. Letters and spaces only accepted.", null);
            }
        }
        return name;
    }

    //! Person's Age
    public static int ageInput() throws InvalidInputException {
        int age = 0;
        boolean isAge = false;

        System.out.println("What is their age?");
        while (!isAge) {
            try {
                age = Integer.parseInt(sc.nextLine());

                //TODO: Add upper bounds (e.g., reasonable age limits).
                if (age >= 0) {
                    isAge = true;
                } else {
                    throw new InvalidInputException("You can't be a negative age", null);
                }
            } catch (NumberFormatException e) {
                throw new InvalidInputException("Please enter a valid number!", e);
            }
        }        
        
        return age;
    }

    //! Person's Height in Meters (float)
    public static float heightInMetersInput() throws InvalidInputException{
        float height = 0.0f;
        boolean isHeight = false;

        System.out.println("How tall are they in meters");
        while(!isHeight) {
            try {
                height = Float.parseFloat(sc.nextLine());

                //TODO: Add upper bounds (e.g., reasonable height limits).
                if(height <= 0) {
                    throw new InvalidInputException("You can't be a negative height", null);
                } else {
                    isHeight = true;
                }

            } catch (NumberFormatException e) {
                throw new InvalidInputException("That is not a valid number; please input a number.", e);
            }
        }
        return height;
    }

    //! Person's Hobbies Array
    public static String[] hobbiesInput() throws InvalidInputException{
        String hobbiesInput = "";
        String[] hobbiesArr = null;
        boolean isHobbies = false;

        System.out.println("Using comma's, what are their hobbies?");
        while (!isHobbies) {
            hobbiesInput = sc.nextLine().trim();
            // remove whitespaces from leading/trailing string 

            // Guard Clause for Empty String
            if(!hobbiesInput.isEmpty()) {

                //TODO: Allow only alphabetic characters or specific punctuation (e.g., dashes).

                // Proceed to taking the string and splitting it into an array where there are commas
                hobbiesArr = hobbiesInput.split(",");

                // Guard Clause to make sure the array does contain an empty element
                for(String hobby: hobbiesArr) {
                    if(hobby.isEmpty()) {
                        throw new InvalidInputException("I think you've entered a hobby incorrectly. Make sure it's a list of comma separated values.", null);
                    }
                }

                // Array is good we can pass it through 
                isHobbies = true;
            } else {
                throw new InvalidInputException("I'm sure they have at least one hobby! Try again!", null);
            }
        }
        return hobbiesArr;
    }

    //! Person Likes Java?
    public static boolean likesJavaInput() throws InvalidInputException{
        boolean isLikesJavaValid = false;
        boolean likesJava = false;

        System.out.println("Do they like java? (true/false):");
        while(!isLikesJavaValid) {
            String input = sc.nextLine().trim().toLowerCase();

            if(input.equals("true") || input.equals("false")) {
                likesJava = Boolean.parseBoolean(input);
                isLikesJavaValid = true;
            } else {
                throw new InvalidInputException("You did not type in true or false. Let's try again", null);
            }
        }
        return likesJava;
    }
}

/*
 * ### **Extended Coding Challenge: "User Profile Collector with Custom Exceptions"**

#### Challenge Description:
Write a program that collects user information to create a "profile" with the following details:
1. **Name:** A single-line string.
2. **Age:** A positive integer.
3. **Height:** A floating-point number representing height in meters.
4. **Hobbies:** A comma-separated list of hobbies (single-line string).
5. **Likes Java?**: A boolean answer (`true` or `false`).

Once all inputs are collected, the program should display the profile information in a readable format.

---

### **Additional Requirements**
1. Create a **custom exception** class named `InvalidInputException` that extends `Exception`.
2. Use the custom exception for specific invalid inputs:
   - Age: If the age entered is **less than or equal to 0**, throw `InvalidInputException`.
   - Height: If the height entered is **less than or equal to 0**, throw `InvalidInputException`.
   - Hobbies: If the hobbies input is empty (e.g., the user presses Enter without typing), throw `InvalidInputException`.

3. Catch the custom exception in your program and handle it by prompting the user to re-enter valid data.

---

#### Requirements Recap:
1. Use all the common `Scanner` methods:
   - `nextLine()`
   - `next()`
   - `nextInt()`
   - `nextDouble()`
   - `nextBoolean()`
   - `hasNextXXX()` (e.g., `hasNextInt()`, `hasNextDouble()`)
2. Validate the input wherever possible using conditionals (`if`) and `hasNextXXX()` methods.
3. Integrate the custom exception to manage specific input validation failures.

---

#### Steps to Implement:
1. **Custom Exception Class**:
   - Define a class named `InvalidInputException` that inherits from `Exception`.
   - The exception should take a custom error message as a parameter and pass it to the `Exception` constructor.

2. **Input Validation Logic**:
   - For **age**, ensure the input is a positive integer. If it’s less than or equal to 0, throw `InvalidInputException`.
   - For **height**, ensure the input is a positive floating-point number. If it’s less than or equal to 0, throw `InvalidInputException`.
   - For **hobbies**, ensure the input is not empty or only whitespace. If it’s empty, throw `InvalidInputException`.

3. **Handle Exceptions**:
   - Use `try-catch` blocks to catch `InvalidInputException` and any standard exceptions (e.g., `InputMismatchException`).
   - Prompt the user to re-enter valid data when an exception is caught.

4. **Finalize and Display the Profile**:
   - Once all inputs are successfully validated and collected, display the profile in a formatted way.

---

### **Expected Exceptions You May Encounter**
1. **Custom Exception: `InvalidInputException`**:
   - Thrown when specific validation rules are violated (e.g., invalid age, height, or hobbies).

2. **`InputMismatchException`**:
   - Occurs when the user enters a value that doesn’t match the expected type for methods like `nextInt()`, `nextDouble()`, or `nextBoolean()`.

3. **`NoSuchElementException`**:
   - Occurs if input is requested, but no further input is available (e.g., EOF).

4. **`IllegalStateException`**:
   - Occurs if the `Scanner` is closed before further input is read.

---

#### Hints to Keep in Mind:
- To avoid `InputMismatchException`, use `hasNextXXX()` methods to check input validity before reading it.
- To manage input skipping issues (e.g., mixing `nextLine()` with `nextInt()`), clear the buffer by calling `sc.nextLine()` appropriately.
- Design the custom exception class to take a meaningful error message and use it in your `catch` blocks to give user-friendly feedback.

---

### Challenge Notes:
- Use your creativity to decide how to organize the program and where to use custom exceptions versus built-in ones.
- Aim to write clean, reusable, and maintainable code.

Good luck with your coding challenge! 🚀
 */