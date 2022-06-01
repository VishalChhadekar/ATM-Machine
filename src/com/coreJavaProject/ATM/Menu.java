package com.coreJavaProject.ATM;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Menu extends Account {

	public void getLogin() {
		try (Scanner sc = new Scanner(System.in)) {
			// Credentials of Existing  customer
			Map<Integer, Integer> customerCredential = new HashMap<>();
			customerCredential.put(10001, 8989);// key, value
			customerCredential.put(10002, 6557);

			System.out.println("Welcome to the ATM! \nEnter your customerID and PIN");
			int cusomerId = sc.nextInt();
			int pinNumber = sc.nextInt();

			setCustNumber(cusomerId);
			setPinNumber(pinNumber);

			// validation of customer input credentials
			for (Entry<Integer, Integer> entry : customerCredential.entrySet()) {
				if (entry.getKey() == getCustNumber() && entry.getValue() == getPinNumber()) {
					// call a method to get account type
					getAccountType();

				}
			}
		} catch (Exception e) {
			System.out.println("Invalid entry. Please enter Integer only");
		}
	}

	// account type
	public void getAccountType() {
		System.out.println("Select the account type you want to access");
		System.out.println("1. For Checking Account");
		System.out.println("2. For Saving Account");
		System.out.println("3. Exit");
		try (// taking user response
				Scanner sc = new Scanner(System.in)) {
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				// call a method for getCheckingAccount
				getCheckingAccount();
				break;
			case 2:
				// call a method for getSavingAccount
				getSavingAccount();
				break;
			case 3:

				System.out.println("Thank you for using this ATM, Hope to see you agin!");
				break;
			default:
				System.out.println("Invalid entry> Please try again");
				getAccountType();

			}
		} catch (Exception e) {
			System.out.println("Invalid entry. Please enter Integer only");
		}

	}

	// cechingAccount type
	public void getCheckingAccount() {
		System.out.println("Checking account: ");
		System.out.println("1. To view the balance");
		System.out.println("2. To deposite funds");
		System.out.println("3. To withdraw funds");
		System.out.println("4. Exit");
		try (// taking user response
				Scanner sc = new Scanner(System.in)) {
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				// call a method to show account balance
				System.out.println("Your account balance is: " + getCheckingBalance());
				getCheckingAccount();
				
				break;
			case 2:
				// call a method to deposit funds
				System.out.println("Enter the amount you want to deposit");
				int depositAmount = sc.nextInt();
				calculateCheckingDeposit(depositAmount);
				getCheckingAccount();
				
				break;
			case 3:
				// call a method to withdraw funds
				System.out.println("Enter the amount you want to withdraw");
				int withdrawAmount = sc.nextInt();
				calculateCheckingWithdraw(withdrawAmount);
				getCheckingAccount();
				
				break;
			case 4:
				System.out.println("Thank you for using this ATM, Hope to see you agin!");
				break;
			default:
				System.out.println("Invalid entry> Please try again");
				getCheckingAccount();

			}
		} catch (Exception e) {
			System.out.println("Invalid entry. Please enter Integer only");
		}
	}

	// savingAccount type
	public void getSavingAccount() {
		System.out.println("Saving account: ");
		System.out.println("1. To view the balance");
		System.out.println("2. To deposite funds");
		System.out.println("3. To withdraw funds");
		System.out.println("4. Exit");
		try (// taking user response
				Scanner sc = new Scanner(System.in)) {
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				// call a method to show account balance
				System.out.println("Your account balance is: " + getSavingBalance());
				getSavingAccount();
				break;
			case 2:
				// call a method to deposit funds
				System.out.println("Enter the amount you want to deposit");
				int depositAmount = sc.nextInt();
				calculateSavingDeposit(depositAmount);
				getSavingAccount();

				break;
			case 3:
				// call a method to withdraw funds
				System.out.println("Enter the amount you want to withdraw");
				int withdrawAmount = sc.nextInt();
				calculateSavingWithdraw(withdrawAmount);
				getSavingAccount();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, Hope to see you agin!");
				break;
			default:
				System.out.println("Invalid entry> Please try again");

			}
		} catch (Exception e) {
			System.out.println("Invalid entry. Please enter Integer only");
		}
	}

}
