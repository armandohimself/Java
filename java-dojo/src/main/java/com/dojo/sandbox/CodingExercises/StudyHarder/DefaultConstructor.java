/*
 * Was curious about this statement: 
 * The default constructor is a no-args constructor that the Java compiler inserts on your behalf; 
 * it contains a //!default call to super(); 
 * which is the default behavior.
 */

 package com.armando.sandbox.CodingExercises.StudyHarder;

public class DefaultConstructor {
    // Explicit default constructor
    public DefaultConstructor() {
        super(); // Explicitly calling super(), although this is redundant and usually implicit
        System.out.println("DefaultConstructor initialized, super() called.");
    }

    @Override
    public String toString() {
        return "Instance of DefaultConstructor class";
    }

    public static void main(String[] args) {
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println(obj); // Calls obj.toString() implicitly, inherited from Object 
    }
}

// Analysis: I get a hash number of the object and apparently we go to java.lang.object when a constructor is called
// Deeper dive later