import java.util.Scanner;

public class Project_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Registration Form");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		System.out.print("Enter year of birth: ");
		int year = sc.nextInt();
		
		
		System.out.print("Welcome ");
		System.out.println(firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.print("Your temporary password is: ");
		System.out.println(firstName + "*" + year);
	}

}


//Student Registration Form
//Enter first name: Harold
//Enter last name: Moore
//Enter year of birth: 1998
//Welcome Harold Moore!
//Your registration is complete.
//Your temporary password is: Harold*1998