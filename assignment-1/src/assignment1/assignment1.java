package assignment1;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ints = {448, 823, 950, 553, 450, 720, 307, 348, 425, 543, 265, 283, 830, 585, 816};
		
		for(var i : ints) {
			System.out.print(i + ", ");
		}
		
		var sum = 0;
		int count = 0;
		var avg = 0;
		var high = 0;
		var low = 1000;
		
		for(var idx : ints) {
			sum += idx;
			count++;
			if (idx > high) {
				high = idx;
			}
			if (idx < low) {
				low = idx;
			}
		}
		
		avg = (sum/count);
		System.out.println("\nThe Sum is " + sum);
		System.out.println("The Average is " + avg );
		System.out.println("The Largest number is " + high);
		System.out.println("The Smallest number is " + low);
		
		
	}

}
