package com.coreJavaProject.ATM;

public class Account {
	private int custNumber;
	private int pinNumber;
	private int savingBalance;
	private int checkingBalance;

	public int getCustNumber() {
		return custNumber;
	}

	public void setCustNumber(int custNumber) {
		this.custNumber = custNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public int getSavingBalance() {
		return savingBalance;
	}

	public int getCheckingBalance() {
		return checkingBalance;
	}

	// methods for deposit and withdraw funds from Checking account
	// withdraw
	public void calculateCheckingWithdraw(int withdrawAmount) {

		if ((checkingBalance - withdrawAmount) >= 0) {
			checkingBalance = (int) (checkingBalance - withdrawAmount);
			System.out.println("Withdrawal of " + withdrawAmount + " successful ");
			System.out.println("Account balance: " + checkingBalance);

		} else {
			System.out.println("Balence can not be negative!");
		}

	}

	// deposit
	public void calculateCheckingDeposit(int depositAmount) {

		if ((checkingBalance + depositAmount) >= 0) {
			checkingBalance = (int) (checkingBalance + depositAmount);
			System.out.println("Amount deposited successfuly");
			System.out.println("Balance is: " + checkingBalance);
		} else {
			System.out.println("Balence can not be negative!");
		}
	}
	
	// methods for deposit and withdraw funds from Saving account
	// withdraw
	public void calculateSavingWithdraw(int withdrawAmount) {

		if ((checkingBalance - withdrawAmount) >= 0) {
			checkingBalance = (int) (checkingBalance - withdrawAmount);
			System.out.println("Withdrawal of " + withdrawAmount + " successful ");
			System.out.println("Account balance: " + checkingBalance);

		} else {
			System.out.println("Balence can not be negative!");
		}

	}

	// deposit
	public void calculateSavingDeposit(int depositAmount) {

		if ((checkingBalance + depositAmount) >= 0) {
			checkingBalance = (int) (checkingBalance + depositAmount);
			System.out.println("Amount deposited successfuly");
			System.out.println("Balance is: " + checkingBalance);
		} else {
			System.out.println("Balence can not be negative!");
		}
	}

}
