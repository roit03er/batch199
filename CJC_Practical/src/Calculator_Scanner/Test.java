package Calculator_Scanner;

import java.util.Scanner;

public class Test {
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
