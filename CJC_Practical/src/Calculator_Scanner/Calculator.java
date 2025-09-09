package Calculator_Scanner;

import java.util.Scanner;

public class Calculator {
	
	Scanner sc = new Scanner(System.in);
	public void addition() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition: "+(a + b));
	}

	public void substraction() {
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("Substraction: "+(c - d));
	}

	public void mul() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Multiplication is : "+(x * y));
	}

	public void division() {
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Division is: "+(m / n));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("Enter the Choice No Upto 4: ");
		int ch = sc.nextInt();
		
		if (ch==1) {
			cal.addition();
		}else if (ch==2) {
			cal.substraction();
		}else if (ch==3) {
			cal.mul();
		}else if (ch==4) {
			cal.division();
		}else {
			System.out.println("Invalid Input");
		}
		

}
}
