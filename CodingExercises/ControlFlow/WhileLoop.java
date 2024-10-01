package CodingExercises.ControlFlow;

public class WhileLoop {

    public static boolean isEvenNumber(int number) {
        boolean isEven = false;

        //Guard Clause
        if (number < 0) return false;
        
        if (number % 2 == 0) isEven = true;

        return isEven;
    }

    public static void main (String[] args) {

        int evenNumberCounter = 0;
        int oddNumberCounter = 0;
        int j = 4;

        while (j <= 20) {
            j++;

            if (!isEvenNumber(j)) {
                oddNumberCounter++;
                continue;
                //Course included this continue statement however, 
                //- this is not needed due to the loop iterating regardless 
                //- and no condition is specified needed to skip to the next iteration
            }

            System.out.print(j + "_");
            evenNumberCounter++;
            
            //Guard Clause
            if(evenNumberCounter >= 5) {
                break;
            }
        }

        System.out.println("\nTotal numbers of even numbers found is " + evenNumberCounter);
        System.out.println("Total numbers of odd numbers found is " + oddNumberCounter);
    }
}