package CodingExercises.Arrays.Arrays2ArrayList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//! Creating Instantiated Array 
        // Start off with an initialized array
        String[] originalArray = new String[] {"First", "Second", "Third"};
    
//! Converting Array to List 

    //! .asList() - (NOT resizable, but is mutable)
    //? This means that you can modify the elements in the list but can add() or remove()
        // We can use asList() and pass the array as the arguement to make a List
        var originalList = Arrays.asList(originalArray);
        //! The var keyword here is great because we don't know the type it will return
        /* Both List and Array point to the same thing */

        //? .set(indexPosition, value) will change the value at the index position
        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));
        /* The set() option made the changes to both List and Array */

        //? You can use Comparator on the List to sort it too, not just ArrayLists
        // Sorting the List will also sort the Array
        originalList.sort(Comparator.naturalOrder());
        /* You'll notice that uppercase is < lowercase for some reason */
        System.out.println("array: " + Arrays.toString(originalArray));

        //? originalList.remove(0);
        //! You get a java.lang.UnsupportedOperationException meaning you can't do this
        /* Reason being because it's pointing to an Array and you can't change Array sizes */

    //! List.of() - (List is IMMUTABLE)
    //? Meaning you can change a damn thing - used for environment variables or when you don't want
        //? something to change or be changed
        String[] stringArray = new String[] {"Array", "ClassCast", "NumberFormat"};
        List<String> stringList = List.of(stringArray);
        System.out.println(stringList);
    
        // You can then pass List as the arguement in the initialization of an ArrayList
        ArrayList<String> arrayList = new ArrayList<String>(originalList);

    }
}