package JavaPractice;

public class CreatingVariables {

	public static void main(String[] args) {
	
		
	int num1 = 5;
	int num2 = 8;
	int num3 = 13;
	
	num1 = num2; // num1 = 8
	num2 = num3; // num2 = 13
	num3 = num1;//  num1 = 8
	
	System.out.println(num3);
		
  System.out.println("----------------------");
	
	// Operators
	  // Assignment =
  	  
  String text = "this is a test";
  System.out.println("this is a \"test\"");
		 
		 
  int j = 10;
	int k = 10;
	
	if(++j == ++k && ++j == ++k) {
		System.out.println("this is the true block of j and k");
	}
	System.out.println("j " + j);
	System.out.println("k " + k);
	
	System.out.println("-----------------------------");
	
		
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
	
	
	int grade = 0;
	
	if(grade >= 90) {
		System.out.println("A" + grade);
		
	} else if (grade >=80) {
		System.out.println("B" + grade);
		
	} else if (grade >=70) {
		System.out.println("C" +grade);
	} else if(grade <=50) {
		System.out.println("Failed" + grade);
	}
	
	
	System.out.println("----------------");
	
	
	// create two integers a = 25 and b = 64
			// write the selection statement to check to see if
			// the a is bigger than b or b is less than or equal to 50
			// if true then print true
			// if false then print false
	
	
        	int a = 25;
			int b = 64;
			
			if(a>b || b <= 50) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
	
			int t = 7;
			while (t>3) {
				System.out.println(++t);
			}
			
			
			
	}

}
