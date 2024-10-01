package CodingExercises.Keywords.This;

class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
        new Reservation(this);
    }

    public String getName() {
        return name;
    }
}

class Reservation {
    private Guest guest;

    public Reservation(Guest guest) {
        this.guest = guest;
        System.out.println("Reservation made for " + guest.getName());
    }
}

public class ConstructorArguement {
    public static void main(String[] args) {
        Guest guest = new Guest("Alice");
    }
}
