/*
* Sample Exercise : 
To create an abstract class called Bank.
To create an abstract method called getRateOfInterest();
To create two subclasses called SBI - 7% and PNB - 5% as two banks that extend the abstract class Bank.
To implement different functionalities for the getRateOfInterest() method in the SBI and PNB classes through the concept of method overriding and print out the interest rate inside the main() method created separately in a test class called TestBank
*/
package SampleExercise3;

abstract class Bank {
    public int interestRate;
    abstract void getRateOfInterest(int interestRate);
}

class SBI extends Bank {
    void getRateOfInterest(int interestRate) {
        System.out.println("Getting SBI interest rate: " + interestRate + "%");
    }
}

class PNB extends Bank {
    void getRateOfInterest(int interestRate) {
        System.out.println("Getting PNB interest rate: " + interestRate + "%");

    }
}

public class TestBank {
    public static void main(String args[]) {

        SBI sbiBank = new SBI();
        sbiBank.getRateOfInterest(7);

        PNB pnbBank = new PNB();
        pnbBank.getRateOfInterest(5);
    }    
}


/*
* ChatGPT's response that I could do better. 

package SampleExercise3;

abstract class Bank {
    //* Abstract method to get the rate of interest
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    //* Implementing the abstract method for SBI
    @Override
    int getRateOfInterest() {
        return 7;  // SBI's interest rate
    }
}

class PNB extends Bank {
    Implementing the abstract method for PNB
    @Override
    int getRateOfInterest() {
        return 5;  // PNB's interest rate
    }
}

public class TestBank {
    public static void main(String[] args) {
        SBI sbiBank = new SBI();
        System.out.println("SBI Bank Interest Rate: " + sbiBank.getRateOfInterest() + "%");

        PNB pnbBank = new PNB();
        System.out.println("PNB Bank Interest Rate: " + pnbBank.getRateOfInterest() + "%");
    }
}

 */