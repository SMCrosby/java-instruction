package banking;

public class Savings extends Account {		//extends identifies inheritance (parent class is called superclass in java)

	private double intRate = 0.01;

	
	public double getIntRate() {
		return intRate;
	}
	public void setIntRate(double intRate) {
		if (intRate < 0) {
			return;
		}
		this.intRate = intRate;
	}
	
	public double PayInterest(int months) {
		var interest = this.getBalance() *(this.getIntRate()/12) * months;
		this.Deposit(interest);
		return interest;
	}
	
	
	public Savings(String description) {
		super(description); //passes the description up to the (super)Account class 
	}
	public Savings() {
		super();	//Savings default constructor is calling the (superclass's)Account default constructor
	}
	
}
