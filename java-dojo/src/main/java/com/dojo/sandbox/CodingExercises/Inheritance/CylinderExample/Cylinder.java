package com.dojo.sandbox.CodingExercises.Inheritance.CylinderExample;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        // Guard Clause
        if (height < 0) return 0;

        return height;
    }

    // @Override
    // public double getArea() {
    //     return super.getArea();
    // }
    //! Why don't we need to call to super and run method in override?
    /* I already initialized our cylinder to have access to the getArea method
     * when I called super(radius). Thus you can simply call getArea.
     * If we were changing the behavior of the method then an override would
     * be necessary
    */

    public double getVolume() {
        return (getArea() * height);
    }
}