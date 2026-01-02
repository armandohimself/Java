package com.armando.sandbox.CodingExercises.Iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterateMethods {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Armando", "Jesse", "Shirley", "Pavan");
        //TODO: Iterate with enhanced for loop
        iterateForLoop(names);

        //TODO: Iterate with forEach loop
        iterateForEach(names);

        Iterator<String> myIterator = names.iterator();
        iterateusingIterator(myIterator);


    }

    public static void iterateForLoop(List<String> list) {
        System.out.println("Iterating with enhanced for loop");
        for(String element : list) {
            System.out.println(element);
        }
    }

    public static void iterateForEach(List<String> list) {
        System.out.println("Iterating with forEach loop");
        list.forEach(element -> {
            System.out.println(element);
        });
    }

    public static void iterateusingIterator(Iterator<String> iterator) {
        System.out.println("Iterating with Iterator");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
     * Write a single Java program that demonstrates the three different ways above to iterate.
     * - Iterate using an enhanced for loop
     * - Iterate using a forEach loop
     * - Iterate using Iterator
     */
}