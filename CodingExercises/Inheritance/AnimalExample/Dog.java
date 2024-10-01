package CodingExercises.Inheritance.AnimalExample;

public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        // super(); 
        //! Super must be called at the top 
        /* Without parameters, Dog does inherit the attributes of Animal
         * however, everything is null or zero. So we must pass in some
         * values. 
         */

        super("Mutt", "medium", 25);
        System.out.println("Dog constructor created");
    }

    //! 2 Parameter Constructor
    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    //! We can now create a dog specific constructor as well
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), 
            weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark() {
        System.out.println("Woof!");
    }
    
    public void run() {
        System.out.println("Dog running...");
    }
    
    public void walk() {
        System.out.println("Dog walking...");
    }
    
    public void wagTail() {
        System.out.println("Tail wagging...");
    }

    //! Example of overriding a method
    @Override
    public void move(String speed) {
        super.move(speed);
        // System.out.println("Dogs walk, run, and wag their tail");
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        // Now this code does something different from the Animal class method move
    }

    //! What the code looks like implicitly 
    // @Override
    // public void move(String speed) {
    //     super.move(speed);
    // }

    @Override
    public String toString() {
        return "Dog ear shape is " + earShape + 
            " and has a " + tailShape + " tailshape" + super.toString();
    }
}

/*
 * //! NOTES
 * When calling out to super you should be aware if your signature matches
 * whats in the parent class, otherwise you may need to define it implicitly.
 * 
 * We had to manually call super() here ONLY IF my super class (Animal class)
 * didn't have a default constructor
 */