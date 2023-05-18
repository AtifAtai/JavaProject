package iteration;

public class Whileloop {

	public static void main(String[] args) {
		
     // ITERATION: the process of doing something again and again.
	 // Iteration is the repetition of a process in a computer program, usually done with the help of loops. 
	 // or Iteration is a way to cycle through things, it means i have a list of thing go to do so iteration go through all of them.
		// like a list of 1 to 10 this go through 1,2....10.
		
		// The while statement continually executes a block of statements while a..
		// particular condition is true. 
		// Its syntax is:
		
	    //	     while (Condition) {
    	//	           Body of the loop/statement
	    //     	}
		
		
	
		// The while statement evaluates expression, which must return a boolean value. If the expression evaluates to true, ..
		// the while statement executes the statement in the while block. The while statement continues testing the expression ..
		// and executing its block until the expression evaluates to false.
		
		
		
		
		
		int count = 1;
		while  (count<11) {
			System.out.println("Cout is:" + count);
			count++;
		}
		
        System.out.println("-----------------------");
        
        
        int x = 15;
		
		while (x <=20) {
			System.out.println(x);
			x++;
			
		}
        
		
		
		// Infinite loop: infinite loop is also known as an endless loop.
		  
	//	while (true){
	//	    System.out.println(true);
	//	}
        
		
		System.out.println("------------------");
		
		
//		String str = "this is a test";
//	    System.out.println(str.length());
		  // so i want to go  in all indexes one by one:
//	    int i = 0;
//		  while (i < str.length()) {
//			  System.out.println(i++);
//			  System.out.println(str.charAt(i++));
//		  }
		// and from 0 to 14 is the value of int x.
		  
		  
				
		  
	
		  
		  
		  
		  // Interview example: count the number of vowel character in a given string.
		  
//		  String str = "this is a test";
//		  int count1 = 0;
//		  int j = 0;
//		  while (j < str.length()) {
//			  char c = str.charAt(j++);
			  // i will check to see if the character is one of the vowel, if yes then increase the count.
			  
//		 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//			 ++count1;
			 
//		 }
//		  }
		  
//		  System.out.println("we have"  +  count1  +  "vowel character in the given string");
		  
		  
		String str = "this is a test"  ;
		int count1= 0;
		int index = 0;
		while (index <str.length()) {
			char c = str.charAt(index++);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				++count1;
			}
		}
		  
		 System.out.println("we have" + count1 + "vowel character in the given string"); 
		 
		  
		  
		
		
		
		

	}

}
