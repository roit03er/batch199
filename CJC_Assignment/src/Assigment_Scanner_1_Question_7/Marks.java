package Assigment_Scanner_1_Question_7;

import java.util.Scanner;

public class Marks {
		
	public void marks1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Marks of Subject 1");
		int a =sc.nextInt();
		System.out.println("Enter the Marks of Sub 2");
		int b =sc.nextInt();
		System.out.println("Enter the Marks of Sub 3");
		int c = sc.nextInt();
		
		int d = a+b+c;
		
		System.out.println("Average Marks: "+d/3);
	}
	public static void main(String[] args) {
		Marks m= new Marks();
		m.marks1();
	}
}
