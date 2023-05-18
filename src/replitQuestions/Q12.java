package replitQuestions;

public class Q12 {

	public static void main(String[] args) {
		
	// 	I. Write a java program to print numbers from 10 to 200.
    //  1. For the numbers divisible by 3, print "Fizz"
		
		int endPoint = 200;
		for(int startPoint=10; startPoint<=endPoint; startPoint++) {
		//	System.out.print(startPoint);
		//	System.out.println("\n" + "----------------------------------------");
			
		//num % 3 == 0;/ "Fizz"       this is the formula
			if(startPoint % 3 == 0) {
				System.out.println(startPoint + "Fizz");
			}
			
			
			
			
//			  2. For the numbers divisible by 5, print "Buzz"
			
			else if(startPoint % 5 == 0) {
				System.out.println(startPoint + "Buzz");
			}
		
		
    
	
		

		
	//	  3. For the numbers that divisible by 3 and 5, print "FizzBuzz"
		
			 else if( startPoint % 3 == 0 && startPoint % 5 == 0) {
			System.out.println(startPoint + "FizzBuzz");
			
		}
		else {
			System.out.println(startPoint + "these are not divisable");
			
		}
		
		}
		

	}

}
