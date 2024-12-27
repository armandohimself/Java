package com.armando.sandbox.CodingExercises.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingCartDemo {
    
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        System.out.println("Arrived at grocery store and Armando put some things into the shopping cart");

        // hashMap.put("Oat Malk", 2);
        // hashMap.put("Grass Fed Beef: Family Pack", 2);
        // hashMap.put("A Dozen Pasture Raised Eggs", 2);
        // hashMap.put("Quart of Organic Yogurt", 1);
        // hashMap.put("Tub of Cottage Cheese", 2);
        // hashMap.put("Bag of Coffee Beans", 1);
        // hashMap.put("5 lbs bag of White Rice", 1);

        System.out.println("Armando is in the checkout line and is greeted by the cashier.");

        //! Since we want to remove, use Iterator to safely remove
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        int totalItemNumber = 0;

        if (hashMap.isEmpty()) {
            System.out.println("The shopping cart is empty! Try again");
            System.exit(0);
        }

        while(iterator.hasNext()) {
            // Store your keys and values to use in the program
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            totalItemNumber += value;

            StringBuilder cashierStringTally = new StringBuilder("Cashier scanned " + value + " " + key);

            // For grammer
            if(value < 2) cashierStringTally.append("s");

            if(key.contains("Cheese")) {
                System.out.println("Armando changed his mind about the " + key + ", he's lactose intolerant");
                iterator.remove();  //! Safe removal using Iterator
                // Use an else statement to skip the current position of iterator or use continue statement to skip to next interation of loop
                continue;
            }

            System.out.println(cashierStringTally.toString());
        }

        System.out.println("We scanned a total number of " + totalItemNumber + " items today");
    }
}

/*
 * Exercise (Optional)
Successfully execute a Java program which emulates operations with your shopping cart while shopping at a grocery store

You need to use following HashMap Operations:

put: If you want the item, you need to put the item into shopping cart.
get: Once you reach the checkout line, you need to get the items out of your shopping cart for the cashier to tally.
remove: If you don’t want an item in your cart, you need to remove it.
 */


//! Map Iteration Methods
 /*
* 5 Ways to Iterate w/ Map
  - Use entrySet() when you need both keys and values.
  - Use keySet() when you only need keys or want to fetch values manually.
  - Use values() when you only care about the values.
  - Use Iterator for advanced control over iteration.
  - Use Streams for modern, functional-style iteration.
*/

// * Iterate using entrySet()
// for (Map.Entry<Integer, String> entry : map.entrySet()) {
//     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
// }

// * Iterate using keySet()
// for (Integer key : map.keySet()) {
//     System.out.println("Key: " + key + ", Value: " + map.get(key));
// }

// * Iterate using values()
// for (String value : map.values()) {
//     System.out.println("Value: " + value);
// }

// * Iterate ising Iterator with entrySet()
// Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
// while (iterator.hasNext()) {
//     Map.Entry<Integer, String> entry = iterator.next();
//     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
// }

// * Iterate using Streams (Java 8+)
// map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
