import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int squared = 0;
		int cubed = 0;
		
		String choice = "y";
			while(choice.equalsIgnoreCase("y")) {
				int i = 0;
				
			System.out.print("\nEnter an Integer: ");
			number = sc.nextInt();
			System.out.println("\nNumber\tSquared\tCubed");
			System.out.println("=======\t=======\t=====");
			
			while (i < number) {
				i= i+1;
				squared = (i*i);
				cubed = (i*i*i);
				System.out.println((i+"\t"+squared+"\t"+cubed));
			}
				

			
			
				
			System.out.print("\nContinue? (y/n): ");
			choice = sc.next();
			}

		
		
		
		System.out.println("Goodbye");
		sc.close();
	}

}
