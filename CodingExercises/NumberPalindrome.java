package CodingExercises;

public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(36063);
    }


    public static boolean isPalindrome(int number) {
        String numberString = String.valueOf(number);
        char[] numberStringArr = numberString.toCharArray();
        char[] reversedNumberStringArr = new char[numberStringArr.length - 1];
        boolean isAPalindrome = false;
        System.out.println("numberStringArr?" + numberStringArr.toString());

        for (int i = numberStringArr.length - 1; i <= 0; i--) {
            reversedNumberStringArr[i] = numberStringArr[i];
            System.out.println("reversedNumberStringArr: " + reversedNumberStringArr[i]);
            System.out.println("numberStringArr: " + numberStringArr[i]);
        }




        //if isPalindrome   
            //return true;
        // otherwise 
            // return false
            
        return isAPalindrome;
    }
}