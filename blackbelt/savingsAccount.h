#ifndef SAVINGSACCOUNT_H
#define SAVINGSACCOUNT_H

#include <string>

class SavingsAccount {

	public:

		SavingsAccount();
		SavingsAccount(double, double);
		
		~SavingsAccount();

		//getters
		double getBalance();
		double getInterestRate();
		int getTime();
		

		//setters
		void setBalance(double);
		void setInterestRate(double);
		void setTime(int);
		

		double calculateInterest(int);

		void depoit(double);
		void withdraw(double);
		void addInterest(int);


	private:
		
		double balance;
		double interestRate;
		int time1;		

};

#endif 