import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!");
		//Provide addition, subtraction functions
		Scanner sc = new Scanner(System.in);
		
		String command = "";
		while (!command.equalsIgnoreCase("x")) {
			System.out.println("\nCOMMAND MENU:");
			System.out.println("=============");
			System.out.println("+ : Addition");
			System.out.println("- : Subtraction");
			System.out.println("x : Exit App");
			System.out.println();
			
			System.out.println("Enter command:  ");
			command = sc.next();
			
			int n1 = 0;
			int n2 = 0;
			int result = 0;
			
			switch (command) {	// command is the variable used
			case "+":			// Add
				System.out.println("Addition");
				System.out.println("Enter 2 numbers: ");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 + n2;
				System.out.println("Result: "+result);
				break;
			case "-":			//Subtraction
				System.out.println("Subtraction");
				System.out.println("Enter 2 numbers: (First number - Second number)");
				n1 = sc.nextInt();
				n2 = sc.nextInt();
				result = n1 - n2;
				System.out.println("Result: "+result);
				break;
			case "x":			//Exit
			case "X":
				break;
			default:			//Invalid entry
				System.out.println("Invalid Entry");
				break;
			
			}
			
		}
		
		
		
		

		
		System.out.println("Goodbye");
		sc.close();
	}

}
