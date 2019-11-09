#ifndef BANKACCOUNT_H
#define BANKACCOUNT_H

#include "savingsAccount.h"
#include <string>

class BankAccount {

	public:
		
		BankAccount();
		BankAccount(std::string, std::string, std::string, int, bool, SavingsAccount* savingsAccount, double);

		~BankAccount();

		//getters
		std::string getFirstName();
		std::string getLastName();
		std::string getAccountNumber();
		int getAccountPIN();
		bool getIsAdmin();
		SavingsAccount getSavingsAccount();
		double getBalance();


		//setters
		void setFirstName(std::string);
		void setLastName(std::string);
		void setAccountNumber(std::string);
		void setAccountPIN(int);
		void setIsAdmin(bool);
		void setSavingsAccount(SavingsAccount*);
		void setBalance(double);


		void deposit(double);
		void withdraw(double);


	private:
		
		std::string firstName;
		std::string lastName;
		std::string accountNumber;
		int accountPIN;
		bool isAdmin;
		SavingsAccount* savingsAccount;
		double balance;


};

#endif 

