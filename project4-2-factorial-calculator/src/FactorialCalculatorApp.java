import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		int count = 0;
			System.out.print("Enter an integer that's greater then 0 and less than 10: ");
			i = sc.nextInt();
			
			while (count > 0) {			//---stoped working here. need to figure out how to generate factors. 
				//loop in recomended
				count = i-1;
			
			}
		
			
			
			
		}
		
		System.out.println("Goodbye");
		sc.close();
	}

}



//Console
//Welcome to the Factorial Calculator
//Enter an integer that's greater than 0 and less than 10: 3
//The factorial of 3 is 6.
//Continue? (y/n): y
//Enter an integer that's greater than 0 and less than 10: 4
//The factorial of 4 is 24.
//Continue? (y/n): y
//Enter an integer that's greater than 0 and less than 10: 9
//The factorial of 9 is 362880.
//Continue? (y/n): n
//Specifications
// The exclamation point is used to identify a factorial. For example, the factorial of the
//number n is denoted by n!. Here’s how you calculate the factorial of the numbers 1
//through 5:
//1! = 1 which equals 1
//2! = 1 * 2 which equals 2
//3! = 1 * 2 * 3 which equals 6
//4! = 1 * 2 * 3 * 4 which equals 24
//5! = 1 * 2 * 3 * 4 * 5 which equals 120
// Use a for loop to calculate the factorial.
// Assume that the user will enter valid numeric data for the length and width.
// Use the long type to store the factorial.
// The application should continue only if the user enters “y” or “Y” to continue.
