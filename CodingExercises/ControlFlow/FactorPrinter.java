package CodingExercises.ControlFlow;

public class FactorPrinter {

    public static void main(String[] args) {
        // printFactors(6);
        // printFactors(32);
        printFactors(10);
        //printFactors(-1);
    }
    
    public static void printFactors (int number) {
            
        //Gaurd Clause
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {

            //! Factor Printing Algo
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}