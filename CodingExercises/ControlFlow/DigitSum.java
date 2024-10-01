package CodingExercises.ControlFlow;

public class DigitSum {
    public static int sumDigits (int number) {
        int sum = 0;
        int rightMostDigit = 0;

        //Guard Clause
        if (number < 0) return -1;
        
        // Algorithm: parse each digit and sum
        do {
            rightMostDigit = number % 10;
            sum += rightMostDigit;

            number = number / 10;
            System.out.println("number is now " + number);
        } while (number != 0);

        System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        sumDigits(25);
        sumDigits(5);
        sumDigits(1000);
    }
}