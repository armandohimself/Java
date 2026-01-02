package com.dojo.sandbox.CodingExercises.Thread;

import java.util.Scanner;

// Shared Counter class
class Counter {
    int count;

    // Increment method (not synchronized for now to show issues)
    void inc() {
        count = count + 1;
    }

    // Get the current count
    int getCount() {
        return count;
    }
}

// Thread class
class MyThreadClass implements Runnable {
    private Counter counter;
    private int increments;

    // Constructor to accept the shared Counter and the number of increments
    public MyThreadClass(Counter counter, int increments) {
        this.counter = counter;
        this.increments = increments;
    }

    @Override
    public void run() {
        for (int i = 0; i < increments; i++) {
            counter.inc(); // Increment the shared counter
        }
    }
}

public class ThreadExercise {
    static Counter sharedCounter = new Counter(); // Global shared Counter object

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();

        System.out.print("Enter the number of increments per thread: ");
        int increments = scanner.nextInt();

        scanner.close();

        // Create an array to hold all threads
        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new MyThreadClass(sharedCounter, increments));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join(); // Wait for this thread to terminate
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final value of the counter
        System.out.println("Final count: " + sharedCounter.getCount());
    }
}


/*
 * Exercise (Optional)
Can you get errors by using an unsynchronized counter with multiple threads? 
Write a program to find out. Use the following unsynchronized Counter class, which you can include as a nested class in your program:

static class Counter { int count; void inc() { count = count+1; } int getCount() { return count; } }

Write a Thread class that will repeatedly call the inc() method in an object of type Counter. 
The object should be a shared global variable. 
Create several threads, start them all, and wait for all the threads to terminate. 
Print the final value of the counter, and see whether it is correct.

Let the user enter the number of threads and the number of times that each thread will increment the counter. 
You might need a fairly large number of increments to see an error. 
And of course there can never be any error if you use just one thread. 
Your program can use join() to wait for a thread to terminate.
 */