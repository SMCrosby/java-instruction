package banking;

public class Account {

	private static int nextId = 1;
	public int id;
	public String description;
	public double balance;
	
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;		//can use "this." when referring to a property or method of the class
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		//if(balance <= 0) {
		//}
		this.balance = balance;
	}
	
	
	public Account(String description) {
		this(); //no parameters calls default constructor
		this.setDescription(description);
	}
	
	
	public Account() {
			//this.id = Account.nextId++;
			//this.description = "New Account";
			//this.balance = 0;
		this.setId(Account.nextId++);
		this.setDescription("New Account");
		this.setBalance(0);
	}
	
	public boolean Deposit(double amount) {
		if(amount <=0) {
			return false;
		}
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	
	public boolean Withdraw(double amount) {
		if (amount <= 0) {
			System.out.println("Withdraw amount can't be <= 0");
			return false;
		}
		if(amount > this.getBalance()) {
			System.out.println("Withdraw amount can't be greater then current balance");
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public boolean Transfer(double amount, Account toAccount) {
		var withdrawok = this.Withdraw(amount);
	if (withdrawok) {				//already either true or false since var is bool
		toAccount.Deposit(amount);
		return true;
	}
		return false;
	}
	
	
	

}

