package While;

import java.util.Scanner;

public class print_Name_using_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the No: ");
		int  n  = sc.nextInt();
		System.out.println("Enter the Limit: ");
		int  limit = sc.nextInt();
		
		while (n<=limit) {
			System.out.println("Rohit Patil");
			n++;
		}
	}
}
