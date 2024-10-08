package CodingExercises.Composition.BedroomExample;

public class Ceiling {
    private int paintedColor;
    private int height;

    public Ceiling(int paintedColor, int height) {
        this.paintedColor = paintedColor;
        this.height = height;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public int getHeight() {
        return height;
    }
}