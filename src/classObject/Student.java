package classObject;

public class Student {

	
	// class student: is our blue print / template
	 
	
	// class members:
	  // // 1. Variables: store the data that you want in template, class will not have actual values.
	   
	
	String FirstName;
	String LastName;
	int age; 
	
	
	
	
	  // // 2. methods
	     // constructor: are used to create an object of the class.
	        // the job of the constructor is to initialize all of the variables of the class.
	        // constructor format:     access-modifier class-name(argument/parameters) {body}
	                                   // access modifier: who can have access (public or private)
	
			public Student () {
				
				FirstName = "";
				LastName  = "";
				age = 0;
				System.out.println("we called the constructor  of the class");
			}
			
	     
	
	
	
	     // methods: are used to perform some action on that object.
	       // or series of instructions thats going to be performed once its called.
		   // access-modifier Return-Type identifier(arg/paramts) {body}
		   // void = function not returning anything
			
			public void printInfo () {
				
				System.out.println("FirstName:" + FirstName + ", LastName:" + LastName + ", age:" + age );
			}
	
	
	
	
	
}
