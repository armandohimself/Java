package CodingExercises.ArrayList.MobilePhone;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    protected String getName() {
        return name;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    private static Contact createContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        return contact;
    }
}