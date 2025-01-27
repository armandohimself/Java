package com.armando.sandbox.RevatureStudyGuide;

import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        // Test addStudent method
        addStudent(students, "Alice");
        addStudent(students, "Bob");
        addStudent(students, "Charlie");

        // Test removeStudent method
        removeStudent(students, "Bob");

        // Test updateStudent method
        updateStudent(students, 1, "Eve");

        // Test checkStudent method
        System.out.println("Contains Alice? " + checkStudent(students, "Alice"));

        // Test getSize method
        System.out.println("Total students: " + getSize(students));

        // Test printStudents method
        printStudents(students);
    }

    // Implement this method to add a student to the list
    public static void addStudent(ArrayList<String> list, String student) {
        // TODO: Implement this
        list.add(student);
    }

    // Implement this method to remove a student from the list
    public static void removeStudent(ArrayList<String> list, String student) {
        // TODO: Implement this
        list.remove(student);
    }

    // Implement this method to update a student in the list
    public static void updateStudent(ArrayList<String> list, int index, String newName) {
        // TODO: Implement this
        list.set(index, newName);
    }

    // Implement this method to check if a student exists in the list
    public static boolean checkStudent(ArrayList<String> list, String student) {
        // TODO: Implement this
        return list.contains(student);
    }

    // Implement this method to get the size of the list
    public static int getSize(ArrayList<String> list) {
        // TODO: Implement this
        return list.size();
    }

    // Implement this method to print all students in the list
    public static void printStudents(ArrayList<String> list) {
        // TODO: Implement this
        for(String student : list) {
            System.out.println(student);
        }
    }
}

/*
Prompt:
1. Add a student to the list.
2. Remove a student from the list.
3. Update a student's name at a specific index.
4. Check if a student exists in the list.
5. Get the total number of students.
6. Print all students in the list.
*/
