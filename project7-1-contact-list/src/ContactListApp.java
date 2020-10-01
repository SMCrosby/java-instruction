import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		//Use a class to store and display contact information
		System.out.println("Welcome to the Contact List App");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println();
			String firstName = Console.getString("Enter first name: \t");
			String lastName = Console.getString("Enter last name: \t");
			String email = Console.getString("Enter email: \t\t");
			String phone = Console.getString("Enter phone: \t\t");
			
			System.out.println();
			//Contact.displayContact;  --> can't call until instance is created
			Contact c = new Contact(firstName, lastName, email, phone);
			
			System.out.println(c.displayContact());		//calling upon the instance c for information
			System.out.println();
			
			choice = Console.getChoiceString("Continue? (y/n)\t", sc);
			
		}			
		
		
		
		System.out.println("\nGoodbye");
		sc.close();
		
	}

}
