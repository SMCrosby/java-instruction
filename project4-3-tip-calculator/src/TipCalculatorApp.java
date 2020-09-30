import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		System.out.println("===============");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			BigDecimal mealCost = new BigDecimal(0);
			BigDecimal tipCost = new BigDecimal(0);
			
			System.out.print("Cost of meal: ");
			mealCost = sc.nextBigDecimal();
			
			System.out.print("\n15%");
			tipCost = (mealCost.multiply(.15));
					tipCost.setScale(2, RoundingMode.HALF_UP);
			System.out.print("Tip amount: "+tipCost);
			System.out.print("Total amount: ");
			
			
			
			
		}
		System.out.println("Goodbye");
		sc.close();
	}

}


//Project 4-3: Tip Calculator
//Create an application that calculates three options for an appropriate tip to leave after a
//meal at a restaurant.
//Console
//Tip Calculator
//Cost of meal: 52.31
//15%
//Tip amount: $7.85
//Total amount: $60.16
//20%
//Tip amount: $10.46
//Total amount: $62.77
//25%
//Tip amount: $13.08
//Total amount: $65.39
//Continue? (y/n): n
//Specifications
//The application should calculate and display the cost of tipping at 15%, 20%, and
//25%.
// Use the BigDecimal class to make sure that all calculations are accurate.
// Assume that the user will enter a valid cost for the meal.
// Format the tip percent, the tip amount, and the total.
// The application should continue only if the user enters “y” or “Y” to continue.