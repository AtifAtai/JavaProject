package encapsulation;

public class RunnerBankAccount {

	public static void main(String[] args) {
		
		
		BankAccount user1 = new BankAccount("Jack", "MA", 34, "F33434", 67574.5);
		System.out.println(user1.getFirstName());
		System.out.println(user1);
	}

}
