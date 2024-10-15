package CodingExercises.ArrayList.ArrayListBreakdown;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayList2Array {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(List.of("keyboard", "mouse", "monitor"));
        String[] array = arrayList.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
    }
}
