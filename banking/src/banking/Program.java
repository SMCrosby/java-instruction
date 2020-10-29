package banking;

public class Program {

	public static void main(String[] args) {
		
			var acct1 = new Savings("Primary Savings Account");
			var acct2 = new Account("Secondary Account");
			
			
			acct1.Deposit(500);
			var success = acct1.Transfer(200, acct2);
			if(success) {
				System.out.println("acct1 balance is " + acct1.getBalance());
				System.out.println("acct2 balance is " + acct2.getBalance());
			}
			
			acct1.setIntRate(.12);
			acct1.PayInterest(1);
			System.out.println("acct1 balance after interest is " + acct1.getBalance());
		
		
	}

}
