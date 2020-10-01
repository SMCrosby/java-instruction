import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    //personal code for (y/n) checking
    public static String getChoiceString(String prompt, Scanner sc) {
		System.out.print(prompt);
		String choice = sc.next(); 
		while ((choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n")) != true) {
			System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
			System.out.print(prompt);
			choice = sc.next(); 	
		}
		return choice;

	}
    //end (y/n) code
    
    
    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
}









//Method to make sure entry isn't blank

//private static String getRequiredString(String prompt, Scanner sc) {
//	String str = " ";
//	boolean isValid = false;
//	while (!isValid) {
//		System.out.println(prompt);
//		str = sc.nextLine();
//		if (str.equals(" ")) {
//			System.out.println("Invalid Entry.. this feild is required");	
//		}
//		else {
//			isValid = true;
//		}
//	}
//}
//
////Method to get required string which only has 2 valid choices (s1, s2)
//
//private static String getChoiceString(String prompt, Scanner sc, String s1, String s2) {
//	String str = "";
//	boolean isValid = false;
//	while (!isValid) {
//		str = getRequiredString(prompt, sc);
//		if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
//			// Entry is invalid
//			System.out.println("Invalid Entry: Expected values are '"+s1+"' or '"+s2+"'.");
//		}
//	}
//	return str;
//}
