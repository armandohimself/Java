package CodingExercises;

public class TeenNumberChecker {
    public static boolean hasTeen (int child1, int child2, int child3) {
        if (isTeen(child1)) {
            return true;
        } else if (isTeen(child2)) {
            return true;
        } else if (isTeen(child3)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean isTeen (int teenAge) {
        if (teenAge >= 13 && teenAge <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        TeenNumberChecker TNC = new TeenNumberChecker();
        TNC.hasTeen(9, 99, 19);
        TNC.hasTeen(23, 15, 42);
        TNC.hasTeen(22, 23, 34);
    }
}