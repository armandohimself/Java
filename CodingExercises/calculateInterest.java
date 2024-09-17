package CodingExercises;

public class calculateInterest {
    public static void calculateInterest(int dollarAmount) {
        for (double interestRate = 7.5; interestRate <= 10; interestRate += .25) {
            System.out.println( dollarAmount * (interestRate / 100) );
        }
    }

    public static void main(String[] args) {
        calculateInterest(100);   
    }
}