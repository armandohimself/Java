package Week1;

public class ReverseArray {

    public static void main(String[] args) {
        
        String str = "Hello";

        System.out.println(reverse1(str));
        // System.out.println(reverse2(str));
        // System.out.println(reverse3(str));
        // System.out.println(reverse4(str));
    }

    // Challenge 1: Reverse a String Using StringBuilder
    public static String reverse1 (String str) {
        StringBuilder string = new StringBuilder(str);
        // Couldn't resolve the type at first because I'm not understanding what new StringBuilder(str) means. 
        return string.reverse().toString(); 
    }

    // Challenge 2: Reverse a String Using a for Loop (Manual Reversal)
    public static String reverse2 (String str) {
        return "";
    }

    // Challenge 3: Reverse a String Using a char Array
    public static String reverse3 (String str) {
        return "";
    }

    // Challenge 4: Reverse a String Using StringBuilder with a for Loop (Optimized)
    public static String reverse4 (String str) {
        return "";
    }
}
