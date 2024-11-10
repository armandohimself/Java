package Week1;

public class StringMethods {
    public static void main(String[] args) {
        
        //String name = "Armando Arteaga";
        String text = "Hello, Java, World!";

        String arr[] = {"Foo", "Bar", "FooBar"};

        if (arr[0].length() < 3) {
            System.out.println("String length is less than 3");
        } else if (arr[0].length() <= 3) {
            System.out.println("I know the length is 3");
        }

        int x = 5;

        switch(x) {
            case 6: System.out.println("case 6 ran");
            default: System.out.println("The default case ran.");
            case 7: System.out.println("case 7 ran");
            case 10: System.out.println("case 10 ran");
        }

        // System.out.println(charAt(name));
        // System.out.println(length(name));
        // System.out.println(format("Hello, %s!", name));
        // System.out.println(formatWithLocale(java.util.Locale.US, "Hello, %s!", name));
        // System.out.println(substring(name));
        // System.out.println(substringWithEnd(name));
        // System.out.println(contains(text, "Java"));
        // System.out.println(join(", ", "Apple", "Orange", "Banana"));
        // System.out.println(joinWithIterable(", ", java.util.Arrays.asList("Apple", "Orange", "Banana")));
        // System.out.println(equals(name, "Armando Arteaga"));
        // System.out.println(isEmpty(name));
        // System.out.println(concat(name, " Developer"));
        // System.out.println(replace(name, 'A', 'O'));
        // System.out.println(replaceSequence(name, "Arteaga", "Developer"));
        // System.out.println(equalsIgnoreCase(name, "armando arteaga"));
        // System.out.println(java.util.Arrays.toString(split(text, ",")));
        // System.out.println(java.util.Arrays.toString(splitWithLimit(text, "\\s", 2)));
        // System.out.println(intern(text));
        // System.out.println(indexOf(name, 'A'));
        // System.out.println(indexOfFrom(name, 'A', 1));
        // System.out.println(indexOfSubstring(name, "Arteaga"));
        // System.out.println(indexOfSubstringFrom(name, "Arteaga", 1));
        // System.out.println(toLowerCase(name));
        // System.out.println(toLowerCaseWithLocale(name, java.util.Locale.US));
        // System.out.println(toUpperCase(name));
        // System.out.println(toUpperCaseWithLocale(name, java.util.Locale.US));
        // System.out.println(trim("  Hello, World!  "));
        // System.out.println(valueOf(123));
    }

    public static char charAt(String str) {
        // Return the char value at index 6 in your name
        return str.charAt(6);
    }

    public static int length(String str) {
        // Return the length of the given string
        return str.length();
    }

    public static String format(String format, Object... args) {
        //! Return a formatted string using the given format and arguments
        return String.format(format, args);
    }

    public static String formatWithLocale(java.util.Locale l, String format, Object... args) {
        //! Return a formatted string with the given locale
        return String.format(l, format, args);
    }

    public static String substring(String str) {
        // Return a substring from index 4 to the end of the given string
        return str.substring(4);
    }

    public static String substringWithEnd(String str) {
        // Return a substring from index 4 to index 10 of the given string
        return str.substring(4, 10);
    }

    public static boolean contains(String str, CharSequence s) {
        // Return true if the string contains the specified sequence
        return str.contains(s);
    }

    public static String join(CharSequence delimiter, CharSequence... elements) {
        //! Return a joined string with the given delimiter
        return String.join(delimiter, elements);
    }

    public static String joinWithIterable(CharSequence delimiter, java.lang.Iterable<? extends CharSequence> elements) {
        //! Return a joined string with the given delimiter using an Iterable
        return String.join(delimiter, elements);
    }

    public static boolean equals(String str, Object another) {
        // Check if the string equals the given object
        return str.equals(another);
    }

    public static boolean isEmpty(String str) {
        // Check if the string is empty

        //? What's the diff for isBlank();
        // It's the difference between "" and " "; first is empty, second is blank because of whitespace characters
        return str.isEmpty();
    }

    public static String concat(String str, String addition) {
        // Concatenate the specified string to the given string
        return str.concat(addition);
    }

    public static String replace(String str, char oldChar, char newChar) {
        //! Replace all occurrences of oldChar with newChar in the string
        return str.replace(oldChar, newChar);
    }

    public static String replaceSequence(String str, CharSequence oldSeq, CharSequence newSeq) {
        // Replace all occurrences of oldSeq with newSeq in the string
        return str.replace(oldSeq, newSeq);
    }

    public static boolean equalsIgnoreCase(String str, String another) {
        //! Check if the string equals another string, ignoring case
        return str.equalsIgnoreCase(another);
    }

    public static String[] split(String str, String regex) {
        //! Split the string based on the regex
        return str.split(regex);
    }

    public static String[] splitWithLimit(String str, String regex, int limit) {
        // Split the string based on the regex with a limit on the number of results
        return str.split(regex, limit);
    }

    public static String intern(String str) {
        //! Return the interned string; meaning we'll point to the same place in memory for this string and they will be equalled to each other if I assigned it to a new variable.
        return str.intern();
    }

    public static int indexOf(String str, int ch) {
        // Return the index of the specified char in the string
        return str.indexOf(ch);
    }

    public static int indexOfFrom(String str, int ch, int fromIndex) {
        // Return the index of the specified char in the string starting from the given index
        return -1;
    }

    public static int indexOfSubstring(String str, String substring) {
        // Return the index of the specified substring in the string
        return -1;
    }

    public static int indexOfSubstringFrom(String str, String substring, int fromIndex) {
        // Return the index of the specified substring starting from the given index
        return -1;
    }

    public static String toLowerCase(String str) {
        // Convert the string to lowercase
        return null;
    }

    public static String toLowerCaseWithLocale(String str, java.util.Locale l) {
        // Convert the string to lowercase using the specified locale
        return null;
    }

    public static String toUpperCase(String str) {
        // Convert the string to uppercase
        return null;
    }

    public static String toUpperCaseWithLocale(String str, java.util.Locale l) {
        // Convert the string to uppercase using the specified locale
        return null;
    }

    public static String trim(String str) {
        // Remove leading and trailing whitespace from the string
        return null;
    }

    public static String valueOf(int value) {
        // Convert the given int to a string
        return String.valueOf(value);
    }
}
