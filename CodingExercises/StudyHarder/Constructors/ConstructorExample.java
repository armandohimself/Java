package CodingExercises.StudyHarder.Constructors;

public class ConstructorExample {

    int myNumber;
  
    public static void main(String[] args) {
      ConstructorExample ce = new ConstructorExample(3); // a
        System.out.println(ce.myNumber); // b
    }
    
    public ConstructorExample(int myNumber) { // c
      this.myNumber = myNumber; // d
    }
  }