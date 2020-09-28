import java.util.Scanner;

public class MoreForLoops {

	public static void main(String[] args) {
		// Write a loop that will run 100 times
		// and print the iteration number
		
		for (int i=1; i <= 100; i++) {   // (variable counter starts at 1; -> 100; increment per run)
			System.out.println("In the loop... i="+i);	
		}

		//Same loop, 0 to 100, count by 2's
		for (int i = 0; i <= 100; i += 2) {
			System.out.println("In the loop... i = "+i);
		}
		
		
		// get user input for max number, count from 0 to number
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How high should I count?");
		int max = sc.nextInt();
		for (int i=0; i <=max; i++) {
			System.out.println("i = "+i);
				}
		
		
	
	}

}
