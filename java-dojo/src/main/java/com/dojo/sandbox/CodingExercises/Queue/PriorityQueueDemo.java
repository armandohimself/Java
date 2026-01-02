package com.armando.sandbox.CodingExercises.Queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

    // Step 1
    List<String> states = Arrays.asList(
        "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", 
        "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", 
        "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", 
        "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota", 
        "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", 
        "New Hampshire", "New Jersey", "New Mexico", "New York", "North Carolina", 
        "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", 
        "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", 
        "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"
    );

    // Step 2: Randomly select 5 states
    Collections.shuffle(states);

    List<String> randomStates = states.subList(0, 5);

    System.out.println("Our states that we pulled randomly are: " + randomStates);

    PriorityQueue<String> pq = new PriorityQueue<>(randomStates);

    // poll() retrieves and removes the smallest element based on the natural ordering (e.g., alphabetical for String) or a custom comparator, ensuring elements are dequeued in ascending priority order.
    while(!pq.isEmpty()) {
        System.out.println(pq.poll());
    }

    System.out.println(pq);
    }
}

/*
 * Exercises (Optional)
Write a program that takes five random United States, adds them to a Priority Queue in a random order, and then outputs the states in alphabetical order.
 */