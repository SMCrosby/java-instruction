
public class Book extends Product {
	
	private String author;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [author=" + author + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
}
