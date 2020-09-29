import java.util.Scanner;

public class BmbdProjectCh4 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie Database");
		Scanner sc = new Scanner(System.in);
		String genderL = " ";
		
		String command = " ";
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("\nMENU");
			System.out.println("=====");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			
			System.out.print("\nEnter Command:   ");
			command = sc.next();
			
			switch (command) {
			case "1":			//Add Actor
				System.out.println("\nAdd an Actor:  ");
				System.out.print("-------------");
				System.out.print("\nEnter First Name: \t\t");
				String firstName = sc.next();
				System.out.print("Enter Last Name: \t\t");
				String lastName = sc.next();
				System.out.print("Enter Gender (M/F): \t\t");
				String gender = sc.next();
				System.out.print("Enter Birthdate (YYYY-MM-DD): \t");
				String birthDate = sc.next();
				
				
				if (gender.equalsIgnoreCase("M")) {
					genderL = "Male"; 
				}
				else if (gender.equalsIgnoreCase("F")) {
					genderL = "Female";
				}
				else genderL = "Unknown/Non-Binary";
				
				System.out.println("Actor Summary:");
				System.out.println("---------------");
				System.out.println(firstName + " " + lastName+", " + genderL +", Born " + birthDate);
				break;
				
			case "2": 			//Add Movie
				System.out.println("\nAdd a Movie: ");
				System.out.println("-------------");
				System.out.print("Name of Title: \t");
				sc.nextLine();
				String title = sc.nextLine();
				System.out.print("Year Released: \t");
				int year = sc.nextInt();
				System.out.print("Movie Rating: \t");
				String rating = sc.next();
				System.out.print("Movie Genre(s): ");
				sc.nextLine();
				String genre = sc.nextLine();
				
				System.out.println("\nMovie Summary:");
				System.out.println("--------------");
				System.out.println(title +" ("+ rating+") was released \nin "+year+".  Genre(s): "+genre);
				
				break; 
			case "3" :			//Exit
				System.out.println("\n--Goodbye--");
				break;
			default:			//Invalid entry
				System.out.println("Invalid Entry");
				break;
			
			
			}
			
			
		}
		
		sc.close();
		
	}

}

