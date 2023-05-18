package classObject;

public class Runner {

	public static void main(String[] args) {
		
		
		Student st1 = new Student();
		st1.FirstName = "Jack";
		st1.LastName = "Shelby";
		st1.age = 15;
		
		

		// to call functions/methods we need name of the object , name - of - the method.
		st1.printInfo();
		
		
		Instructor obj1 = new Instructor ();
		Instructor obj2 = new Instructor("Anna", "Wilson");
		
		System.out.println(st1.FirstName);
		
		obj1.printFullName();
		obj2.printFullName();
		
		
		
		
		
		
		
	}

}
