package Assigment_Scanner_1_Question_11;

import java.util.Scanner;

public class Division {
	Scanner sc = new Scanner(System.in);
	
	public void add() {
		long a = sc.nextLong();
		long b = sc.nextLong();
		System.out.println(a+b);
	}
	public void sub() {
		long c = sc.nextLong();
		long d= sc.nextLong();
		
		System.out.println(c-d);
	}
	public void mul() {
		long n = sc.nextLong();
		long m= sc.nextLong();
		System.out.println(n*m);
	}
	public void div() {
		long x= sc.nextLong();
		long y= sc.nextLong();
		System.out.println(x/y);
	}
}
