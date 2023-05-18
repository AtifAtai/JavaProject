package JavaPractice;

public class selection {

	public static void main(String[] args) {
		
		int pinStored = 1234;
		int pinEntered = 1254;

		if (pinStored != pinEntered) {
			System.out.println("Unlock the phone");
		} else {
			System.out.println("Password is incorrect");
		}
			
		
		double balance = 500;
		double withdraw = 700;
		
		if (withdraw <= balance) {
			System.out.println("withdraw" + withdraw);
		} else {
			System.out.println("insufficient balance" + (balance - withdraw));
		}
			
		
		// !=
		// Logical Operators
		//  && and
		// || or
		// ! not
		
		 System.out.println("---------------");
		
		int a = 10;
		int b = 15;
		
		if (a>b && b<a || b>a ^ a<b ) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		//f && f || t ^ t
		// f || t ^ t
		// t ^ t
		// f
		
		
		System.out.println("---------------------------------------");
		
		
		String daysOfWeek = "mon";
		if (daysOfWeek.equals("sun")) {
			System.out.println("days of the week");
		} else if (daysOfWeek.equals("mon")) {
			System.out.println("ready for weekend");
		}
		
		
		int numa = 5;
		switch (numa) {
		case 1:
		case 2:
			break;
			default:
			
				
		}
				
		
		        // you grade will be between 0 - 100 
				// for each range you get a letter
				// 90-100 A
				// 80-89 B
				// 70-79 C
				// 60-69 D
				// 0-59 F
				// do it in the reverse order
				// first check for F
				// then check for D
				// then check for C
				// then check for B
				// then check for A
		
		int grade = 30;
		
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if(grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
