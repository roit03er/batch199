package CJC_While;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Any No: ");
		int n = sc.nextInt();
		System.out.println("Enter the Limit of No: ");
		int itr = sc.nextInt();
		int i =1;
		while (i <=itr) {
			System.out.println(i*n);
			i++;
		}
	}
}
