import java.util.Scanner;

public class Project_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Welcome to the Letter Grade Converter!");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter numerical grade: ");
			int grade = sc.nextInt();
			String letterGrade = ""; 
			
		if (grade >= 88) {
			letterGrade = "A";
		}
		
		else if (grade >= 80) {
			letterGrade = "B";
		}
		
		else if (grade >= 68)  {
			letterGrade = "C";
		}
		else if (grade >= 60)  {
			letterGrade = "D";
		}
		else if (grade <= 60) {
			letterGrade = "F";
		}
		System.out.println("Letter Grade: " +letterGrade);
		
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		}	
		
	System.out.println("Bye Bye");
	sc.close();
	}
}


	
		
		
