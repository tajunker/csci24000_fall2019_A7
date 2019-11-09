public class BankAccount {

	private String firstName;
	private String lastName;
	private String accountNumber;
	private int accountPIN;
	private boolean isAdmin;
	private SavingsAccount savingsAccount;
	private double amount;

	public BankAccount(String firstName, String lastName, String accountNumber, int accountPIN, boolean isAdmin, SavingsAccount savingsAccount, double amount) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.accountPIN = accountPIN;
		this.isAdmin = isAdmin;
		this.savingsAccount = savingsAccount;
		this.amount = amount;

	}


	//getters

	public String getFirstName() {

		return firstName;

	}

	public String getLastName() {

		return lastName;

	}

	public String getAccountNumber() {

		return accountNumber;

	}

	public int getAccountPIN() {

		return accountPIN;

	}

	public boolean getIsAdmin() {

		return isAdmin;

	}

	public SavingsAccount getSavingsAccount() {

		return savingsAccount;

	}

	public double getAmount() {

		return amount;

	}


	//setters

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	
	public void setLastName(String lastName) {

		this.lastName = lastName;

	}


	public void setAccountNumber(String accountNumber) {

		this.accountNumber = accountNumber;

	}

	
	public void setAccountPIN(int accountPIN) {

		this.accountPIN = accountPIN;

	}


	public void setIsAdmin(boolean isAdmin) {

		this.isAdmin = isAdmin;

	}


	public void setAmount(double amount) {

		this.amount = amount;

	}


	//functions


	public void deposit(double amount) {

		this.amount = this.amount + amount;

	}


	public void withdraw(double amount) {

		if(this.amount < amount) {

			System.out.println("Insuficient funds for this transaction.");

		} else {

			this.amount = this.amount - amount;

		}

	}


}