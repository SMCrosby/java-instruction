import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.print("=============");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.print("\nRoll the Dice? (y/n)\t");
		choice = sc.next();
		int d1 = 0;
		int d2 = 0;
		
		while (choice.equalsIgnoreCase("y")) {
			
		d1 = getRandomInt(6);
		d2 = getRandomInt(6);
		
			System.out.print("\nDie 1: "+d1);
			System.out.print("\nDie 2: "+d2);
			
			System.out.println("\nTotal: "+(d1+d2));
			
			if (d1==1 && d2==1) {
				System.out.println("---SnakeEyes!---");
			}
			else if (d1==6 && d2==6) {
				System.out.println("---Boxcars!---");
			}
			
			
			System.out.print("\nRoll Again? (y/n)\t");
			choice = sc.next();
			
		}
		
		
		System.out.println("Goodbye");
		sc.close();
	}
	
	//Dice random number 1-6
	private static int getRandomInt(int limit) {
		int r = (int)(Math.random() * limit);
		r++;
		return r;
	}

}
