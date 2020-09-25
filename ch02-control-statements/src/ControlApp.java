import java.util.Scanner;

public class ControlApp {

	public static void main(String[] args) {
		// ch2 pgs 65-69
		
		// if statement
		Scanner sc = new Scanner(System.in);
		//initialize choice to 'y' so loop will run
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter traffic light color: ");
			String color = sc.nextLine();
			
			if (color.equalsIgnoreCase("red")) {
				System.out.println("Red Light - Stop!");
			}
			
			else if (color.equalsIgnoreCase("yellow")) {
				System.out.println("Yellow Light - Prepare to Stop");
			}
			
//		else {										-- defaults to green if other conditions were not met
//			System.out.println("Green Light - Go!");   
//			
//		}
			
			else if (color.equalsIgnoreCase("green")) {
				System.out.println("Green Light - Go!");
				
			}
			System.out.println("Continue? (y/n) ");
			choice = sc.nextLine();
			
		}
	System.out.println("Bye");
	
	}
}
