package replitQuestions;

public class ReplitQuestions {

	public static void main(String[] args) {
	
		// Q 2
		
		String text = "wefeqf878979797fewfewrf879797efds&^&^*^*^";
		   char [] all = text.toCharArray();
		   int countLetter = 0;
		   int countnumber = 0;
		   
		   int sym = 0;
		   String per = "";
		   for(int i = 0; i<all.length; i++) {
			   if(Character.isLetter(all[i])) {
				   countLetter++;
			   }else if(Character.isDigit(all[i])) {
				   countnumber++;
			   }else {
				   sym++;
			   }
		   }
		System.out.println("the number of character are:" +countLetter);
		
	}

	
	
	
	// Q 3
	
	
}
