import java.util.Scanner;

public class BmbdProjectCh4 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Bootcamp Movie Database");
		Scanner sc = new Scanner(System.in);
		String firstName = "";
		String lastName = "";
		String gender = "M";
		String birthDate = "";
		String genderL = "Male";
		
		String title = "";
		String year = "";
		String rating = "";
		String genre = "";
		
		String command = " ";
		while (!command.equalsIgnoreCase("3")) {
			System.out.println("\nMENU");
			System.out.println("=====");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			
			System.out.print("Enter Command:   ");
			command = sc.next();
			
			switch (command) {
			case "1":			//Add Actor
				System.out.println("\nAdd an Actor:  ");
				System.out.print("-------------");
				System.out.print("\nEnter First Name: \t\t");
				firstName = sc.next();
				System.out.print("Enter Last Name: \t\t");
				lastName = sc.next();
				System.out.print("Enter Gender (M/F): \t\t");
				gender = sc.next();
				System.out.print("Enter Birthdate (YYYY-MM-DD): \t");
				birthDate = sc.next();
				
				if (gender.equalsIgnoreCase("M")) {
					genderL = "Male"; 
				}
				else if (gender.equalsIgnoreCase("F")) {
					genderL = "Female";
					 }
				
				System.out.println("Actor Summary:");
				System.out.println("---------------");
				System.out.println(firstName + " " + lastName+", " + genderL +", Born " + birthDate);
				break;
				
			case "2": 			//Add Movie
				System.out.println("\nAdd a Movie: ");
				System.out.println("-------------");
				System.out.print("Name of Title: \t");
				title = sc.next();
				System.out.print("Year Released: \t");
				year = sc.next();
				System.out.print("Movie Rating: \t");
				rating = sc.next();
				System.out.print("Movie Genre: ");
				genre = sc.next();
				
				System.out.println("\nMovie Summary:");
				System.out.println("--------------");
				System.out.println(title +" ("+ rating+") was released \n in "+year+".  Genre(s): "+genre);
				
				
				//Add a Movie:
				//Title?  Jumanji: Welcome to the Jungle
				//Year?  2017
				//Rating?  PG-13
				//Genre?  Action, Adventure, Comedy
				//
				//Movie Summary:
				//Jumanji: Welcome to the Jungle (PG-13) was released
				//In 2017.  Genre(s): Action, Adventure, Comedy
				
				
				
				break; 
			case "3" :        	//Exit
				break;
			default:			//Invalid entry
				System.out.println("Invalid Entry");
				break;
			
			
			
			
			}
			
			
			
			
		}
		
	

	}

}


//Welcome to the Bootcamp Movie DB!
//
//Menu
//1 - Add Actor
//2 - Add Movie
//3 - Exit
//
//Command:  1
//
//Add an Actor:
//First Name?  Dwayne
//Last Name?  Johnson
//Gender (M/F)?  M
//BirthDate (YYYY/MM/DD)?  1972-05-02
//
//Actor Summary:
//Dwayne Johnson, Male, born 1972-05-02
//
//Menu
//1 - Add Actor
//2 - Add Movie
//3 - Exit
//
//Command:  2
//
//Add a Movie:
//Title?  Jumanji: Welcome to the Jungle
//Year?  2017
//Rating?  PG-13
//Genre?  Action, Adventure, Comedy
//
//Movie Summary:
//Jumanji: Welcome to the Jungle (PG-13) was released
//In 2017.  Genre(s): Action, Adventure, Comedy
//
//Menu
//1 - Add Actor
//2 - Add Movie
//3 - Exit
//
//Command:  3
//
//Bye!




