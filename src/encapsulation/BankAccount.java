package encapsulation;

public class BankAccount {

	                   // Encapsulation:
	  // its data hiding, its the idea of making your variable private. its used to define control.
	
	  // Access modifier:
	    // Public, protected, default, private
	    // Public: can access it on the entire project
	    // private: can only access it within the same class
	
	
	
	
	private String firstName;
	private String lastname;
	private int age;
	private String accountNumber;
	private double balance;
	
	// this keyword - scope of the current class.
	
   // Constructor:
	public BankAccount () {
		this.firstName = "";
		this.lastname = "";
		this.age = 0;
		this.accountNumber = "";
		this.balance = 0;
	}
	
	// Parameterized constructor
	public BankAccount (String firstName, String lastName, int age, String accountNumber, double balance) {
		this.firstName = firstName;
		this.lastname = lastName; 
		this.age = age;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Getter: is used to access variables.
		// create getter for each variables
		

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return " firstName: " + firstName + ", Lastname: " + lastname + ", Age: " + age + ", AccountNumber:" + accountNumber + ", Balance: " + balance;
		
	}
	
	
	
	
	
	
	
}
