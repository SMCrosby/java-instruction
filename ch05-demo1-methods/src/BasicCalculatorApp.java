import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculatorApp {

	public static void main(String[] args) {
		// pg 152
		printWelcomeMessage(); // uses information declared below
		Scanner sc = new Scanner(System.in);
		int nbr = getInt("\nHow many times to print? ", sc);
		System.out.println(" ");

		printHello(nbr); // calls upon printhello method

		int a = getInt("\nEnter a whole number: ", sc);
		int b = getInt("Enter another whole number: ", sc);
		System.out.println("Sum of "+a+" + "+b+" = "+ sum(a, b));
		
		double c = getDouble("\nEnter a decimal number: ", sc);
		double d = getDouble("Enter another decimal number: ", sc);
		System.out.println("Sum of "+c+" + "+d+" = "+ sum(c, d));

		
		//Use getIntWithinRange to validate a month entry (1-12)
		int month = getIntWithinRange("\nEnter a month number: ", sc, 1, 12);
		System.out.println("month entered = "+month);
		
		sc.close();
	}
	
	// Get an integer from console
	//use exception handling to check
	
	private static int getInt(String prompt, Scanner sc) {		//method order to catch invalid entries
		int nbr = 0;
		while (true) {
			try {
				
				System.out.print(prompt);
				nbr = sc.nextInt();
				break;
			} catch (InputMismatchException ime) { 			// ime is alias	//catches input error
				System.out.println("Error! Invalid number. Try again.\n");
				sc.nextLine();
				continue;
			}
		}
		return nbr;
		
	}
	
	private static int getIntWithinRange(String prompt, Scanner sc, int min, int max) {
		int nbr = 0;
		boolean isValid = false;
		
		while (!isValid) {
			nbr = getInt(prompt, sc);
			if (nbr < min) {
				System.out.println("Error! Number must be >= "+min+".");
			}
			else if (nbr > max) {
				System.out.println("Error! Number must be <= "+max+".");
			}
			else {
				isValid = true;
			}
		}
		
		return nbr;
	}
	
	
		// Get a double from console
		//use data validation to check input
		
		private static double getDouble(String prompt, Scanner sc) {		//method order to catch invalid entries
			double nbr = 0;
			while (true) {
					System.out.print(prompt);
					if (sc.hasNextDouble()) {
					nbr = sc.nextDouble();
					break;
				}
					else {
						System.out.println("Error! Invalid number. Try again.\n");
						sc.nextLine(); 		//clears out remaining entry
						continue;
					}
			}
			return nbr;
			
		}
	

	// needs to live outside of main method {} and before class{} ends
	// method, no inputs and no return type
	// private methods are only used within one class
	// public methods are used outside of one class/ in multiple classes
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the basic calculator app");
	}

	// an input and no return type
	private static void printHello(int n) {
		// print hello 'n' times
		for (int i = 1; i <= n; i++) { // (start,duration,increment)
			System.out.println("Hello " + i);
		}
	}

	// 2 inputs and a return type
	// accept 2 ints and return the sum
	private static int sum(int a, int b) {
		int sum = a + b;

		return sum;
	}

	// accept 2 doubles and return the sum
	private static double sum(double a, double b) {
		return a+b;
	}

}
