package com.armando.sandbox.CodingExercises.Exceptions.UserProfileCollectorProject;

public class InvalidInputException extends Exception {
    //Now that we've extended, this makes our custom exception mandatory to handle
    
    public InvalidInputException(String message, Throwable cause) {
        super(message, cause);
    }
}

/*
 * ### **Additional Requirements**
1. Create a **custom exception** class named `InvalidInputException` that extends `Exception`.
2. Use the custom exception for specific invalid inputs:
   - Age: If the age entered is **less than or equal to 0**, throw `InvalidInputException`.
   - Height: If the height entered is **less than or equal to 0**, throw `InvalidInputException`.
   - Hobbies: If the hobbies input is empty (e.g., the user presses Enter without typing), throw `InvalidInputException`.

3. Catch the custom exception in your program and handle it by prompting the user to re-enter valid data.
 */