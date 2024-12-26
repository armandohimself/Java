package com.armando.sandbox.RevatureStudyGuide.Week1;

public class ReverseStringMethods {

    public static void main(String[] args) {
        
        String str = "Hello";

        System.out.println(reverse1(str));
        System.out.println(reverse2(str));
        System.out.println(reverse3(str));
        System.out.println(reverse4(str));
    }

    // Challenge 1: Reverse a String Using StringBuilder
    public static String reverse1 (String str) {
        // What I was not understanding was that I didn't need to assign the StringBuilder class when I could just return the instance of it and chain the methods on it.
        // This is also O(n) performant and better to use than manually reversing the string because a new assignment will happen each time we will loop through in the bottom example
        return new StringBuilder(str).reverse().toString(); 
    }

    // Challenge 2: Reverse a String Using a for Loop (Manual Reversal)
    public static String reverse2 (String str) {
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    // Challenge 3: Reverse a String Using a char Array
    public static String reverse3 (String str) {
        char[] charArr = new char[str.length()];
        int counter = 0;

        for(int i = str.length() -1; i >= 0; i--) {
            charArr[counter] = str.charAt(i);
            counter++;
        }

        return new String(charArr);
    }

    // Challenge 4: Reverse a String Using StringBuilder with a for Loop (Optimized)
    public static String reverse4 (String str) {
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
