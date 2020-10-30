
public class PigDice {

	public static void main(String[] args) {
		

		System.out.println("Welcome to Pig Dice!");
		System.out.println("=====================");
		
		int dice1 = 0;
		int total = 0;
		int high = 0;
		int games = 0;
		
		while (high < 9999) {
			total = 0;
	
		while ((dice1 = getRandomInt(6)) != 1) {
			total += dice1;
		}
		
			//System.out.println("\nTotal of rolls before rolling a 1 is "+ total);
			games++;
			if (total > high) {high = total;
			//System.out.print("\nThe highest score is " + high + " after " + games + " games.");
			var message = String.format("The highest score is %d after %d games.", high, games);
			System.out.println(message);
			
			}
		}
	}
		

	//Dice random number
	private static int getRandomInt(int limit) {
		int r = (int)(Math.random() * limit);
		r++;
		return r;
		
		
		
	}

}