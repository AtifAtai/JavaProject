package encapsulation;

public class RunnerEmployee {

	public static void main(String[] args) {
		
		
		Employee num1 = new Employee("Ahmad", "Hamidi", "Admin", "ahmad@gmail.com", "FMD3434");
		System.out.println(num1.getEmail());
		num1.setEmail("Mahmaood@yahoo.com");
		System.out.println(num1.getEmail());
		
		System.out.println(num1);

	}

}
