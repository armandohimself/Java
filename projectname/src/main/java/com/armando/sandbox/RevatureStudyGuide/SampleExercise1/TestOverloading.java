package com.armando.sandbox.RevatureStudyGuide.SampleExercise1;

//Base class
class Bank {
    public float getRateOfInterest() {
        return 0.0f; // Default rate, to be overriden by subclasses
    }
}

//SBI subclass
class SBI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 8.0f;
    }
}

//ICICI subclass
class ICICI extends Bank {
    @Override
    public float getRateOfInterest() {
        return 7.0f;
    }
}

//AXIS subclass
class AXIS extends Bank {
    @Override
    public float getRateOfInterest() {
        return 9.0f;
    }
}

class TestOverloading {
    public static void main(String[] args) {
        // Create instances of each bank
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        //Display the interest rates for each bank
        System.out.println("The interest rate of SBI is: " + sbi.getRateOfInterest() + "%");
        System.out.println("The interest rate of ICICI is: " + icici.getRateOfInterest() + "%");
        System.out.println("The interest rate of AXIS is: " + axis.getRateOfInterest() + "%");
    }
    
}
/*
 * //? When do I need to use public class? It seems like I can only use 1 public class in a given file maybe?
 * 
 * 
 */