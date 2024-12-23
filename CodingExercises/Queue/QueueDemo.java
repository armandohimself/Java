package CodingExercises.Queue;

import java.util.LinkedList;
import java.util.Queue;

class DeliCustomer {
    private String customerName;
    private int DeliTicketNumber;

    protected DeliCustomer(String name, int ticketNum) {
        this.customerName = name;
        this.DeliTicketNumber = ticketNum; // For butcher to make give someone a number
    }

    //* Setters
    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setDeliTicketNumber(int ticketNum) {
        this.DeliTicketNumber = ticketNum; // To set a number if needed
    }


    //* Getters
    public String getCustomerName() {
        return this.customerName;
    }

    public int getTicketNumber() {
        return this.DeliTicketNumber;
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue<DeliCustomer> delicatessenQueue = new LinkedList<>();

        // Add customers to the queue without assigning ticket numbers
        delicatessenQueue.add(new DeliCustomer("Armando Arteaga", 0));
        delicatessenQueue.add(new DeliCustomer("Alice", 0));
        delicatessenQueue.add(new DeliCustomer("Bob", 0));
        delicatessenQueue.add(new DeliCustomer("Charlie", 0));
        delicatessenQueue.add(new DeliCustomer("Diana", 0));
        delicatessenQueue.add(new DeliCustomer("Ethan", 0));
        delicatessenQueue.add(new DeliCustomer("Fiona", 0));
        delicatessenQueue.add(new DeliCustomer("George", 0));
        delicatessenQueue.add(new DeliCustomer("Hannah", 0));
        delicatessenQueue.add(new DeliCustomer("Isaac", 0));
        delicatessenQueue.add(new DeliCustomer("Julia", 0));
        delicatessenQueue.add(new DeliCustomer("Kevin", 0));

        // Assign ticket numbers to each
        int ticketNumber = 0;
        for(DeliCustomer customer : delicatessenQueue) {
            customer.setDeliTicketNumber(++ticketNumber);
        }

        System.out.println("Welcome to the Kool Katz Delicatessen!");

        while(!delicatessenQueue.isEmpty()) {

            DeliCustomer customer = delicatessenQueue.poll();

            if(customer != null) {
                System.out.println("Now serving #" + customer.getTicketNumber() + " for " + customer.getCustomerName());
                System.out.println("ORDER UP - CUSTOMER SERVED, NEXT!");
            } else {
                System.out.println("ALL CUSTOMERS SERVED, HAVE A GREAT DAY");
            }

        }
        
    }
}

/*
 * Exercises (Optional)
Write a Java program that uses the Queue interface to create a line of twelve customers. 
Then assigns delicatessen ticket numbers, starting at 1 to those customers, in the proper order.

A delicatessen (or deli) is a shop that sells high-quality, prepared foods, and cold cut meats/cheeses.
 */