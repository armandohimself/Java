package com.armando.sandbox.CodingExercises.ArrayList.MobilePhone;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("Contact name %s and their phone number: %s", name, phoneNumber);
    }
}