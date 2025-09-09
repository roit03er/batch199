package Assigment_Scanner_1_Question_9;

import java.util.Scanner;

public class Calculator {
	Scanner sc = new Scanner(System.in);
	public void add() {
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		System.out.println(a+b);
	}
	public void sub() {
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		System.out.println(c-d);
	}
	public void mul () {
		int e= sc.nextInt();
		int f= sc.nextInt();
		
		System.out.println(e*f);
	}
	public void div() {
		int n = sc.nextInt();
		int m= sc.nextInt();
		System.out.println(n/m);
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
	}
}
