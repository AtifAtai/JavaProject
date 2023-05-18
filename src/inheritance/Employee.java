package inheritance;

public class Employee {


	private String position;
	private String employeeID;
	
	// Default Constructor:
	public Employee () {
		this.position = "";
		this.employeeID = "";
		
	}
	// Parameterized Constructor:
	public Employee (String position, String employeeID) {
		this.position = position;
		this.employeeID = employeeID;
		
	}


	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
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
		return ", Position:" + position + ", EmployeeID: " + employeeID;
   }
	
	
	
}
