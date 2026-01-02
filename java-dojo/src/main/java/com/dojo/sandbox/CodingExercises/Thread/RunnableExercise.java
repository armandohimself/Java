package com.armando.sandbox.CodingExercises.Thread;

import java.util.Random;

public class RunnableExercise {
    public static void main(String[] args) {
        // Shared resources so the threads know about each other's data
        SharedData sharedData = new SharedData();

        // Create threads
        Thread generatorThread = new Thread(new RandomNumberGenerator(sharedData));
        Thread divisorThread = new Thread(new DivisorFinder(sharedData));
        Thread outputThread = new Thread(new OutputResults(sharedData));

        // Start threads
        generatorThread.start();
        try {
            generatorThread.join(); // Ensure generatorThread finishes first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        divisorThread.start();
        try {
            divisorThread.join(); // Ensure divisorThread finishes next
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        outputThread.start();
    }
}

// Placeholder for shared data
class SharedData {
    private int randomNumber;
    private int largestDivisor;
    private int divisorCount;
    private long startTime;
    private long endTime;

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int num) {
        randomNumber = num;
    }

    public int getLargestDivisor() {
        return largestDivisor;
    }

    public void setLargestDivisor(int num) {
        largestDivisor = num;
    }

    public int getDivisorCount() {
        return divisorCount;
    }

    public void setDivisorCount(int num) {
        divisorCount = num;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long time) {
        startTime = time;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long time) {
        endTime = time;
    }
}

// Placeholder classes for threads
class RandomNumberGenerator implements Runnable {
    private SharedData sharedData;

    public RandomNumberGenerator(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        sharedData.setStartTime(System.currentTimeMillis());
        Random rand = new Random();
        int min = 1;
        int max = 100000;
        sharedData.setRandomNumber(rand.nextInt((max - min + 1) + min));
    }
}

class DivisorFinder implements Runnable {
    private SharedData sharedData;

    public DivisorFinder(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        int number = sharedData.getRandomNumber();
        sharedData.setLargestDivisor(findLargestDivisor(number));
        sharedData.setDivisorCount(countDivisors(number));
        sharedData.setEndTime(System.currentTimeMillis());
    }

    private int findLargestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}

class OutputResults implements Runnable {
    private SharedData sharedData;

    public OutputResults(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        long elapsedTime = sharedData.getEndTime() - sharedData.getStartTime();
        System.out.println("Random Number: " + sharedData.getRandomNumber());
        System.out.println("Largest Divisor: " + sharedData.getLargestDivisor());
        System.out.println("Number of Divisors: " + sharedData.getDivisorCount());
        System.out.println("Elapsed time: " + elapsedTime + " ms");
    }
}


/*
 * Exercise (Optional)
Write a program to find the number in the range 1 to 100,000 that has the largest number of divisors. 

By using threads, your program will take less time to do the computation when it is run on a multiprocessor computer. 

At the end of the program, output the elapsed time, the integer that has the largest number of divisors, and the number of divisors that it has. 

For this exercise, you should simply divide up the problem into parts and create one thread to do each part.
 */