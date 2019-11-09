import java.util.*;

public class ATMMachine {

	public static void main(String[] args) {


		ArrayList<BankAccount> bankAccounts = new ArrayList<>();

		Scanner scan = new Scanner(System.in);


		String yesNoFlag = "y";
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;


		String accountNumber;
		int accountPIN;


		bankAccounts.add(new BankAccount("Joe", "Admin", "00000", 12345, true, new SavingsAccount(5000, 2, 12), 10000));

		System.out.println("Please enter your account number:");
		accountNumber = scan.next();

		System.out.println("Please enter your account PIN number:");
		accountPIN = scan.nextInt();


		while (!yesNoFlag.equalsIgnoreCase("n") || yesNoFlag == "y") {


			for(int i = 0; i < bankAccounts.size(); i++) {


				if (bankAccounts.get(i).getAccountPIN() == accountPIN && bankAccounts.get(i).getAccountNumber().equals(accountNumber)) {

					flag = true;

					if (bankAccounts.get(i).getIsAdmin()) {

						System.out.println("Please select from the following options:");
						System.out.println("1. add a user.");
						System.out.println("2. delete a user (account must be empty).");
						System.out.println("3. list all users.");
						System.out.println("4. apply interest to all savings accounts.");
						System.out.println("5. exit.");

						int selectedOption;

						selectedOption = scan.nextInt();

						while(flag != false) {

							if(selectedOption == 1) {

								System.out.println("1. add a user.");

								System.out.println("Please enter the First Name Associated with this Account:");
								String newAccountFirstName;
								newAccountFirstName = scan.next();


								System.out.println("Please enter the Last Name Associated with this Account:");
								String newAccountLastName;
								newAccountLastName = scan.next();


								System.out.println("Please enter an Account Number:");
								String newAccountNumber;
								newAccountNumber = scan.next();


								System.out.println("Please enter an account PIN Number:");
								int newAccountPIN;
								newAccountPIN = scan.nextInt();


								System.out.println("Please enter the balance amount for this Account:");
								double newAccountBalance;
								newAccountBalance = scan.nextDouble();


								System.out.println("Please enter the balance amount for this Savings Account:");
								double newSavingsAccountBalance;
								newSavingsAccountBalance = scan.nextDouble();


								System.out.println("Please enter the Interest Rate for this Account:");
								double newInterestRate;
								newInterestRate = scan.nextDouble();


								bankAccounts.add(new BankAccount(newAccountFirstName, newAccountLastName, newAccountNumber, newAccountPIN, false, new SavingsAccount(newSavingsAccountBalance, newInterestRate, 12), newAccountBalance));

								flag = false;
								selectedOption = 1;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption == 2) {

								System.out.println("2. delete a user (account must be empty).");

								System.out.println("Please enter the Account Number of the User you would like to delete:");
								String accountNumberToDelete;
								accountNumberToDelete = scan.next();


								Iterator<BankAccount> iteratorBankAccount = bankAccounts.iterator();

								for(int x = 0; x < bankAccounts.size(); x++) {

									if(iteratorBankAccount.next().getAccountNumber().equals(accountNumberToDelete)) {

										iteratorBankAccount.remove();

										System.out.println("Account Number: " + accountNumberToDelete + " does not exist.");

									} else {

										
										System.out.println("Account and user deleted.");

									}

								}

								flag = false;
								selectedOption = 2;
								yesNoFlag = "y";
								break;


							}

							if(selectedOption == 3) {

								System.out.println("3. list all users.");

								for (int k = 0; k < bankAccounts.size(); k++) {

									System.out.println("Account Number: " + bankAccounts.get(k).getAccountNumber());

								}

								flag = false;
								selectedOption = 3;
								yesNoFlag = "y";
								break;								

							}

							if(selectedOption == 4) {

								System.out.println("4. apply interest to all savings accounts.");

								System.out.println("Applying interest to all savings accounts.");

								for (int j = 0; j < bankAccounts.size(); j++) {

									bankAccounts.get(j).getSavingsAccount().addInterest(12);

								}

								System.out.println("Interest applied to all accounts.");

								flag = false;
								selectedOption = 4;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption == 5) {

								System.out.println("5. exit.");

								System.out.println("Logging out...");

								System.out.println("Logging out was successful.");

								flag = false;
								selectedOption = 5;
								yesNoFlag = "n";
								break;

							}

							if(selectedOption == 1 || selectedOption == 2 || selectedOption == 3 || selectedOption == 4 || selectedOption == 5) {

								flag = false;
								

							} else {

								System.out.println("You have selected an invalid option. Please try again.");

							}

						}


					} else {

						flag1 = true;

						System.out.println("Please select from the following options:");
						System.out.println("1. get checking balance.");
						System.out.println("2. deposit into checking.");
						System.out.println("3. withdraw from checking.");
						System.out.println("4. get savings balance.");
						System.out.println("5. deposit into savings.");
						System.out.println("6. withdraw from savings.");
						System.out.println("7. exit.");

						int selectedOption2;

						selectedOption2 = scan.nextInt();

						while(flag1 != false) {

							if(selectedOption2 == 1) {

								System.out.println("1. get checking balance.");

								System.out.println("Checking Account Balance:" + bankAccounts.get(i).getAmount());

								flag1 = false;
								selectedOption2 = 1;
								yesNoFlag = "y";
								break;
														
							}

							if(selectedOption2 == 2) {

								System.out.println("2. deposit into checking.");

								System.out.println("Please enter the Amount you wish to deposit:");
								double amountToBeDeposited;
								amountToBeDeposited = scan.nextDouble();

								bankAccounts.get(i).deposit(amountToBeDeposited);

								flag1 = false;
								selectedOption2 = 2;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption2 == 3) {

								System.out.println("3. withdraw from checking.");

								System.out.println("Please enter the Amount you wish to withdraw:");
								double amountToBeWithdrawn;
								amountToBeWithdrawn = scan.nextDouble();

								bankAccounts.get(i).withdraw(amountToBeWithdrawn);

								flag1 = false;
								selectedOption2 = 3;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption2 == 4) {

								System.out.println("4. get savings balance.");

								System.out.println("Savings Account Balance:" + bankAccounts.get(i).getSavingsAccount().getBalance());

								flag1 = false;
								selectedOption2 = 4;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption2 == 5) {

								System.out.println("5. deposit into savings.");

								System.out.println("Please enter the Amount you wish to deposit into your Savings Account:");
								double amountToBeDepositedSavings;
								amountToBeDepositedSavings = scan.nextDouble();

								bankAccounts.get(i).getSavingsAccount().deposit2(amountToBeDepositedSavings);

								flag1 = false;
								selectedOption2 = 5;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption2 == 6) {

								System.out.println("6. withdraw from savings.");

								System.out.println("Please enter the Amount you wish to withdraw from your Savings Account:");
								double amountToBeWithdrawnSavings;
								amountToBeWithdrawnSavings = scan.nextDouble();

								bankAccounts.get(i).getSavingsAccount().withdraw2(amountToBeWithdrawnSavings);

								flag1 = false;
								selectedOption2 = 6;
								yesNoFlag = "y";
								break;

							}

							if(selectedOption2 == 7) {

								System.out.println("7. exit.");

								System.out.println("Logging out...");

								System.out.println("Logging out was successful.");

								flag = false;

								flag1 = false;
								selectedOption2 = 7;
								yesNoFlag = "n";
								break;

							}

							if(selectedOption2 == 1 || selectedOption2 == 2 || selectedOption2 == 3 || selectedOption2 == 4 || selectedOption2 == 5 || selectedOption2 == 6 || selectedOption2 == 7) {

								flag = false;
								

							} else {

								System.out.println("You have selected an invalid option. Please try again.");

							}

						}

					}

				} else {



					if (flag == true) {

						System.out.println("Unable to locate account with information entered.");
						flag = false;
						
					}

					if(flag == false) {

						System.out.println("Would you like to perform another transaction?");
						System.out.println("Please enter y/n (lower case)");

						yesNoFlag = scan.next();

						if(yesNoFlag.equalsIgnoreCase("y")) {

							System.out.println("Please enter your account number:");
							accountNumber = scan.next();

							System.out.println("Please enter your account PIN number:");
							accountPIN = scan.nextInt();
						}

						

					} 

					

				}

			}

		}
		
	}

}