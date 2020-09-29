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
		String comment = "Great work you are a mathmatical wizard!";
		int random = (int)(Math.random() * 100);
			random++;
			
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
			
			
			System.out.println("\nContinue? (y/n) ");
			choice = sc.next();
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
			//Work in progress for (y/n) sorting
//	private static void getChoice(String prompt, Scanner sc) {
//		String c = sc.next();
//		if (c.equalsIgnoreCase("y") || c.equalsIgnoreCase("n")) {
//			
//		}
		
	}
	

}




//Try again? (y/n):
//Error! This entry is required. Try again.
//Try again? (y/n): x
//Error! Entry must be 'y' or 'n'. Try again.
//Try again? (y/n): n

// When the user responds to the “Try Again?” prompt, the application should only
//accept a value of “y” or “n”.
// If the user enters invalid data, the application should display an appropriate error
//message and prompt the user again until the user enters valid data.