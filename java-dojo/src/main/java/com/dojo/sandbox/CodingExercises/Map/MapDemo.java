package com.dojo.sandbox.CodingExercises.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<>();
        // Create a map with character as the key and int as the value which will be our frequency 

        String parseString = "CiggarettesAndCoffee";
        // Given any type of string

        for(int i = 0; i < parseString.length(); i++) {
            // Loop through the length of that string

            char currentLetter = parseString.toLowerCase().charAt(i);
            // lower case all the characters and grab the first char at i index

            // Guard Clause - Check if Letter Before Adding
            // Spaces are NOT letters
            if(Character.isLetter(currentLetter)) {

                int letterFrequency = 1;
                // If letter then our first frequency is 1

                // Guard Clause: Assume this isn't the first encounter with the letter
                if (hashMap.containsKey(currentLetter)) {
                    // If it isn't, then 
                    letterFrequency = hashMap.get(currentLetter);
                    // Update the frequency accordingly
                    letterFrequency++;
                }
                // Add or update frequency in the map
                hashMap.put(currentLetter, letterFrequency);
            }// End of IF CLAUSE PROTECTING ONLY LETTERS
        }// END OF LOOP, we went through all the letters in the string 
        System.out.println(hashMap);
    }
}

/*
 * Exercise (Optional)
Successfully execute a Java program that uses the Map interface to parse a String input and count the frequency of each letter of the alphabet in the String.
 */