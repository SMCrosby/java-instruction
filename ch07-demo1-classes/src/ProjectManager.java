import java.text.NumberFormat;

public class ProjectManager {

	public static void main(String[] args) {
		System.out.println("Hello");
		//create some products and print to console

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		int n = 1;
		Product p1 = new Product();
		
		printProductData(p1);
		
		p1.setCode("Java");
		p1.setDescription("Murach's Java Programming");
		p1.setPrice(59.5);
		
		printProductData(p1);
		
		Product p2 = new Product("mySql", "Murach's MySQL", 54.50);
		printProductData(p2);
		
		System.out.println("Print products using toString()...");
		System.out.println(p1.toString());
		System.out.println(p2);
		
		System.out.println("Change price of p2...");
		changePrice(p2,50);
		System.out.println(p2);
		
		//pg 243
		System.out.println("Pass primitive type to a method...");
		double price = 700;
		price = changePrice(price, 650);
		System.out.println("Price = "+price);
		
		
		
		System.out.println("\nGoodbye");
	}
	
	private static double changePrice(double price, double newPrice) {
		price = newPrice;
		return price;
	}
	
	
	private static void changePrice(Product prod, double newPrice) {
		prod.setPrice(newPrice);
	}
	
	
	
	
									//expects a instance of product to be passed into method
	private static void printProductData(Product prod) { 
//		NumberFormat nf = NumberFormat.getCurrencyInstance();	//Added currency format before method was made
		System.out.println("\nProduct data: ");
		System.out.println(prod.getCode());
		System.out.println(prod.getDescription());
		System.out.println(prod.getPriceFormatted());			//Added currency format method to price
	}
	
	
}
