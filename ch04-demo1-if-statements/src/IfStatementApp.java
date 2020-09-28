import java.util.Scanner;

public class IfStatementApp {

	public static void main(String[] args) {

		//if (color == "red")  <--- Dont do this

		String color = "yellow";
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Color is red");
		}
		
		if (color.equalsIgnoreCase("red"))				//Same thing just continued onto second line
			System.out.println("color is red");
			System.out.println("Hello"); 				//Not part of if statement - will always run since not in brackets
		
			
			
		int total = 100;
		
		if (total == 50) {
			System.out.println("Total is 50");
		}
		else if (total > 50) {
			System.out.println("Total is greater then 50");
		}
		else if (total < 50) {
			System.out.println("Total is less than 50");
		}
		
		//second if else block
		if (total >= 75 ) {
			System.out.println("Total is greater than or equal to 75");
		}
		else if (total <= 75) {
			System.out.println("Ttoal is less then or equal to 75");
		}
		
		//3rd if else block
		if (total != 0) {
			System.out.println("Total is not equal to 0");
		}
		
		//Traffic light example
		
		int distanceFromLight = 30;  	//yards from stop light
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Light is red... STOP");
		}
		else if (color.equalsIgnoreCase("green")) {
			System.out.println("Light is green... GO");
		}
//		else if (color.equalsIgnoreCase("yellow") && distanceFromLight > 30) {
//			System.out.println("Light is yellow and far... Slow down");
//		}
//		else if (color.equalsIgnoreCase("yellow") && distanceFromLight <= 30) {
//			System.out.println("Light is yellow and close... Speed up");
//		}
		else if (color.equalsIgnoreCase("yellow")) {
			if (distanceFromLight > 30) {
				System.out.println("Light is yellow and far away.. Slow down");
			}
			else if (distanceFromLight <= 30) {
				System.out.println("Light is yellow and close... Speed up");
			}
		}
		else {
			System.out.println("Error - Invalid light color");
		}
		
		
		
		// || Condition, pg 123			--( || = "Or" )--( && = "And" )--( ! = "Not")
		
		int favoriteNumber = 10;
		
		if (favoriteNumber == 10 || favoriteNumber == 11) {      //    ||  = "or"
			System.out.println("# is 10 or 11");
		}
		else {
			System.out.println("3 is not 10 or 11");
		}
				
		
		// Block scope, pg 124    
		//Block scope references things within {} not existing outside of the block
		//we want to add 2 numbers, if favorite number is 10
		int n1 = 0;
		int n2 = 0;
		if (favoriteNumber == 10) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter 2 numbers on one line: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		int sum = n1 + n2;
		System.out.println("Sum = "+sum);
		
			
			
			
			
			
		
	}

}
