import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TravelTimeCalculator {

	public static void main(String[] args) {
		// Create an application that calculates travel time based on distance and speed.
		System.out.println("Welcome to the Travel Time Calculator");
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter miles: \t\t");
			double miles = sc.nextDouble();
			
			System.out.print("Enter miles per hour: \t");
			double mph = sc.nextDouble();
			
			System.out.println("\nEstimated Travel Time");
			System.out.println("----------------------");
			
			double hours = miles/mph;
			double minutes = 00 ;
			
			
			
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(0);
			
			String hstring = number.format(hours);
			String mstring = number.format(minutes);
			
			System.out.println("Hours: \t\t" + hstring);
			System.out.println("Minutes: \t" + mstring);
			
			System.out.println("\nContinue? (y/n) ");
			choice = sc.next();
			
		}
		
		System.out.println("Bye Bye");
		sc.close();

	}

}



// Use integer arithmetic and the division and modulus operators to get hours and
//minutes.