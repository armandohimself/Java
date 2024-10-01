package CodingExercises.ControlFlow;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));

        System.out.println(isValid(9));
    }
    
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) return false;
        
        int n1R = num1 % 10;
        int n2R = num2 % 10;
        int n3R = num3 % 10;
        
        return n1R == n2R || n1R == n3R || n2R == n3R;
    }
    
    //? Had issues with challenges assertion tests
    // My botton solution is dependent on the method above versus the other solution makes it independent from each other
    // public static boolean isValid (int number) {
    //     System.out.println("Checking num: " + number);
    //     return (number < 10 || number > 1000);
    // }

    public static boolean isValid (int number) {
        System.out.println("Checking num: " + number);
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }

}