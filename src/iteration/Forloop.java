package iteration;

public class Forloop {

	public static void main(String[] args) {
		
		
		// Structure:
		
		// for (initialization ; definition; update) {
		  //    body of the loop
		//      }
		
		
		
		// Palindrom: its the type of question when we read from left to right or right to left it same. like DAD
		
		
		
		
		
		//Example:
		
	        	// create a for loop that starts from 7 and stops at 15
				// print the value of your counter on every iteration
				for (int i = 7; i <= 15; i++) {
					System.out.println(i);
				}
				
		
				System.out.println("-----------------------");
				
				
				
				
		// Example: 
				
				// create a loop that starts from 19, and stops at 3
				// decrease by one on every iteration
				// print the values in the same line separated with an space
				// e.g. 19, 18, 17, 16, 15 ...
				for (int i = 19; i >= 3; i--) {
					System.out.print(i + ", ");
				}
				System.out.println();
				System.out.println("-------------------------------");
				
				
		// Example:
				

				
				for (int i = 1; i <= 3; i++) {
					System.out.print(i + ", ");
				}
				System.out.println();
				for (int i = 1; i <= 3; i++) {
					System.out.print( "%" );
				}
				System.out.println();
				System.out.println("-------------");
				
				for (int j = 1; j <= 3; j++) {
					// this prints 1 2 3 and goes to the next line
					for (int i = j; i <= 3; i++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
				
				

			
				
				

	}

}
