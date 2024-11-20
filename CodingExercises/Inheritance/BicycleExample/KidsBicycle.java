package CodingExercises.Inheritance.BicycleExample;

public class KidsBicycle extends Bicycle{
    private int NumberOfTrainingWheels;

    public KidsBicycle(int startCadence, int startSpeed, int startGear, int NumberOfTrainingWheels) {
        super(startCadence, startSpeed, startGear);
        NumberOfTrainingWheels = this.NumberOfTrainingWheels;
    }
    
    public void AddTrainingWheels() {
        NumberOfTrainingWheels = 2;
        System.out.println("The kid bike now has " + NumberOfTrainingWheels + " training wheels on it");
    }

    public void RemoveTrainingWheels() {
        NumberOfTrainingWheels = 0;
        System.out.println("The kid bike now has " + NumberOfTrainingWheels + " training wheels on it");
    }    
}

/*
 * Create a subclass of Bicycle called KidsBicycle that:
    [] Adds a new int field called "NumberOfTrainingWheels"
    [] Adds two new methods:
    [] "AddTrainingWheels" sets the NumberOfTrainingWheels to the number 2.
    [] "RemoveTrainingWheels" sets the NumberOfTrainingWheels to the number 0.
 */