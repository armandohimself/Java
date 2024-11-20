package CodingExercises.Exceptions.UserProfileCollectorProject;

public class Main {
    public static void main(String[] args) {
        
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