package com.armando.sandbox.CodingExercises.Optional.PhoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    // Class specific variable that can be shared across all instances but the reference to HashMap cannot be changed
    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        // Block of code is initialized immediately with put data
        {
            put("Ted Striker", "5551212");
            put("Roger Murdock", "3879812");
            put("Elaine Dickinson", "8675309");
        }
    };

    // Shared across all instances with default put data above 
    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    // Package-Priave No-arg Constructor
    PhoneBook() { }

    // Getter
    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    // * Optional isn't protecting against NullPointerException
    public Optional<String> findPhoneNumberByName(String name){
        Optional<String> foundNumber = Optional.empty();

        if (phoneBookEntries.containsKey(name)) {
            foundNumber = Optional.of(phoneBookEntries.get(name));
        }

        return foundNumber;
    }

    //! Better implementation 
    public String findPhoneNumberByNameOrDefault(String name) {
        return Optional.ofNullable(phoneBookEntries.get(name))
                       .orElse("No number found");
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){
        Optional<String> foundName = Optional.empty();

        for(Map.Entry<String, String> entry : phoneBookEntries.entrySet()) {
            if(entry.getValue().equals(phoneNumber)) {
                foundName = Optional.of(entry.getKey());
            }
        }

        return foundName;
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}