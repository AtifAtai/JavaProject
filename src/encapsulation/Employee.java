package encapsulation;

public class Employee {

	
	// create a class to store employee information
	// chose 5 variable/attributes that you want to store
	//encapsulate your class
	//create 2 constructors
	// create getter and setter
	//create a toString
	
	
	private String firstName;
	private String lastName;
	private String position;
	private String email;
	private String employeeID;
	
	// Default Constructor:
	public Employee () {
		this.firstName = "";
		this.lastName = "";
		this.position = "";
		this.email = "";
		this.employeeID = "";
		
	}
	// Parameterized Constructor:
	public Employee (String firstName, String lastName, String position, String email, String employeeID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.email = email;
		this.employeeID = employeeID;
		
	}
	//getter
	public String getFirstName () {
		return firstName;
	}
	//setter
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	
	// toString will give you a String representative of the object
	
	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", Position:" + position + ", Email: " + email + ", EmployeeID: " + employeeID;
   }
	
	
	
	
	
	
	
	
	
	
}
