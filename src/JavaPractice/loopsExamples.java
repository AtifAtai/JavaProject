package JavaPractice;

public class loopsExamples {

	public static void main(String[] args) {
		
		int x = 15;
		
		while (x <=20) {
			System.out.println(x);
			x++;
			
		}
		
		
		String name = "Ahmad";
		System.out.println();
				
		int p = 14;
		

		
		// ARRAy
		// when we want to store collecion variables
		
		// data-type [] name of array = new data-type [];
		 int [] y = new int [4];
		
		y [0] = 10;
		y [1] = 15;
		y [2] = 20;
		y [3] = 25;
		
		System.out.println(y[3]);
		
		int [] v = {10,15,20,25};
		System.out.println(v[2]);
		
		System.out.println(v.length);
		
		
		System.out.println("-------------");
		
		String [] num = new String [5];
		num [0] = "Ahmad";
		num [1] = "Sanqa";
		num [2] = "Mahmood";
		num [3] = "Dawood";
		num [4] = "Ahmadi";
		
		
		System.out.println(num[4]);
		
		System.out.println("-------------------------------------");
				
		int [] tempNums = {51,854,1,5,152,85,41,51,5,48,15,15,4,81,524,8,452,5,48,4,51,85,85};
		System.out.println("Lengh of the array " + tempNums.length);
		
		
		
		int index = 0;
		while (index <= 23) {
			System.out.println("index" + index + "=>" + tempNums[index++]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
