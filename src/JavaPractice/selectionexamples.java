package JavaPractice;

public class selectionexamples {

	public static void main(String[] args) {
		
		
		// Selection
		//1 if statement
		// 2 conditional operators
		// 3 Switch statement/cases
		
		String daysOfWeek1 = "fri";
		switch (daysOfWeek1) {
		case "sat":
			System.out.println("the beggining of the week");
			break;
		case "sun":
			System.out.println("weeken day");
			break;
		default:
			System.out.println("others days of the week");
		    break;
		
		}
		
		System.out.println("--------------------");
		
		String daysOfWeek = "sun";
		if (daysOfWeek.equals("fri")) {
			System.out.println("the beggining of the week");
			
		} else if (daysOfWeek.equals("sun")) {
			System.out.println("weeken day");
		} else {
			System.out.println("other days of the week");
		}
		
		
		System.out.println("--------------");
		
		
		
		
		
		int num = 20;
		switch (num) {
		case 2:
			System.out.println("single table");
			break;
		case 3:
			System.out.println("round table");
			break;
		case 5:
			System.out.println("family table");
		    break;
		default:
			System.out.println("combined tables");
			break;
		
	
		}
		
		// conditional Operators
		//condition? true :false;
		
		int age = 18;
		//String status = age >= 19? "can apply" :"can not apply";
		//System.out.println(status);
		
		if (age >=19) {
			System.out.println("can apply");
		} else {
			System.out.println("can not apply");
		}
		
		System.out.println("---------------------");
		switch (age) {
		case 19:
			System.out.println("can apply");
			break;
		case 18:
			System.out.println("can not apply");
			break;
		}

	}

}
