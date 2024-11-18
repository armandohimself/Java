package CodingExercises.Exceptions.UserProfileCollectorProject;

public class Main {
    public static void main(String[] args) {
        
    }
}

/*
 * ### Coding Challenge: "User Profile Collector"

#### Challenge Description:
Write a program that collects user information to create a "profile" with the following details:
1. **Name:** A single-line string.
2. **Age:** A positive integer.
3. **Height:** A floating-point number representing height in meters.
4. **Hobbies:** A comma-separated list of hobbies (single-line string).
5. **Likes Java?**: A boolean answer (`true` or `false`).

Once all inputs are collected, the program should display the profile information in a readable format.

---

#### Requirements:
1. Use all the common `Scanner` methods:
   - `nextLine()`
   - `next()`
   - `nextInt()`
   - `nextDouble()`
   - `nextBoolean()`
   - `hasNextXXX()` (e.g., `hasNextInt()`, `hasNextDouble()`)
2. Validate the input wherever possible.
3. Prompt the user for valid input if they enter something invalid.

---

### Expected Exceptions You May Encounter
1. **`InputMismatchException`:** When the user enters invalid input for methods like `nextInt()`, `nextDouble()`, or `nextBoolean()`.
2. **`NoSuchElementException`:** If input is requested but no further input exists (e.g., EOF is reached unexpectedly).
3. **`IllegalStateException`:** If the `Scanner` object is closed before you attempt to read from it.

---

### Coding Challenge Details
Here’s what your program should do:
1. Prompt the user for their name. Read the full name using `nextLine()`.
2. Ask the user for their age. Use `nextInt()`, ensuring the input is valid and positive.
3. Ask for their height in meters. Use `nextDouble()` and validate the input.
4. Ask for their hobbies as a comma-separated list. Use `nextLine()` after consuming the previous input properly.
5. Ask if they like Java using `nextBoolean()`. Validate the response.

Finally, display the collected information in a formatted way.

---

#### Hints to Keep in Mind:
- You **will encounter exceptions** if the input does not match the expected format for `nextInt`, `nextDouble`, or `nextBoolean`.
- You may need to clear invalid inputs using `sc.next()` or `sc.nextLine()`.
- Be cautious about **input skipping issues** when mixing `nextInt()`/`nextDouble()` with `nextLine()`.

---

### Total Exceptions You Might Encounter:
You will run into **3 main exceptions** (listed above) if you don’t handle edge cases properly. This challenge is designed to test your understanding of handling user input robustly and using `Scanner` methods effectively.

Good luck, and have fun coding! 🚀
 */