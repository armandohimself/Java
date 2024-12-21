import java.util.Collection;
import java.util.function.Predicate;

public class Container<T> {

    private T obj;
    // T is a placeholder for a specific type that is specified when you create an instance of a class
    // The field is private for encapsulation: preventing direct access to the field, ensuring the class controls how the field is accessed or modified (via getters and setters)

    public void setObject(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

    public T removeObject() {
        T temp = this.obj;
        obj = null;
        return temp;
    }

    //! NOTES:
    /*
     * You can't stop at just parameterizing the class, you need to do it for the instance variables, and get/setters 1) to avoid errors and 2) because that's what the instance variable type is now (type safety).
    */

    /*
        ! Exercises (Implementation)
        [X] Write a generic method 
        [X] to count the number of elements in a collection 
        [X] that have a specific property (for example, odd integers, prime numbers, palindromes).
    */
    
    public int countElements(Collection<T> collection, Predicate<T> property) {
        int count = 0;

        for (T element : collection) {
            if (property.test(element)) count++;
        }

        return count;
    }
    
    //? Why does Collection and Predicate work this way
    /*
     * 
     */
    

    /*
        ! Exercises (Implementation)
        [ ] Write a generic method 
        [ ] to exchange the positions of two different elements in an array.
    */

    public <T> void switchPositions(T[] array, int index1, int index2) {
        // Guard Clause
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) throw new IndexOutOfBoundsException("Invalid indices for array swap");

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //? Why does this work this way?
    /*
     * 
     */
}




/*
! Naming Convention for Generics 
E => Element
K => Map Key
V => Map Value
N => Number
T => Generic data type
S, U, V, and so on => For multiple generic data types
 */