package CodingExercises;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //! X
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    //! Y
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        int xB = x;
        int yB = y;
        return Math.sqrt((xB - 0) * (xB - 0) + (yB - 0) * (yB - 0));
    }

    public double distance(Point other) {
        int xA = 0;
        int yA = 0;

        int xB = other.x;
        int yB = other.y;
        // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double getDistance(int x, int y) {
        int xA = x;
        int yA = y;
        return Math.sqrt((this.x - xA) * (this.x - xA) + (this.y - yA) * (this.y - yA));
    }

    public static void main(String[] args) {
        
    }
}