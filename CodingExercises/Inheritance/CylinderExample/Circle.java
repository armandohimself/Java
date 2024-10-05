package CodingExercises.Inheritance.CylinderExample;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        // Guard Clause
        if (radius < 0 ) return 0;
        
        return radius;
    }

    public double getArea() {
        // Alternative return Math.pow(radius, 2) * Math.PI
        return radius * radius * Math.PI;
    }
}