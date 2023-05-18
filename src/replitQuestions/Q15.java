package replitQuestions;

import iterables.Arrays;

public class Q15 {

	public static void main(String[] args) {
	
	//	You are given an array of integer.
    //
	//	{ 1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21, 113, 5, 111, 2, 1 }

	//	I. Write a java program to calculate and print the following:

	//	  1. Largest number.
	//	  2. Smallest number.
	//	  3. Sum of numbers.
	//	  4. Average.
	//	  5. Second Largest.
	//	  6. Second Smallest.
		
		
		int [] num = {1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21, 113, 5, 111, 2, 1};
		
		
	
			
		
		
		int largest = num[0];
		int smallest = num[0];
		int sum = 0;
		float average = num[0];
		int secondLargest = num[0];
		int secondSmallest = num[0];
		
		for(int i = 0; i<num.length; i++) {
			sum =sum + num[i];
			average = sum/num.length;
			
			if(num[i]>largest) {            // Largest
				largest = num[i];
				
				
				
			} else if (num[i]<smallest) {    // Smallest
				smallest = num[i];
				
				
			}
				
				
	 
		}
		
		java.util.Arrays.sort(num);
		secondLargest = num[num.length-2];   // second Largest
		java.util.Arrays.sort(num);
		secondSmallest = num[num.length - num.length +3];   // second Smallest
		
		
		System.out.println(largest);
		System.out.println(secondLargest);
		System.out.println(smallest);
		System.out.println(secondSmallest);
		System.out.println(sum);
		System.out.println(average);
		
		

	}

}
