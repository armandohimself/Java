package CodingExercises.Keywords;

class Resident {
    int houseNumber; // Instance variable
    String residentName; // Instance variable
    static String communityCenterName = "ITS Community Center"; // Static variable
 
    // Constructor
    Resident(int houseNumber, String residentName) {
       this.houseNumber = houseNumber;
       this.residentName = residentName;
    }
 
    // Method to display the resident's details along with the community center name
    void displayDetails() {
       System.out.println(houseNumber + " " + residentName + " - " + communityCenterName);
    }
 }
 
 public class StaticMember { //Village bulletin board
    public static void main(String[] args) {
       Resident resident1 = new Resident(111, "John");
       Resident resident2 = new Resident(222, "Emma");
 
       // Display initial community center name from the billboard
       resident1.displayDetails(); // Outputs: 111 John - ITS Community Center
       resident2.displayDetails(); // Outputs: 222 Emma - ITS Community Center
 
       // Updating the name of the community center on the billboard
       Resident.communityCenterName = "BBDIT Community Center";
 
       // Display new community center name from the billboard
       resident1.displayDetails(); // Outputs: 111 John - BBDIT Community Center
       resident2.displayDetails(); // Outputs: 222 Emma - BBDIT Community Center
    }
 }