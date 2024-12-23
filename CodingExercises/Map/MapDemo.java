package CodingExercises.Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Character, Integer> hashMap = new HashMap<>();

        String parseString = "CiggarettesAndCoffee";

        for(int i = 0; i < parseString.length(); i++) {
            char currentLetter = parseString.toLowerCase().charAt(i);

            // Guard Clause - Check if Letter Before Adding
            if(Character.isLetter(currentLetter)) {
                int letterFrequency = 1;

                // Guard Clause: Increment frequency if key exists
                if (hashMap.containsKey(currentLetter)) {
                    letterFrequency = hashMap.get(currentLetter);
                    letterFrequency++;
                }
                // Add or update frequency in the map
                hashMap.put(currentLetter, letterFrequency);
            }
        }
        System.out.println(hashMap);
    }
}

/*
 * Exercise (Optional)
Successfully execute a Java program that uses the Map interface to parse a String input and count the frequency of each letter of the alphabet in the String.
 */