package iterables;

public class Arrays {

	public static void main(String[] args) {
		
		
		
		// Arrays is to store collection of variables.

		// Structure:
		// data-type [] name of the array = new data-type [ size];
		int[] nums = new int [10];
		
		
	
		
		//Example:
		
		
		//declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers

        anArray = new int[10];

           
        // initialize first element

        anArray[0] = 100;

        // initialize second element

        anArray[1] = 200;

        // and so forth

        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;


        System.out.println("Element at index 0: "  + anArray[0]);
        System.out.println("Element at index 1: "  + anArray[1]);
        System.out.println("Element at index 2: "  + anArray[2]);
        System.out.println("Element at index 3: "  + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: "  + anArray[6]);
        System.out.println("Element at index 7: "  + anArray[7]);
        System.out.println("Element at index 8: "  + anArray[8]);
        System.out.println("Element at index 9: "  + anArray[9]);
        
        
        
    
		
		
		System.out.println("---------------------------------------------");
		
		
		
		// Example:
		
		
		// create an array of booleans with size of 7 
		// name of the array is temp 
		//  then print the name of the array 
		// then print all of the indexes of the array
		// then assign these values to the array 
	    // 0 true 
		// 1 false 
		// 2 true 
		// 3 false 
		// 4 true 
		 // 5 false 
		// 6 false 
	    // print all of the values of the array again
		
		
		boolean [] temp = new boolean [7];
		System.out.println(temp);
		
		temp[0] = true;
		temp[1] = false;
		temp[2] = true;
		temp[3] = false;
		temp[4] = true;
		temp[5] = false;
		temp[6] = false;
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println(temp[3]);
		System.out.println(temp[4]);
		System.out.println(temp[5]);
		System.out.println(temp[6]);
				
		
	
		
		
	    
        System.out.println("-------------------------------------------");
        
        
        
        
        
		
		String [] cars = {"volve", "mata", "Toyota", "luxus"};
		System.out.println(cars[0]);
		
		// how to change array element?
		
		cars[0] = "BMW";
		System.out.println(cars[0]);
				
		
		
		System.out.println("------------------------------------------");
		
		
		
		int [] numbers = {23,45,4,67,35,78,77,44};
		System.out.println("length" + numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		
		System.out.println("** going through with array with a loop ***");
		// now processing the array with a loop:
		
		int index = 0;
		while (index < numbers.length) {
		System.out.println("index => " + index + ", " + numbers[index++]);
		}

		System.out.println("---------------------------------------");
		
		
		
		
		
		
		
		System.out.println("----------------------------------------");
		
		
		//example:
		int [] tempNums = {15,854,1,5,152,85,41,51,5,48,15,15,4,81,524,8,452,5,48,4,51,85,85};
		System.out.println("length is" + tempNums.length);
		
		int index1 = 0;
		while (index1 < tempNums.length) {
			System.out.println("index"   + " " + index1  + " " +    tempNums[index1++]);
		}
		
		System.out.println("-------------------------------------------");
		
		
		
		
		
		// Example:
//		int[] totalSales = { 156, 5, 1, 75, 545 };

//		System.out.println("length of the array " + totalSales.length);
//		int index2 = 0;
		
		// I want to see the sum of all of the integers in the array
//		int sum = 0;
//		while (index2 < totalSales.length) { 
//			sum = sum + totalSales[index2];
//			System.out.println(totalSales[index2]);
//			index2++;
//		}
//		System.out.println("Total" +  sum);
		
		
		
		
		// find the min, max, average and count?:
		

		int[] totalSales = { 156, 5, 1, 75, 545 };

		int index4 = 0;

		// I want to see the sum of all of the integers in the array
		int sum = 0;
		int min = totalSales[0];            
		int max = totalSales[0];
		int count = totalSales.length;
		double avg = 0;

		while (index4 < totalSales.length) {
			//print the value of each index
			System.out.print(totalSales[index4] + ", ");
			
			// adding the current value to the sum
			sum = sum + totalSales[index4]; 

			// current index value > max ==== then assign the current value to max
			if (totalSales[index4] > max) {
				max = totalSales[index4];
			}
			// current index value < min ==== then assign the current value to min
			if (totalSales[index4] < min) {
				min = totalSales[index4];
			}

			index4++;
		}
		// going to the next line
		System.out.println();
		System.out.println();
		System.out.println();
		
		// finding average
		avg = (double) sum / count;
		
		// printing the results
		System.out.println("SUM:\t" + sum);
		System.out.println("MIN:\t" + min);
		System.out.println("MAX:\t" + max);
		System.out.println("AVG:\t" + avg);
		System.out.println("COUNT:\t" + count);
		
		
		System.out.println("--------------------------");

		System.out.println("heloo");
		
	}

}
