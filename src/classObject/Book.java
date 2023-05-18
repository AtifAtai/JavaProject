package classObject;

public class Book {

	String title;
	String author;
	int numberOfPages;
	double price;
	
	// Default Constructor
	public Book() {
		
		title = "";
		author = "";
		numberOfPages = 0;
		price = 0;
		
	}
	// Parameterized Constructor
    public Book(String newTitle, String newAuthor, int newNumberOfPages, double newPrice ) {
		
		title = newTitle;
		author = newAuthor;
		numberOfPages = newNumberOfPages;
		price = newPrice;
		
	}
	
	public void printInfo() {
		System.out.println("Book [Title: " + title + ", Book Author:" + author + ", Number of Pages: " + numberOfPages + ", Price: $ ]" + price);
	}
	
	 
}
