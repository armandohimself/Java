package CodingExercises;

public class MethodOverload {

    public static void displayConversion(double result) {
        System.out.println("result is: " + result);
    }

    public static double convertToCentimeters (int heightInInches) {
        double conversion = heightInInches * 2.54;
        displayConversion(conversion);
        return conversion;
    }

    public static double convertToCentimeters (int heightInFeet, int remainingHeightInInches) {
        int totalInches = ((heightInFeet * 12) + remainingHeightInInches);
        return convertToCentimeters(totalInches);
    }

    public static void main(String[] args) {
        //Showing how to method overload. Things to note: a return type for the method is not part of the signature
        convertToCentimeters(5, 8);    
        convertToCentimeters(68);    
        
    }
}