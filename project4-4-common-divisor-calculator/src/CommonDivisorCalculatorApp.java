import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		Scanner sc = new Scanner(System.in);
		
		
		int gcd = 0;			//greatest common divisor
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("Enter first number:\t");
			int x = sc.nextInt();
			System.out.print("Enter second number\t");
			int y = sc.nextInt();
			
			while (x>0) {
				while (y>x) {
					y -= x;
				}
				//swap x and y
				int tempY = y;
				y = x;
				x = tempY;
				
			}
				
			
			System.out.println("Greatest common divisor:\t"+y);
			
			
			System.out.println("Continue? (y/n)");
			sc.next();
			
		}
		
		System.out.println("Goodbye");
		sc.close();
	}

	
}

//Specifications
// The formula for finding the greatest common divisor of two positive integers x and y
//follows the Euclidean algorithm as follows:
//1. Subtract x from y repeatedly until y < x.
//2. Swap the values of x and y.
//3. Repeat steps 1 and 2 until x = 0.
//4. y is the greatest common divisor of the two numbers.
//You can use one loop for step 1 of the algorithm nested within a second loop for step
//3.
// Assume that the user will enter valid integers for both numbers.
// The application should continue only if the user enters “y” or “Y” to continue.