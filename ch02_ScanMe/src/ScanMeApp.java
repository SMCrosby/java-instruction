import java.util.Scanner;

public class ScanMeApp {

	public static void main(String[] args) {
		// Prompt use from 3 numbers on one line then get them
		//pg. 63
		System.out.print("Enter 3 integers seperated by a space: ");
		Scanner sc = new Scanner(System.in);  //Capitalize System.in
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		System.out.println("Sum of all numbers: "+(n1=n2+n3));
		
		

	}

}
