import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
			
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
			System.out.print("\nEnter a loan amount: \t");
			double loan = sc.nextDouble();
			
//			System.out.println("Enter loan amount: \t");      -- Another way to gather data as a bigdecimal
//			BigDecimal loan = sc.nextBigDecimal();
			
			
					
			System.out.print("Enter interest rate: \t");
			double rate = sc.nextDouble();
			
			BigDecimal loanBD = new BigDecimal(loan);   //creates a bigdecimal instance of our double data
			BigDecimal rateBD = new BigDecimal(rate);
			
			
			BigDecimal intAmt = loanBD.multiply(rateBD)
					.setScale(2, RoundingMode.HALF_UP);
			
			NumberFormat currency = NumberFormat.getCurrencyInstance();     //set a format that can be used later
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);    //percent goes out 3 places
			
			System.out.println();
			System.out.println("Loan Amount:\t " + currency.format(loanBD));
			System.out.println("Interest Rate:\t "+ percent.format(rateBD));
			System.out.println("Interest:\t "+ currency.format(intAmt));
			
			
					
				
			
			
			
			
			
			System.out.println("\nContinue? (y/n)");
			choice = sc.next();
		}
		System.out.println("Goodbye");
		sc.close();
	}

}
