package SampleExercise2;

/* 
Sample Exercise
Create an encapsulated class with 4 fields and the respective methods to access and edit those fields. Then go ahead and create a test class to verify. 
Class Name : Student
Field Names : studentId, studentName, collegeName, address
Test Class Name : TestStudent
 */

class Student {
    // private fields
    private int studentID;
    private String studentName;
    private String collegeName;
    private String studentAddress;

    // no args contructor
    Student() {}

    //ID
    public int getStudentID () {
        return this.studentID;
    }

    public void setStudentID (int studentID) {
        this.studentID = studentID;
    }

    //Name
    public String getStudentName () {
        return this.studentName;
    }

    public void setStudentName (String studentName) {
        this.studentName = studentName;
    }

    //College
    public String getCollegeName () {
        return this.collegeName;
    }

    public void setCollegeName (String collegeName) {
        this.collegeName = collegeName;
    }

    //Address
    public String getStudentAddress () {
        return this.studentAddress;
    }

    public void setStudentAddress (String studentAddress) {
        this.studentAddress = studentAddress;
    }

}

public class StudentTest {
    public static void main(String[] args) {
        Student newStudent = new Student();

        newStudent.setStudentID(9999999);
        System.out.println("Student ID is: " + newStudent.getStudentID());

        newStudent.setStudentName("Armando Arteaga");
        System.out.println("Student name is: " + newStudent.getStudentName() + ".");

        newStudent.setCollegeName("Wayne State University");
        System.out.println("Student went to: " + newStudent.getCollegeName() + ".");

        newStudent.setStudentAddress("3522 W Fullerton");
        System.out.println("Student's address is: " + newStudent.getStudentAddress() + ".");
    }    
}

/*
 * What ChatGPT has to say about my exercise 🫡
 * 
 * //!Suggestions for Improvement:
[]  Naming Conventions: The class Student uses a variable name studentID but the method is getStudentID() and setStudentID(). In Java, it's typical to use camelCase for variable names, so studentId would be more conventional.
[X] Package Declaration: Make sure your package declaration (package SampleExercise2;) matches the directory structure of your project to avoid any compile-time or runtime issues if using packages.
[]  Constructor Enhancement: Although not required, you might consider adding a parameterized constructor to your Student class to allow setting all properties at the time of object creation. This can make your class more flexible and easy to use.

Enhanced Constructor Example:
Adding a constructor that takes parameters for all the fields could look like this:
* //! Parameterized constructor

Student(int studentId, String studentName, String collegeName, String studentAddress) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.collegeName = collegeName;
    this.studentAddress = studentAddress;
}
 */