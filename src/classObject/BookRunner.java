package classObject;

public class BookRunner {

	public static void main(String[] args) {
		
		Book sh1 = new Book("Harrpy potter", "Degarwal", 600, 50);
		Book sh2 = new Book("basheer chosh", "Zubair gazhdom", 39, 10);
		sh1.printInfo();
		sh2.printInfo();
		
		Book sh4 = new Book();
		sh4.title = "Ragak zanana";
		sh4.author = "degarwal";
		
		Book sh3 = new Book("Ragak", "Degarwal", 45, 23);
		sh3.printInfo();
		

	}
	

}
