package HelloWorld;

    public class TestingPlayground {

        public static void main(String[] args) {
            // Example of charAt()
            charAtExample();
    
            // Example of compareTo()
            compareToExample();
    
            // Example of concat()
            concatExample();
    
            // Example of equals()
            equalsExample();
    
            // Example of equalsIgnoreCase()
            equalsIgnoreCaseExample();
        }
    
        private static void charAtExample() {
            String s = "hello";
            char result = s.charAt(1); // Get character at index 1
            System.out.println("Character at index 1: " + result); // Outputs 'e'
        }
    
        private static void compareToExample() {
            String s1 = "hello";
            String s2 = "world";
            int result = s1.compareTo(s2); // Compare s1 to s2
            System.out.println("Compare result: " + result); // Output will be negative since 'h' is less than 'w'
        }
    
        private static void concatExample() {
            String s1 = "hello";
            String s2 = "world";
            String result = s1.concat(s2); // Concatenate s2 to the end of s1
            System.out.println("Concatenated string: " + result); // Outputs "hello world"
        }
    
        private static void equalsExample() {
            String s1 = "hello";
            String s2 = "hello";
            String s3 = "Hello";
            boolean result1 = s1.equals(s2); // Compare s1 and s2
            boolean result2 = s1.equals(s3); // Compare s1 and s3
            System.out.println("s1 equals s2: " + result1); // Outputs true
            System.out.println("s1 equals s3: " + result2); // Outputs false
        }
    
        private static void equalsIgnoreCaseExample() {
            String s1 = "hello";
            String s2 = "Hello";
            boolean result = s1.equalsIgnoreCase(s2); // Compare s1 to s2, ignoring case
            System.out.println("s1 equalsIgnoreCase s2: " + result); // Outputs true
        }
    }