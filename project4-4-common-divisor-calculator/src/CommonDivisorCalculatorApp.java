import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		Scanner sc = new Scanner(System.in);
		
		
		int gcd = 0;			//greatest common divisor
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("\nEnter first number:\t\t");
			int x = sc.nextInt();
			System.out.print("Enter second number\t\t");
			int y = sc.nextInt();
			
			while (x>0) {
				while (y >= x) {
					y -= x;
				}
				//swap x and y
				int tempY = y;
				y = x;
				x = tempY;
				
			}
				
			
			System.out.println("Greatest common divisor:\t"+y);
			
			System.out.print("\nContinue? (y/n)\t");
			sc.next();
			
		}
		
		System.out.println("Goodbye");
		sc.close();
	}

	
}
