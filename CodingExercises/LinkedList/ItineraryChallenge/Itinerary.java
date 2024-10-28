package CodingExercises.LinkedList.ItineraryChallenge;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Itinerary {
    public static Scanner scanner = new Scanner(System.in); // Class level scanner so we can use it in our main
    public static ListIterator<String> itineraryIterator; // Class level iterator so we can persist our position as we move along the LinkedList

    public static void main(String[] args) {
        LinkedList<String> itineraryList = new LinkedList<>();
        LinkedList<Integer> distanceFromSydneyList = new LinkedList<>();
        boolean flag = true;

        addLocationsToList(itineraryList);
        itineraryIterator = itineraryList.listIterator(1);

        addDistancesToList(distanceFromSydneyList);
        displayMenu();

        while(flag) {
            switch(scanner.nextLine().toUpperCase()) {
                case "F" -> moveForwards();
                case "B" -> moveBackwards();
                case "L" -> listPlaces(itineraryList);
                case "M" -> displayMenu();
                case "Q" -> System.exit(0);
                default -> {flag = false;}
            }
        }
    //EOC
    }

    public static void displayMenu() {
        System.out.println(
            """
            Available actions (select word or letter):
            (F)orward
            (B)ackward
            (L)ist Places
            (M)enu
            (Q)uit    
            """);
    }

    public static void addLocationsToList(LinkedList<String> list) {
        list.addAll(List.of("Sydney", "Adelaide", "Alice Springs", "Brisbane", "Darwin", "Melbourne", "Perth"));
        System.out.println(String.format("\nYou're itinerary is: %s\n", list));
    }

    public static void addDistancesToList(LinkedList<Integer> list) {
        list.addAll(List.of(0,1374, 2771, 917, 3972, 877, 3923));
    }

    public static void moveForwards() {
        String previousLocation = itineraryIterator.previous();
        itineraryIterator.next();
        try {
            if(itineraryIterator.hasNext()) {
                System.out.println("From --> " + previousLocation + " heading to --> " + itineraryIterator.next());
            } else {
                System.out.println("You're at the end of the list, currently at --> " + itineraryIterator.previous());
                itineraryIterator.next();
            }
        } catch (NoSuchElementException e) {
            System.out.println("You're at the end of the list.");
        }
    }

    public static void moveBackwards() {
        try {
            if (itineraryIterator.previousIndex() < 0) {
                System.out.println("Can't move more backwards, you're at the beginning of the list, currently at --> " + itineraryIterator.next());
                itineraryIterator.previous();
            }else if(itineraryIterator.hasPrevious()) {
                String previousLocation = itineraryIterator.previous();
                System.out.println("From --> " + previousLocation + " heading back to --> " + itineraryIterator.previous());
                itineraryIterator.next();
            } else {
                System.out.println("You're at the beginning of the list, currently at --> " + itineraryIterator.next());
                // itineraryIterator.previous();
            }
        } catch (NoSuchElementException e) {
            System.out.println("You're at the beginning of the list.");
        }
    }

    public static void listPlaces(LinkedList<String> list) {
        System.out.println(String.format("\nYou're itinerary is: %s\n", list));
    }
}