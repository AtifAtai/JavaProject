package classObject;

public class Instructor {

	
	// Variables
	String firstName;
	String lastName;
	
	
	//constructor
	// we have two type of constructor:
	   // 1, default constructor: when we don't have a arguments
	
	public Instructor () {
		firstName = "";
		lastName = "";
	}
	
	   //2, Parameterized constructor: when we have arguments.
	     // arguments: are temporary variables that we used to transfer data to object.
	
	 public Instructor(String fName, String lName) {
		 firstName = fName;
		 lastName = lName;
		 
	 }
	
	// print name in this format:  lastName , FirstName
	 public void printFullName () {
		 System.out.println(lastName + ", " + firstName);
	 }
	 
}
