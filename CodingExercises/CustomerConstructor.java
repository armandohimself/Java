package CodingExercises;

public class CustomerConstructor {
    private String name;
    private String email;
    private int creditLimit;
    
    //! Style preference to add constructors from least parameters to most 
    public CustomerConstructor() {
        this("No one", "hey@nobody.com");
        // * Chained constructor to call 2 parameter constructor
    }
    
    //! Did not include a credit limit above so that if we change creditLimit, which is hard coded, that we only change it one place.
    public CustomerConstructor(String name, String email) {
        this(name, email, 1000);
    }

    //! 3 parameter constructor
    public CustomerConstructor(String name, String email, int creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }



    //! Name Methods
    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getName() {
        return name;
    }

    //! Email Methods
    // public void setEmail(String email) {
    //     this.email = email;
    // }

    public String getEmail() {
        return email;
    }

    //! Credit Limit Methods
    // public void setCreditLimit(int creditLimit) {
    //     this.creditLimit = creditLimit;
    // }

    public int getCreditLimit() {
        return creditLimit;
    }

    public static void main(String[] args) {

        // Calling constructor with arguements defined
        CustomerConstructor customer = new CustomerConstructor("Jesse", "jesse@h&m.com", 50);
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());

        CustomerConstructor noBody = new CustomerConstructor();
        System.out.println(noBody.getName());
        System.out.println(noBody.getEmail());
        System.out.println(noBody.getCreditLimit());

        CustomerConstructor cc1 = new CustomerConstructor("Armando Arteaga", "hey@armandohimself.com");
        System.out.println(cc1.getName());
        System.out.println(cc1.getEmail());
        System.out.println(cc1.getCreditLimit());

    }
}