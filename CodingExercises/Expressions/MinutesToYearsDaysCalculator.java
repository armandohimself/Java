package CodingExercises.Expressions;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
           System.out.println("Invalid Value"); 
        } else {
            
            long hours = minutes / 60;
            long days = hours / 24;
            long years = 0;
            
            if (days >= 365) {
                years = days / 365;
                days = days % 365;
            }
            
            //1 hour = 60 minutes
            //1 day = 24 hours
            //1 year = 365 days
            
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}