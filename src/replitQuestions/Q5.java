package replitQuestions;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("");
		int amount = scan.nextInt();
		
		for(int i =1; i<=amount; i++) {
			for(int j=1; j<=amount-i; j++) {
				System.out.print(" ");
			
				}
			for(int k=1; k<=i; k++) {
				
				
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
	

}
