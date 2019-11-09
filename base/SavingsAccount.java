public class SavingsAccount {

	private double balance;
	private double interestRate;
	private int time;


	public SavingsAccount(double balance, double interestRate, int time) {

		super();
		this.balance = balance;
		this.interestRate = interestRate;
		this.time = time;

	}


	//getters

	public double getBalance() {

		return balance;

	}


	public double getInterestRate() {

		return interestRate;

	}


	//setters

	public void setInterestRate(double interestRate) {

		this.interestRate = interestRate;

	}


	public void setBalance(double balance) {

		this.balance = balance;

	}


	//functions

	public void deposit2(double balance) {

		this.balance = this.balance + balance;

	}


	public void withdraw2(double balance) {

		if(this.balance < balance) {

			System.out.println("Insuficient funds for this transaction.");

		} else {

			this.balance = this.balance - balance;

		}

	}


	public double calculateInterest(int time) {

		double total;

		total = this.balance * (1 + (interestRate*time));

		return total;

	}


	public void addInterest(int time) {

		this.balance = this.balance + calculateInterest(time);

	}





}