package com.armando.sandbox.CodingExercises.StudyHarder;

public class TrimMethod {
    /* 
     * 7. Trimming Strings in a List:
You can use trim() on each string in a collection (like a List of strings).

java
Copy code
List<String> words = Arrays.asList("  Java  ", "  Programming  ", "  Language  ");
List<String> trimmedWords = words.stream().map(String::trim).collect(Collectors.toList());
System.out.println(trimmedWords);  // Output: [Java, Programming, Language]
This example trims every string in the list.
8. Trimming Special Unicode Characters:
trim() only removes whitespace characters defined by Unicode, which includes space (' '), tab ('\t'), and new line ('\n'). It does not remove non-breaking spaces ('\u00A0').

To handle this, you can use a custom trimming method:

java
Copy code
String str = "\u00A0Hello World!\u00A0";
String result = str.replaceAll("^[\\s\\u00A0]+|[\\s\\u00A0]+$", "");
System.out.println(result);  // Output: "Hello World!"
This removes both normal and non-breaking spaces from the string.
9. Trimming an Array of Strings:
You can use trim() on every element of a string array.

java
Copy code
String[] arr = {"  Apple  ", "  Banana  ", "  Orange  "};
String[] trimmedArr = Arrays.stream(arr).map(String::trim).toArray(String[]::new);
System.out.println(Arrays.toString(trimmedArr));  // Output: [Apple, Banana, Orange]
This example trims each string in the array.
10. Using trim() in a Comparator for Sorting:
When sorting strings, you may want to ignore leading and trailing spaces by trimming each string before comparison.

java
Copy code
List<String> names = Arrays.asList("  Charlie  ", "  Alice  ", "  Bob  ");
names.sort(Comparator.comparing(String::trim));
System.out.println(names);  // Output: [  Alice  ,   Bob  ,   Charlie  ]
The trim() method is applied in the comparator to sort the strings without considering leading and trailing spaces.
     */
}
