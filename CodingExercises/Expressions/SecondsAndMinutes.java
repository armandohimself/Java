package CodingExercises.Expressions;

public class SecondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 5));
        System.out.println(getDurationString(65, 65));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 5));
        System.out.println(getDurationString(65, -5));

    }

    public static String getDurationString(int seconds) {
        String durationString = "";

        if(seconds < 0) {
            return "Can't have negative time!";
        }

        int minutes = seconds / 60;

        if (minutes >= 60) {
            durationString = getDurationString(seconds / 60, seconds % 60);
        } else {
            durationString = minutes + "m " + seconds + "s";
        }
       return durationString;
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 ) {
            return "Can't have negative time!";
        }

        int hours = minutes / 60;
        minutes = (minutes % 60) + (seconds / 60);
        seconds = seconds % 60;


        
        return hours + "h " + minutes + "m " + seconds + "s";
    }


}