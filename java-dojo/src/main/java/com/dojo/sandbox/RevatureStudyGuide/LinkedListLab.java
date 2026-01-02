package com.armando.sandbox.RevatureStudyGuide;

import java.util.LinkedList;

public class LinkedListLab {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        // Test addTask method
        addTask(tasks, "Task 1");
        addTask(tasks, "Task 2");
        addTask(tasks, "Task 3");

        // Test processTask method
        processTask(tasks);

        // Test isQueueEmpty method
        System.out.println("Queue empty? " + isQueueEmpty(tasks));

        // Test addTaskAtIndex method
        addTaskAtIndex(tasks, 0, "Task 0");

        // Test printTasks method
        printTasks(tasks);
    }

    // Implement this method to add a task to the queue
    public static void addTask(LinkedList<String> queue, String task) {
        // TODO: Implement this
        queue.add(task);
    }

    // Implement this method to process (remove) a task from the queue
    public static void processTask(LinkedList<String> queue) {
        // TODO: Implement this
        queue.poll();
    }

    // Implement this method to check if the queue is empty
    public static boolean isQueueEmpty(LinkedList<String> queue) {
        // TODO: Implement this
        return queue.isEmpty();
    }

    // Implement this method to add a task at a specific index
    public static void addTaskAtIndex(LinkedList<String> queue, int index, String task) {
        // TODO: Implement this
        queue.add(index, task);
    }

    // Implement this method to print all tasks
    public static void printTasks(LinkedList<String> queue) {
        // TODO: Implement this
        for(String task : queue) {
            System.out.println(task);
        }
    }
}

/*
Prompt:
1. Add a task to the queue.
2. Process (remove) a task from the queue.
3. Check if the queue is empty.
4. Add a task at a specific index.
5. Print all tasks in the queue.
*/
