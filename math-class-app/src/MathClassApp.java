
public class MathClassApp {

	public static void main(String[] args) {
		// pg 103 in the book
		long result1 = Math.round(1.667);
		System.out.println(result1);   			// result = 2  -- .round means rounding
		
		int result2= Math.round(1.49F);			// F = floating point number
		System.out.println(result2);   			// result = 1
		
		int result3 = (int)Math.round(1.667);	// (int) is casting from long datatype to int
		System.out.println(result3); 			// result = 2
		
		// rounding to a 100th decimal value
		double x = 10.315;
		System.out.println(x);
		x = (double)Math.round(x*100) / 100;   	//moves the decimal point to the right 3 places
		System.out.println(x);
		
		x = (double)Math.round(x*10) / 10;   	//moves the decimal point to the right 2 places
		System.out.println(x);
		
		System.out.println("Generate a random numbers");
		double r = Math.random();
		System.out.println(r);
		
		r = Math.random()*10;
		System.out.println(r);
		// generate a dice roll (1-6)
		int die = (int)(Math.random()*6)+1; 		  //wrap Math.random()*6 in "()"
		System.out.println("die roll is: "+ die);

	}

}
