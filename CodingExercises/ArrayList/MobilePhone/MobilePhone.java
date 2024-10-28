package CodingExercises.ArrayList.MobilePhone;

import java.util.ArrayList;
import java.util.List;
import CodingExercises.ArrayList.MobilePhone.Contact;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public static void main(String[] args) {
        // Create my phone number object
        MobilePhone meCelly = new MobilePhone("773-365-1010");

        System.out.println(meCelly.myContacts);
        
        // Create my contacts
        Contact mike = new Contact("Mike Lowery", "313-555-5555");
        Contact mush = new Contact("Shittake Mushroom", "313-555-5555");
        Contact jesse = new Contact("Jesse Eisinger", "313-555-5555");
        Contact shirley = new Contact("Shirley Montoya", "313-555-5555");
        meCelly.addNewContact(mike);
        meCelly.addNewContact(mush);
        meCelly.addNewContact(jesse);

        System.out.println(meCelly.findContact(jesse));
        System.out.println(meCelly.findContact(jesse.getName()));
        System.out.println(meCelly.updateContact(mush, shirley));
        //System.out.println(meCelly.removeContact(mike));

        //System.out.println(meCelly.myContacts.toString());

        meCelly.printContacts();
    }

    //! Find Contact
    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    //! Find Contact through Name
    private int findContact(String contactName) {
        for(int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    //! Add New Contact
    public boolean addNewContact(Contact contact) {
        //Guard Clause
        if (findContact(contact) < 0) {
            myContacts.add(contact);
            return true;
        } else {
            System.out.println("Contact already exists in myContacts");
            return false;
        }
    }

    //! Update Contact
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) < 0) {
            // -1 means the contact is there, nothing to update
            return false;
        } else {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
    }

    //! Remove Contact
    public boolean removeContact(Contact contact) {
        if(findContact(contact) < 0) {
            System.out.println("Contact was not there");
            return false;
        } else {
            myContacts.remove(contact);
            return true;
        }
    }

    //! Query Contact
    public Contact queryContact(String name) {
        int contactsIndex = findContact(name);
        return myContacts.get(contactsIndex);
    }

    //! Print Contacts
    public void printContacts() {
        System.out.println("Contact Lists:");
        int counter = 1;
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s\n", counter++, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }
}

/*
 * 1.  Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:

[] Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
[] A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
[] And seven methods, they are (their functions are in their names):
    [] addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
    [] updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
    [] removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
    [] findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
    [] findContact(), same as above, only it has one parameter of type String.
    [] queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
    [] printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:

Contact List:
1. Bob -> 31415926
2. Alice -> 16180339
3. Tom -> 11235813
4. Jane -> 23571113


2. Implement the Contact class with the following attributes:

    -  Two fields, both String, one called name and the other phoneNumber.

    -  A constructor that takes two Strings, and initialises name and phoneNumber.

    -  And Three methods, they are:

        -  getName(), getter for name.

        -  getPhoneNumber(), getter for phoneNumber.

        -  createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.



TIP:  In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.

TIP:  Two Contact objects are equal if they have the same name.

TIP:  Be extremely careful about spaces in the printed message.



NOTE:  All fields are private.

NOTE:  Constructors should be defined as public.

NOTE:  All methods should be defined as public (except for the two findContact() methods which are private).

NOTE:  Do not add a main method to the solution code.

NOTE: Classes that are not in the java.lang package should be manually imported.

NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.
 */

 /*
  * public class MobilePhone {
    
    private String myNumber;
    private ArrayList<Contact> myContacts;
 
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
 
    public boolean addNewContact(Contact contact) {
        
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
 
    public boolean updateContact(Contact oldContact, Contact newContact) {
        
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                " already exists.  Update was not successful.");
            return false;
        }
 
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
 
    public boolean removeContact(Contact contact) {
        
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }
        
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }
 
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }
 
    private int findContact(String contactName) {
        
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
 
    public Contact queryContact(String name) {
 
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }
 
    public void printContacts() {
        
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
  */