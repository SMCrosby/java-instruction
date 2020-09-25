import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		// Find the diameter of a rectangle
		Scanner sc = new Scanner(System.in);
		double perimeter = 0;
		double area = 0;
				
		
		System.out.println("Welcome to the Area and Perimeter Calculator");
		
		
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("\nEnter length: ");
			double length = sc.nextDouble();
			
			System.out.print("Enter width: ");
			double width = sc.nextDouble();
			
			area = (length * width);
			System.out.println("Area: " +area);
			
			perimeter = ((length * 2) + (width * 2));
			System.out.println("Perimeter: " +perimeter);
			
			System.out.println(" ");
			
			System.out.println("Continue? (y/n)");
			choice = sc.next();
			
			
		}
		
		System.out.println("Bye Bye");
		sc.close();
		
	}

}
