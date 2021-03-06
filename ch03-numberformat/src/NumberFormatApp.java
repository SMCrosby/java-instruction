import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		// pg 105
		double astonMartinPrice = 245789.23;
		double interestPct = .035557;
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat pct = NumberFormat.getPercentInstance();
		pct.setMaximumFractionDigits(4);		// goes out 4 decimal places
		
		System.out.println("Car finance info: ");
		System.out.println("Price:\t\t"+currency.format(astonMartinPrice));
		System.out.println("Interest:\t"+pct.format(interestPct));

	}

}
