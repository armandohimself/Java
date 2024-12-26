package com.armando.sandbox.CodingExercises.LinkedList.ItineraryChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InstructorsCode {
    // By using a record we have a constructor, accessor methods, & an overriden toString() method created implicitly
    record Place(String name, int distance) {
        @Override
        public final String toString() {
            return String.format("%s (%d)", name, distance);
        }
    }

    public static Scanner scanner = new Scanner(System.in); // Class level scanner so we can use it in our main


    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>(); // placesToVisit is going to contain a LinkedList of my Place record
        //? I guess you can make a type of anything you want to model

        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);

        // Testing for duplicates
        //addPlace(placesToVisit, new Place("Adelaide", 1374));
        // Test passed

        //"Sydney", "Adelaide", "A", "", "", "", ""
        addPlace(placesToVisit, new Place("Alice Springs", 2771));
        addPlace(placesToVisit, new Place("Brisbane", 917));
        addPlace(placesToVisit, new Place("Darwin", 3972));
        addPlace(placesToVisit, new Place("Melbourne", 877));
        addPlace(placesToVisit, new Place("Perth", 3923));
        addPlace(placesToVisit, new Place("Sydney", 0));
        System.out.println(placesToVisit);

        var iterator = placesToVisit.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quitLoop = false;
        boolean forward = true;
        
        displayMenu();

        while(!quitLoop) {
            // Guard Clause for Beginning of List
            if(!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }

            // Guard Clause for End of List
            if(!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }

            System.out.println("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch(menuItem) {
                case "F" -> {
                    System.out.println("User wants to move forwards");

                    // Reversing direction
                    if(!forward) {  
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next(); // Adjust position forward
                        }
                    }

                    // Moving forward
                    if(iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    System.out.println("User wants to move backwards");

                    // Reversing direction
                    if(forward) {  
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous(); // Adjust position forward
                        }
                    }

                    if(iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "L" -> System.out.println(placesToVisit);
                case "M" -> displayMenu();
                case "Q" -> System.exit(0);
                default -> {quitLoop = true;}
            }
        }
    //EOC
    }


    private static void addPlace(LinkedList<Place> list, Place place) {
        // Guard Clause
        if(list.contains(place)) {
            System.out.println("Found duplicate: " + place);
            return;
        }

        // Testing Case Sensitivity
        for (Place p : list) {
            // Step through each element of type Place in the LinkedList<Place> list
            if(p.name().equalsIgnoreCase(place.name)) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }

        //! SORT BY DISTANCE
        int matchedIndex = 0;
        for (var listPlace: list) {
            if(place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }

        list.add(place);
    }

    private static void displayMenu() {
        System.out.println(
            """
            Available actions (select word or letter):
            (F)orward
            (B)ackward
            (L)ist Places
            (M)enu
            (Q)uit""");
    }
}