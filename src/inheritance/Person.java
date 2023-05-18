package inheritance;

public class Person {


	private String firstName;
	private String lastName;
	private String email;
	
	
	// Default Constructor:
	public Person () {
		this.firstName = "";
		this.lastName = "";
		this.email = "";
		
		
	}
	// Parameterized Constructor:
	public Person (String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	// toString will give you a String representative of the object
	
	@Override
	public String toString() {
		return "firstName: " + firstName + ", lastName: " + lastName + ", Email: " + email;
   }
	
	
	
	
	
	
	
}
