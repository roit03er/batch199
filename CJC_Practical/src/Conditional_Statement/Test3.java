package Conditional_Statement;

import java.util.Scanner;

// Statement : - Wap to check that age of the person is eligible for voting or not ?4



public class Test3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age >=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not eligible for voting");
		
	}
	}
}
