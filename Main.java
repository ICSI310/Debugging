// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) 
  {
    Student [] students = new Student();

    // test students
    students[0] = Student("James", "Bond");
    students[1] = Student("Jackie", "Chan");
    students[2] = Student ("Chuck Norris")'
    stuents[3] = Student("Guy", "Cortesi");
    students[4] = Student("Darth", "Vader");
    
    // make arbitrary number of contributions for testing
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i; j++)
      students[i].addContribution();
    }
    
    // print for testing
    for (int i = 0; i < 5; i++) {
      students[i].toString();
    }
    
    
  } // main

} // class Main
