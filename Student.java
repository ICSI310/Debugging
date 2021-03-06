public class Student {

 // Variables/Properties
 private String firstName = new String();
 private String lastName = new String();
 private String nickName = new String();
 private int numberOfContributions;
 
 // Constructors
 public Student() {
  this.firstName = "firstName";
 this.lastName = "lastName";
 this.nickName = this.firstName + this.lastName;
 this.numberOfContributions = 0;
 }
 
 public Student(String first, String last) {
   this.firstName = first;
   this.lastName = last;
   this.nickName = this.firstName + this.lastName;
   this.numberOfContributions = 0;
}
 
 // Methods
 
 // getter
public String getFirstName() {
  return this.firstName;
}

public String getLastName() {
  return this.lastName;
}
 
public int getNumberOfContributions() {
  return this.numberOfContributions; 
}


 
 // setter
public void setFirstName (String firstName) {
  this.firstName = firstName;
}

public void setLastName(String lastName) {
  this.lastName = lastName;
}

public void setnumberOfContributions(int number) { 
 this.numberOfContributions = number;
 }
 
 // adds a contribution
public void addContribution() {
  this.numberOfContributions++;
}

public String toString() {
  return (this.lastName + ", " + this.firstName + ", " + this.numberOfContributions);
}

}
