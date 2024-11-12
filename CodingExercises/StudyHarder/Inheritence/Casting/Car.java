package CodingExercises.StudyHarder.Inheritence.Casting;

public class Car extends Vehicle {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.startEngine();           // Calls Vehicle's or Car's version based on whether it's overridden in Car

        ((Car) myCar).honk();          // Downcast to Car to access honk method

        Car someCar = ((Car) myCar);   // Cast myCar to Car
        someCar.honk();                // Calls honk() on Car, where this refers to the Car instance
    }

    public void honk() {
        System.out.println("Car honked");
        this.stopEngine();             // Calls stopEngine() on the Car instance (dynamic dispatch)
        this.startEngine();            // Calls startEngine() on the Car instance (dynamic dispatch)
    }
}
