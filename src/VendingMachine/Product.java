package VendingMachine;

public class Product {

	String name;
	double price;
	int qty;
	
	//default constructor
	public Product() {
		name = "";
		price = 0;
		qty= 0;
		
	}
	
	//Parameterized constructor
	public Product(String newName, double newPrice, int newQty) {
		name = newName;
		price = newPrice;
		qty= newQty;
		
	}
	
	public void printProductInfo() {
		System.out.println("Product [Name:" + name + ", Price: $" + price + ", Quantity: " + qty);
	}
	
	
	
}
