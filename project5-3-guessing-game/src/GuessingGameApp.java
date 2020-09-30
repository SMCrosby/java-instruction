import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");

		System.out.println("\nI'm thinking of a number from 1 to 100.\nTry to guess it.");
		
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int guess = 0;
		String comment = "";
		int random = (int)(Math.random() * 100)+1;		//random = the number we're trying to guess
			
			
	while (choice.equalsIgnoreCase("y")) {
		System.out.println(random);
		
		while (guess != random) {
			guess = getIntWithinRange("\nEnter a number: ", sc, 1, 100);
			i++; 
			
		if (guess == random) {
				if (i <= 3) { comment = "Great work! You are a mathmatical wizard!"; }
				else if (i <= 7) { comment = "Not too bad! You've got some potential."; }
				else if (i > 7) { comment = "What took you so long? \nMaybe you should take some lessons..."; } 
				
				System.out.println("You guessed it in "+i+" tries!\n"+comment);
				}
		
		else if (guess <= (random-10)) {
			System.out.println("Way too low. Guess again");
		}
		else if (guess < (random)) {
			System.out.println("Too low. Guess again");
		}
		else if (guess >= (random+10)) {
			System.out.println("Way too high. Guess again");
		}
		else if (guess > (random)) {
			System.out.println("too high. Guess again");
		}
	}

			choice = getChoiceString("\nContinue (y/n):  ", sc);

			random = (int)(Math.random() * 100);
			random++;
		}
		
		System.out.println("GoodBye - Come back soon");
		sc.close();
	}
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
			//(y/n) input check
	private static String getChoiceString(String prompt, Scanner sc) {
		System.out.print(prompt);
		String choice = sc.next(); 
		while ((choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) != true) {
			System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
			System.out.print(prompt);
			choice = sc.next(); 	
		}
		return choice;

	}

}



//Method to make sure entry isn't blank

//private static String getRequiredString(String prompt, Scanner sc) {
//	String str = " ";
//	boolean isValid = false;
//	while (!isValid) {
//		System.out.println(prompt);
//		str = sc.nextLine();
//		if (str.equals(" ")) {
//			System.out.println("Invalid Entry.. this feild is required");	
//		}
//		else {
//			isValid = true;
//		}
//	}
//}
//
////Method to get required string which only has 2 valid choices (s1, s2)
//
//private static String getChoiceString(String prompt, Scanner sc, String s1, String s2) {
//	String str = "";
//	boolean isValid = false;
//	while (!isValid) {
//		str = getRequiredString(prompt, sc);
//		if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
//			// Entry is invalid
//			System.out.println("Invalid Entry: Expected values are '"+s1+"' or '"+s2+"'.");
//		}
//	}
//	return str;
//}

