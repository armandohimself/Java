package com.armando.sandbox.RevatureStudyGuide;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapLab {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        // Test addEntry method
        addEntry(scores, "Alice", 85);
        addEntry(scores, "Bob", 90);
        addEntry(scores, "Charlie", 78);

        // Test findKey method
        System.out.println("Contains key 'Alice'? " + findKey(scores, "Alice"));

        // Test findValue method
        System.out.println("Contains value 90? " + findValue(scores, 90));

        // Test printMap method
        System.out.println("All entries in the map:");
        printMap(scores);
    }

    // Implement this method to add a key-value pair to the map
    public static void addEntry(HashMap<String, Integer> map, String key, int value) {
        // TODO: Implement this
        map.put(key, value);
    }

    // Implement this method to check if a key exists in the map
    public static boolean findKey(HashMap<String, Integer> map, String key) {
        // TODO: Implement this
        return map.containsKey(key);
    }

    // Implement this method to check if a value exists in the map
    public static boolean findValue(HashMap<String, Integer> map, int value) {
        // TODO: Implement this
        return map.containsValue(value);
    }

    // Implement this method to iterate over the map and print all key-value pairs
    public static void printMap(HashMap<String, Integer> map) {
        // TODO: Implement this
        System.out.println(map);

        Set<String> mapKeysSet = map.keySet();
        Collection<Integer> mapValues = map.values();

        Iterator<String> iterableMapKeySet = mapKeysSet.iterator();
        Iterator<Integer> iterableMapValues = mapValues.iterator();
        while(iterableMapKeySet.hasNext() && iterableMapValues.hasNext()) {
            System.out.println(iterableMapKeySet.next() + "=" + iterableMapValues.next());
        }

    }
}

/*
Prompt:
1. Add a key-value pair to the map.
2. Check if a specific key exists in the map.
3. Check if a specific value exists in the map.
4. Iterate over the map and print all key-value pairs.
*/
