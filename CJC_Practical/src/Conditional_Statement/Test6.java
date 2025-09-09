package Conditional_Statement;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt(); 
		
		if (n %2==0) {
			System.out.println(n+" Even No");
		}
		else {
			System.out.println(n+" Odd No");
		}
	}
}
