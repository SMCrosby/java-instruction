import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// Temperature Converter
		
		System.out.println("Welcome to the Temperature Converter");
		Scanner sc = new Scanner(System.in);
		

			
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("\nEnter degrees in Fahrenheit: ");
			double ftemp = sc.nextDouble();
			
			double ctemp = (ftemp-32) * 5/9;
			 
			NumberFormat number = NumberFormat.getNumberInstance();
			number.setMaximumFractionDigits(2);
			String ctemp2 = number.format(ctemp);
			
			System.out.print("Degrees in Celcious: "+ ctemp2);
			
			System.out.print("\n\nContinue? (y/n) ");
			choice = sc.next();
		}
			System.out.println("GoodBye");
			sc.close();
	}


}
