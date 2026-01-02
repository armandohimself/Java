package com.dojo.sandbox.RevatureStudyGuide;

import java.util.TreeSet;

public class TreeSetLab {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        // Test addNumber method
        addNumber(numbers, 10);
        addNumber(numbers, 5);
        addNumber(numbers, 20);
        addNumber(numbers, 15);

        // Test removeNumber method
        removeNumber(numbers, 5);

        // Test getSmallest method
        System.out.println("Smallest: " + getSmallest(numbers));

        // Test getLargest method
        System.out.println("Largest: " + getLargest(numbers));

        // Test printNumbers method
        printNumbers(numbers);
    }

    // Implement this method to add a number to the set
    public static void addNumber(TreeSet<Integer> set, int number) {
        set.add(number);
        // TODO: Implement this
    }

    // Implement this method to remove a number from the set
    public static void removeNumber(TreeSet<Integer> set, int number) {
        set.remove(number);
        // TODO: Implement this
    }

    // Implement this method to get the smallest number
    public static int getSmallest(TreeSet<Integer> set) {
        // TODO: Implement this
        return set.first();
    }

    // Implement this method to get the largest number
    public static int getLargest(TreeSet<Integer> set) {
        // TODO: Implement this
        return set.last();
    }

    // Implement this method to print all numbers in the set
    public static void printNumbers(TreeSet<Integer> set) {
        // TODO: Implement this
        System.out.println(set);
        for(int num : set) {
            System.out.println(num);
        }
    }
}

/*
Prompt:
1. Add a number to the set.
2. Remove a number from the set.
3. Get the smallest number in the set.
4. Get the largest number in the set.
5. Print all numbers in the set.
*/
