package com.armando.sandbox.RevatureStudyGuide;

import java.util.Arrays;


public class SortCharactersAlphabetically {

    public static String sortStringAlphabetically(String input) {
        // Your implementation here
        char[] characterArray = input.toCharArray();

        Arrays.sort(characterArray);
        
        String reconstructedString = new String(characterArray);

        return reconstructedString; // Replace null with your solution

/*
 * Use Arrays.toString(charArray) for a readable representation of the array, but note that it includes brackets and commas. For example: "[a, e, l, p, p]".
Alternatively, use the new String(charArray) constructor to directly convert the array into a proper string.
 */

    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sortStringAlphabetically("apple"));  // Expected: "aelpp"
        System.out.println(sortStringAlphabetically("banana")); // Expected: "aaabnn"
        System.out.println(sortStringAlphabetically("cherry")); // Expected: "cehrry"
        System.out.println(sortStringAlphabetically("java"));   // Expected: "aajv"
        System.out.println(sortStringAlphabetically("xyz"));    // Expected: "xyz"
    }
}

/*
Your task is to implement the `sortStringAlphabetically` method.

**Requirements**:
1. The method should take a single string (`input`) as input.
2. It should return a new string where all the characters are sorted in alphabetical order.
   - Example: If the input is "apple", the output should be "aelpp".

**Guidelines**:
1. Break the string into individual characters.
2. Sort the characters in ascending order.
3. Reconstruct the sorted characters into a single string and return it.

**Edge Cases**:
- Handle strings of varying lengths, from 1 to 1000 characters.
- Ensure the input only contains lowercase letters ('a' to 'z').

Test your implementation with the provided test cases in the `main` method.
*/
