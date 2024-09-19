package CodingExercises;

public class SumOddRange {
    public static boolean isOdd(int number) {
        boolean isOdd = false;

        //Guard Clause
        if (number < 0) {
            System.out.println("Negative numbers are not allowed");
            isOdd = false;
        }

        if (number % 2 == 0) {
            isOdd = false;
        } else isOdd =  true;
        

        return isOdd;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        //Guard Clause
        if (end <= start || start < 0 || end < 0) {
            return -1;
        }

        System.out.println("start: " + start);
        System.out.println("end: " + end);

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                System.out.println(i);
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // System.out.println(sumOdd(0, 0));
        // System.out.println(isOdd(6));
        // System.out.println(sumOdd(5, 10));
        // System.out.println(sumOdd(0, 5));
        // System.out.println(sumOdd(5, 5));
        System.out.println(sumOdd(10, 10));
    }
}

/*
 * //!Sum Odd
[X] Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
[X] Check that number is > 0, if it is not return false.
[X] If number is odd return true, otherwise return false.

[X] Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
[X] The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
[X] It should call the method isOdd to check if each number is odd.
[X] The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
[] If those conditions are not satisfied return -1 from the method to indicate invalid input.

Example input/output:
sumOdd(1, 100); → should return 2500
sumOdd(-1, 100); → should return -1
sumOdd(100, 100); → should return 0
sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
sumOdd(100, -100); → should return -1
sumOdd(100, 1000); → should return 247500

TIP: use the remainder operator to check if the number is odd

NOTE: Both methods needs to be defined as public static like we have been doing so far in the course.
NOTE: Do not add a main method to solution code.


 */