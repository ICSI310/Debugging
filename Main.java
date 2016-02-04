// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) 
  {
    Student[] students = new Student[5]; // array of students

    // test students
    students[0] = new Student("James", "Bond");
    students[1] = new Student("Jackie", "Chan");
    students[2] = new Student ("Chuck", "Norris");
    students[3] = new Student("Guy", "Cortesi");
    students[4] = new Student("Darth", "Vader");
    
    // make arbitrary number of contributions for testing
    // loop through students
    for (int i = 0; i < 5; i++) {
      // for each student, add a contribution in each loop
      for (int j = 0; j < i; j++) {
        // give each student a different number of 
        // contributions based on their array number
        students[i].addContribution();
        students[i].addContribution();
      }
    }
    
    // print for testing
    for (int i = 0; i < 5; i++) {
      System.out.println(students[i].toString());
    }
    
    
  } // main

} // class Main
