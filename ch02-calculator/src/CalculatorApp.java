
public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator App!!");
		
		// This simple app will add two numbers
		
		int n1 = 5;
		int n2 = 25;
		
		int sum = n1 + n2;
		
		System.out.println("The sum is "+sum);
		
		// do more math
		double d1 = 25.5;
		double d2 = 5.0;
		
		System.out.println("The difference is "+(d1 - d2));
		System.out.println("The product is "+(d1 * d2));
		System.out.println("The quotient is "+(d2 / d1));
		
		// this doesn't work
		//int sum2 = n1 + d1;
		
		//change sum to double
		double sum2 = n1 +d1;
		
		// cast d1 as an int
		sum = n1 +(int)d1;    // changing variable type is called a "cast"
		
		// declare a counter variable
		int i = 0;
		// add one
		i = i + 1;

		
		
		
		
		
		System.out.println("Bye");

	}

}
