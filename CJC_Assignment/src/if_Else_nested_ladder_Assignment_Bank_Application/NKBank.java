package if_Else_nested_ladder_Assignment_Bank_Application;

import java.util.Scanner;

public class NKBank {
	Scanner sc = new Scanner(System.in);

	double balance = 2000;

	public void menu() {
		System.out.println("Welcome to NK Bank");

		System.out.println("1.Deposit");
		System.out.println("2.WithDraw");
		System.out.println("3.Transfer");
		System.out.println("4.View Balance");
		System.out.println("Choose Option (1-4)");

		int choice = sc.nextInt();

		if (choice == 1) {
				deposit();
		}else if (choice ==2) {
				withdraw();
		}else if (choice ==3) {
			trasnsfer();
		}else if (choice ==4) {
			viewBalance();
		}else {
			System.out.println("Invalid choice");
		}
	}

	public void deposit() {
		System.out.println("Enter amount to Deposit: ");

		double amt = sc.nextDouble();

		if (amt > 0) {
			balance += amt;
			System.out.println("Deposited " + amt);
		} else {
			System.out.println("Amount must be greater than 0");
		}
	}

	public void withdraw() {

		System.out.println("Enter the Withdraw Amount: ");
		double amt = sc.nextDouble();

		if (amt <= 0) {
			System.out.println("Amount must be greater than 0");
		} else if (amt > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amt;
			System.out.println("Withdrawn " + amt);
		}
	}

	public void trasnsfer() {
		System.out.println("Enter the Amount Number : ");
		String acc = sc.next();
		System.out.println("Enter the Amount to Transfer: ");
		Double amt = sc.nextDouble();

		if (amt < 0) {
			System.out.println("Amount must be Greater than 0");
		} else if (amt > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amt;
			System.out.println("Transferred " + amt + "to account" + acc);
		}

	}

	public void viewBalance() {
		System.out.println("Your Balance: " + balance);
	}

	public static void main(String[] args) {
		NKBank nk = new NKBank();
		nk.menu();
	}

}
