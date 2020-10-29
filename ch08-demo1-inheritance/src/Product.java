import java.text.NumberFormat;

public class Product {
		//pg 263
		// fields / instance variables
		//JavaBeans. It is a true POJO (Plain old Java object)
//				-includes a constructor that requires no argument
//				-all instance variables are private
//				-includes get and set methods for all instance variable you want to be able to access 
		private String code; 
		private String description;
		private double price; 
		
		// Constructor - empty/default constructor (does not accept any parameters)
		public Product() {
			
		}
		
		// Constructor - fully loaded constructor
				// RightClick -> Source -> GenerateConstructorUsingFeilds  -- generates default
		public Product(String code, String description, double price) {
				//String "code" is a constructor variable and only lives within this constructor. 
				//Overrides original variable "code".
			super();								// super calls to the parent class(not currently needed)
			this.code = code;						//sets instance variable to constructor variable input
			this.description = description;
			this.price = price;
		}
		
				//getter method
				public String getCode() {
					return code;
				}
				
				//setter method
				public void setCode(String inCode) {
					code = inCode;							// sets the instance code to the input inCode
				}
		
				//getters and setters can also be auto generated
				public String getDescription() {
					return description;
				}
		
				public void setDescription(String description) {
					this.description = description;
				}
		
				public double getPrice() {
					return price;
				}
		
				public void setPrice(double price) {
					this.price = price;
				}
			
		//Method to return double formated as currency
		public String getPriceFormatted() {
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			return currency.format(price);
		}

		
		
		@Override
		public String toString() {
			return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
		}

			
		
		
		
}
