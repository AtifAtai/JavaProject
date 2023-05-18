package inheritanceVehicles;

public class Runner {

	public static void main(String[] args) {
		
		
		Vehicle obj1 =new Vehicle();
		Vehicle obj2 =new Vehicle(250, "Toyota", "Corrola XLE", 2024);
		
		Car obj3 = new Car(180, "Toyota", "Highlander", 2005, 4, 4, "SUV", false);
		
		MotorCycle obj4 = new MotorCycle(120, "BMW", "something", 2010, "", "good", 4);
		
		System.out.println(obj4);
		System.out.println(obj2);
		
		System.out.println(obj3);
		
		
	}

}
