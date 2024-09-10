package CodingExercises;

public class DayOfTheWeek {
    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch(day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> " is not a valid day of the week";
        };

        System.out.println(day + " was chosen\n" + day + dayOfWeek);
    }

    public static void printWeekDay(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if ( day == 1) {
            System.out.println("Monday");
        } else if ( day == 2) {
            System.out.println("Tuesday");
        } else if ( day == 3) {
            System.out.println("Wednesday");
        } else if ( day == 4) {
            System.out.println("Thursday");
        } else if ( day == 5) {
            System.out.println("Friday");
        } else if ( day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
    public static void main(String[] args) {
        printDayOfWeek(0);
        printWeekDay(0);

        printDayOfWeek(1);
        printWeekDay(1);

        printDayOfWeek(2);
        printWeekDay(2);

        printDayOfWeek(3);
        printWeekDay(3);

        printDayOfWeek(4);
        printWeekDay(4);

        printDayOfWeek(5);
        printWeekDay(5);

        printDayOfWeek(6);
        printWeekDay(6);

       printDayOfWeek(7);
        printWeekDay(7);
    }
}