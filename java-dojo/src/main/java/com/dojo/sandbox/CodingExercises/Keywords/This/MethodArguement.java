package com.armando.sandbox.CodingExercises.Keywords.This;

class Person {
    private String name; 

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void introduce(Friend friend) {
        friend.callMe(this);
    }
}

class Friend {
    public void callMe(Person person) {
        System.out.println("Hey, " + person.getName() + "!");
    }
}

public class MethodArguement {
    public static void main(String[] args) {
        Person alice = new Person("Alice");
        Friend bob = new Friend();
        alice.introduce(bob);
    }
}