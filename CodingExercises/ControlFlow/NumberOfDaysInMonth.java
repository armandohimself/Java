package CodingExercises.ControlFlow;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        // Guard Clause
        if (year <= 1 || year >= 9999) {
            return false;
        } 

        // Guard Clause
        if (year % 4 == 0) {
            
            // Continued Leap Year Algorithm
            if (year % 100 == 0) {
                // Guard Clause
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true; 
            }
        } 
    
        // otherwise default is false
        return isLeapYear;
    }
    
    public static int getDaysInMonth (int month, int year) {
        // Guard Clause for Month
        if(month < 1 || month > 12) {
            return -1;
        }

        // Guard Clause for Year
        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1 -> { yield 31;}
            case 2 -> { 
                if (isLeapYear(year)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            case 3 -> { yield 31; } 
            case 4 -> { yield 30; }  
            case 5 -> { yield 31; }  
            case 6 -> { yield 30; }  
            case 7 -> { yield 31; }  
            case 8 -> { yield 31; }  
            case 9 -> { yield 30; }  
            case 10 -> { yield 31; }  
            case 11 -> { yield 30; }  
            case 12 -> { yield 31; }  
            default -> {yield -1;}
        };
    }


    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
}

/*
 * //!Number Of Days In Month Challenge
[X] Write a method isLeapYear with a parameter of type int named year. 
[X] The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
[X] If the parameter is not in that range return false. 
[X] Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. 
[X] A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.

//* From isLeapYear Exercise
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

Examples of input/output:
isLeapYear(-1600); →  should return false since the parameter is not in the range (1-9999)
isLeapYear(1600); → should return true since 1600 is a leap year
isLeapYear(2017); → should return false since 2017 is not a leap year
isLeapYear(2000); → should return true because 2000 is a leap year 

​NOTE:  The solution to the Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution if you wish.

[X] Write another method getDaysInMonth with two parameters month and year. ​Both of type int.
[X] If parameter month is < 1 or > 12 return -1. ​
[X] If parameter year is < 1 or > 9999 then return -1.
[] This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
[] You should check if the year is a leap year using the method isLeapYear described above.

Examples of input/output:
getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.

HINT: Use the switch statement.
NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.
NOTE: Do not add a main method to solution code.
 */