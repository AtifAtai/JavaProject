package VendingMachine;

public class ProductRunner {

	public static void main(String[] args) {

		Product temp = new Product();
		temp.name = "Snikers";
		temp.price = 33;
		temp.qty = 20;
		
		temp.printProductInfo();
		
		
		Product temp1 = new Product();
		temp1.name = "chips";
		temp1.price = 55;
		temp1.qty = 4;
		
		temp1.printProductInfo();
		
		
		
		Product row2 = new Product("cookies", 56, 6);
		row2.printProductInfo();
		
		
	}

}
