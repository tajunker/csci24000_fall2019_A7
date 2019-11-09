#include "bankAccount.h"
#include "savingsAccount.h"
#include <iostream>
#include <string>

BankAccount::BankAccount() {
	BankAccount::savingsAccount = new SavingsAccount();
}

BankAccount::BankAccount(std::string firstName, std::string lastName, std::string accountNumber, int accountPIN, bool isAdmin, SavingsAccount* savingsAccount, double balance) {
	BankAccount::firstName = firstName;
	BankAccount::lastName = lastName;
	BankAccount::accountNumber = accountNumber;
	BankAccount::accountPIN = accountPIN;
	BankAccount::isAdmin = isAdmin;
	BankAccount::savingsAccount = savingsAccount;
	BankAccount::balance = balance;
}

BankAccount::~BankAccount() {
	delete savingsAccount;
}




//getters
std::string BankAccount::getFirstName() {
	return BankAccount::firstName;
}

std::string BankAccount::getLastName() {
	return BankAccount::lastName;
}

std::string BankAccount::getAccountNumber() {
	return BankAccount::accountNumber;
}

int BankAccount::getAccountPIN() {
	return BankAccount::accountPIN;
}

bool BankAccount::getIsAdmin() {
	return BankAccount::isAdmin;
}

SavingsAccount BankAccount::getSavingsAccount() {
	return *BankAccount::savingsAccount;
}

double BankAccount::getBalance() {
	return BankAccount::balance;	
}



//setters
void BankAccount::setFirstName(std::string firstName) {

	BankAccount::firstName = firstName;

}

void BankAccount::setLastName(std::string lastName) {

	BankAccount::lastName = lastName;

}

void BankAccount::setAccountNumber(std::string accountNumber) {

	BankAccount::accountNumber = accountNumber;

}

void BankAccount::setAccountPIN(int accountPIN) {

	BankAccount::accountPIN = accountPIN;

}

void BankAccount::setIsAdmin(bool isAdmin) {

	BankAccount::isAdmin = isAdmin;

}

void BankAccount::setSavingsAccount(SavingsAccount* savingsAccount) {

	BankAccount::savingsAccount = savingsAccount;

}

void BankAccount::setBalance(double balance) {

	BankAccount::balance = balance;

}


void BankAccount::deposit(double balance) {
	BankAccount::balance = BankAccount::balance + balance;
}


void BankAccount::withdraw(double balance) {

	if(BankAccount::balance < balance) {

		std::cerr << "Insufficient funds!" << std::endl << std::endl;

	} else {

		BankAccount::balance = BankAccount::balance - balance;

	}

}