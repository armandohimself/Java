package com.dojo.sandbox.RevatureStudyGuide;

import java.util.HashSet;

public class HashSetLab {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        // Test addCity method
        addCity(cities, "New York");
        addCity(cities, "Los Angeles");
        addCity(cities, "Chicago");
        addCity(cities, "New York"); // Duplicate, won't be added

        // Test removeCity method
        removeCity(cities, "Los Angeles");

        // Test checkCity method
        System.out.println("Contains Chicago? " + checkCity(cities, "Chicago"));

        // Test printCities method
        printCities(cities);
    }

    // Implement this method to add a city to the set
    public static void addCity(HashSet<String> set, String city) {
        // TODO: Implement this
        set.add(city);
    }

    // Implement this method to remove a city from the set
    public static void removeCity(HashSet<String> set, String city) {
        // TODO: Implement this
        set.remove(city);
    }

    // Implement this method to check if a city exists in the set
    public static boolean checkCity(HashSet<String> set, String city) {
        // TODO: Implement this
        return set.contains(city);
    }

    // Implement this method to print all cities
    public static void printCities(HashSet<String> set) {
        // TODO: Implement this
        for (String city : set) {
            System.out.println(city);
        }
    }
}

/*
Prompt:
1. Add a city to the set.
2. Remove a city from the set.
3. Check if a city exists in the set.
4. Print all cities in the set.
*/
