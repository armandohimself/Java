package CodingExercises.POJOs;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //! First Number
    public void setFirstNumber(double number) {
        this.firstNumber = number;
    }

    public double getFirstNumber() {
        return firstNumber;
    }


    //! Second Number
    public void setSecondNumber(double number) {
        this.secondNumber = number;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    
    //! Calculator Operations
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        if (secondNumber == 0) return 0;
        else return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
    SimpleCalculator calculator = new SimpleCalculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println("add= " + calculator.getAdditionResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
    System.out.println("divide= " + calculator.getDivisionResult());
    }
}

/*
 * Sum Calculator
[X] Write a class with the name SimpleCalculator. 
[X] The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.

Write the following methods (instance methods):
[X] Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
[X] Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
[X] Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
[X] Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
[X] Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
[X] Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
[X] Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
[X] Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. 
    In case the value of secondNumber is 0 then return 0.

TEST EXAMPLE
TEST CODE:
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());

OUTPUT
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0

TIPS:
add= 9.0 is printed because 5.0 + 4 is 9.0
subtract= 1.0 is printed because 5.0 - 4 is 1.0
multiply= 0.0 is printed because 5.25 * 0 is 0.0
divide= 0.0 is printed because secondNumber is set to 0

NOTE: All ​methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.
NOTE: Do not add the main method to the solution code.
 */