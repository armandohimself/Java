package com.dojo.sandbox.CodingExercises.Exceptions.UserProfileCollectorProject;

import java.util.Arrays;

public class UserProfile {
    private String name;
    private int age;
    private float heightInMeters;
    private String[] hobbiesArr;
    private boolean likesJava;

    public UserProfile(String name, int age, float heightInMeters, String[] hobbiesArr, boolean likesJava) {
        this.name = name; 
        this.age = age;
        this.heightInMeters = heightInMeters;
        this.hobbiesArr = hobbiesArr;
        this.likesJava = likesJava;
    }

    public String toString() {
        return String.format("""
            User Profile:
            -----------------
            Name: %s
            Age: %d years old
            Height: %.2f meters
            Hobbies: %s
            Likes Java: %b
            """, name, age, heightInMeters, String.join(", ", hobbiesArr), likesJava);
    }
}

/*
 * #### Challenge Description:
Write a program that collects user information to create a "profile" with the following details:
1. **Name:** A single-line string.
2. **Age:** A positive integer.
3. **Height:** A floating-point number representing height in meters.
4. **Hobbies:** A comma-separated list of hobbies (single-line string).
5. **Likes Java?**: A boolean answer (`true` or `false`).

Once all inputs are collected, the program should display the profile information in a readable format.
 */