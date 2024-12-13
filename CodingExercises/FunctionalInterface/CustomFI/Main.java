package CodingExercises.FunctionalInterface.CustomFI;

public class Main {
    public static void main(String[] args) {
        
        // ---- Functional Programming ----------------------- //

        // STEP 1: Write functionality (define a lambda implementation for the functional interface)
        Prettifier prettifierImpl = x -> "*~*~ " + x + " ~*~*";
        // Breakdown of the above statement:
        // - `Prettifier` is the functional interface reference (the "supertype").
        // - `prettifierImpl` is the variable holding the lambda implementation.
        // - `x -> "*~*~ " + x + " ~*~*"` is the lambda expression:
        //   - `x`: The input parameter to the lambda, inferred as `Object` based on the functional interface.
        //   - `->`: Separates the parameter(s) on the left from the body (logic) on the right.
        //   - `"*~*~ " + x + " ~*~*"`: The transformation logic (what the lambda does).

        /* Comparison with normal OOP:
         * OOP Example:
         * Animal anim = new Dog(); // `Animal` is the reference type, `Dog` is the implementation.
         * In functional programming:
         * Prettifier prettifierImpl = x -> "*~*~ " + x + " ~*~*"; // `Prettifier` is the reference type, and the lambda is the implementation.
         */

        // STEP 2: Use the functionality
        Integer myInteger = 5; // Example input
        String result = prettifierImpl.prettify(myInteger);
        // - The `prettify` method of the functional interface is called with `5` as input.
        // - `prettifierImpl` applies the lambda logic to `5`, resulting in "*~*~ 5 ~*~*".
        System.out.println(result); // Output: *~*~ 5 ~*~*

        // STEP 3: Swap implementations
        prettifierImpl = x -> "+-+- " + x + " -+-+";
        // - This is equivalent to swapping subclass objects in OOP (e.g., `anim = new Cat()`).
        // - The new lambda logic transforms `x` into "+-+- x -+-+".
        result = prettifierImpl.prettify(myInteger); // Apply the new logic.
        System.out.println(result); // Output: +-+- 5 -+-+

        /*
         * Key Functional Programming Notes:
         * 1. Lambdas are like lightweight, inline functions that don't need to be part of a class.
         * 2. A functional interface is required to define the lambda's "contract" (the single abstract method).
         * 3. Functional programming emphasizes flexibility:
         *    - You can easily swap implementations (like swapping subclass objects in OOP).
         *    - Requires much less boilerplate compared to defining a full subclass.
         */
    }
}