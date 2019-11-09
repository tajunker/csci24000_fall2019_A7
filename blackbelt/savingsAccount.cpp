#include "bankAccount.h"
#include "savingsAccount.h"
#include <iostream>
#include <string>

SavingsAccount::SavingsAccount() {

}

SavingsAccount::SavingsAccount(double balance, double interestRate) {
	SavingsAccount::balance = balance;
	SavingsAccount::interestRate = interestRate;
}

SavingsAccount::~SavingsAccount() {

}


//getters
double SavingsAccount::getBalance() {
	return SavingsAccount::balance;
}

double SavingsAccount::getInterestRate() {
	return SavingsAccount::interestRate;
}

int SavingsAccount::getTime() {
	return SavingsAccount::time1;
}



//setters
void SavingsAccount::setBalance(double balance) {
	SavingsAccount::balance = balance;
}

void SavingsAccount::setInterestRate(double interestRate) {
	SavingsAccount::interestRate = interestRate;
}

void SavingsAccount::setTime(int time1) {
	SavingsAccount::time1 = time1;
}




double SavingsAccount::calculateInterest(int time1) {

	double amount;

	amount = SavingsAccount::balance * (1 + (SavingsAccount::interestRate*time1));

	return amount;

}

void SavingsAccount::deposit(double balance) {

	SavingsAccount::balance = SavingsAccount::balance + balance;

}

void SavingsAccount::withdraw(double balance) {

	if(SavingsAccount::balance < balance) {

		std::cerr << "Insufficient funds!" << std::endl << std::endl;

	} else {

		SavingsAccount::balance = SavingsAccount::balance - balance;

	}

}

void SavingsAccount::addInterest(int time1) {

	SavingsAccount::balance = SavingsAccount::balance + calculateInterest(time1);

}

