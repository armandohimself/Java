package CodingExercises.ControlFlow;

public class PrimeNumChecker {
    public static boolean isPrime (int wholeNumber) {
        int counter = 0;

        if (wholeNumber <= 2) {
            counter ++;
            System.out.println("Our counter is: " + counter);
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            counter++;
            if (wholeNumber % divisor == 0) {
                return false;
            } else if (counter == 3) {
                break;
            }
        }

        System.out.println("Our counter is: " + counter);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(56));
    }
}