 import java.util.Scanner;  //we need to import the class from the java.util package.
 import java.io.*;// so we can read in files

// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) 
  {
    int classSize = 5;
    Student[] students = new Student[classSize];
    
    
    int evens[] = new int[classSize];
    
    System.out.println("start loop");
    for (int i=0; i < classSize; i++) {
      evens[i] = i * 2;
      System.out.println(evens[i]); 
    }
    System.out.println("after loop");
    System.out.println(evens[2]);
    /*
    
    
    
    
    
    String filename = "testLog.txt";
      
    BufferedReader classList = null;
    Writer outputFile = null;
    
    
    // open file
    try 
    {
      FileReader filepath = new FileReader("fakeClassList.txt");
      classList= new BufferedReader (filepath);
      // add file reader for testLog.txt
      
      // construct student list based on fakeClassList.txt
      
      // read and parse todaysMeet log
      
      // ignore every odd numbered line
      // parse content lines
      //line format 1:19pm, Tues, Feb 2, 2016 by JamesBond
      // look for nickname from fakeClassList.txt in testLog.txt
    }
    catch (Exception ex)
    {
      System.out.println("File not found.");
      System.exit(1);
    }

    
    
    
    
    
    // write to file
    /*try {
        outputFile = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream("participation.txt"), "utf-8"));
        for (int i = 0; i < classSize; i++) {
          outputFile.write(students[i].toString());
        }
      } catch (IOException ex) {
        // report
      } finally {
        try {outputFile.close();} catch (Exception ex) {}
      }
    
    
    
    //Student[] students = new Student[5]; // array of students

    // test students
    students[0] = new Student("James", "Bond");
    students[1] = new Student("Jackie", "Chan");
    students[2] = new Student("Chuck", "Norris");
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
    }*/
    
    
  } // main

} // class Main
