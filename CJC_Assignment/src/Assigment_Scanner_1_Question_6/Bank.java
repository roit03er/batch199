package Assigment_Scanner_1_Question_6;

import java.util.Scanner;

public class Bank {
	
	public void user() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bank Details: ");
		String UName= sc.nextLine();
		String accNo= sc.nextLine();
		String IFSCCode= sc.nextLine();
		String bankBranch= sc.nextLine();
		
		System.out.println("User Name: "+UName);
		System.out.println("Account No: "+accNo);
		System.out.println("IFSC Code: "+IFSCCode);
		System.out.println("Bank Branch: "+bankBranch);
		
		
	}
	public static void main(String[] args) {
		Bank bk = new Bank();
		bk.user();
	}
}
