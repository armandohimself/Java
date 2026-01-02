package com.armando.sandbox.RevatureStudyGuide;

public class MediumProblem {

    public static String analyzeSentence(String input) {
        String resultString;
        int javaIndexFoundAt;
        String[] wordArr;
        StringBuilder summarizedWord = new StringBuilder();

        System.out.println("'" + input + "'");
        input = input.trim();



        if (input.contains("Java")) {
            javaIndexFoundAt = input.indexOf("Java");

            System.out.println(input);
            System.out.println("Java found at index: " + javaIndexFoundAt);

            summarizedWord.append("Java found at index " + javaIndexFoundAt + ", contains \'programming\': " + input.contains("programming"));

            resultString = input.replace(" ", "_");
            wordArr = input.split(" ");

            summarizedWord.append(", modified string: " + resultString);
        }
        // Your implementation here
        return summarizedWord.toString(); // Replace null with your solution
    }

    public static void main(String[] args) {
        // Test cases
        String input1 = "Java is a great programming language";
        String input2 = "I enjoy learning Java and coding";

        System.out.println(analyzeSentence(input1)); 
        // Expected: Java found at index 0, contains 'programming': true, modified string: Java_is_a_great_programming_language
        System.out.println(analyzeSentence(input2)); 
        // Expected: Java found at index 16, contains 'programming': false, modified string: I_enjoy_learning_Java_and_coding
    }
}

/*
**Medium Problem:**
Write a method that takes a string as input and performs the following:
1. Find the first occurrence of the word "Java" using `indexOf`.
2. Replace all spaces in the string with underscores using `replace`.
3. Split the string into words using `split`.
4. Check if the word "programming" is in the string using `contains`.
5. Return a new string summarizing the results.

**Requirements:**
- Use `indexOf`, `replace`, `split`, and `contains` methods.

**Example:**
Input: "Java is a great programming language"  
Output: "Java found at index 0, contains 'programming': true, modified string: Java_is_a_great_programming_language"

**Time Estimate:** 15-30 minutes
*/