package interviewCodingSeassion;

public class InterviewQuestions {

	public static void main(String[] args) {

		// create Funtions to get:
		
		// LowerCase
		// UpperCase
		// Numbers
		// Special Characters
		
		String str = "TekSchool 01  #3666^^^^";
		
		
		System.out.println(lowerCaseString(str));
		System.out.println(UpperCaseString(str));
		System.out.println(numbersString(str));
		System.out.println(specialCharactersString(str));
		
		
	}
	public static String lowerCaseString(String input) {
		return input.replaceAll("[^a-z]", "");
		
		
	}
	
	public static String UpperCaseString(String input) {
		return input.replaceAll("[^A-Z]", "");
		
		
	}
	public static String numbersString(String input) {
		return input.replaceAll("[^0-9]", "");
		
		
	}
	
	public static String specialCharactersString(String input) {
		return input.replaceAll("[^a-zA-Z0-9]", "");
		
		
	}

}
