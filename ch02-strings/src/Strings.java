import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {
			String firstName = "Bob";
			String lastName ="Marley";
			int age = 36;
			String message = "";
			
			message = firstName;
			message = message + " ";
			message += lastName;
			message += " was "+age+" years \n old when he passed.";  // \n = escape sequence for New line 
					System.out.println(message);       	// Prints out what's declared in message statements
					System.out.println("Hello");
					
					
					
			// Create a scanner instance and get data from user
			Scanner sc = new Scanner(System.in);					 // System.in must be capitalized
					
			// Get a string
			System.out.println("Enter a sentence: ");
			String sentence = sc.nextLine();
			
			//get an int 
			System.out.println("Enter a int: ");
			int n = sc.nextInt();
			
			//get an double
			System.out.println("Enter a double: ");
			double d = sc.nextDouble();
			
			System.out.println(sentence);
			System.out.println(n);
			System.out.println(d);
					

	}

}
