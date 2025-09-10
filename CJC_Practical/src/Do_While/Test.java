package Do_While;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		do {
			Scanner sc = new Scanner(System.in);
			Calculator cal = new Calculator();
			System.out.println("Enter 1 to Addition\nEnter 2 to subtraction\nEnter 3 to Multiplication\nEnter 4 to Division\nEnter the 0 to Exist");
			int ch = sc.nextInt();

				if (ch==0) {
					break;
				}
			System.out.println("Enter the First Num");
			int num1 = sc.nextInt();
			System.out.println("Enter the Second Num");
			int num2 = sc.nextInt();

			if (ch == 1) {
				cal.addition(num1, num2);
			} else if (ch == 2) {
				cal.subtraction(num1, num2);
			} else if (ch == 3) {
				cal.multiplication(num1, num2);
			} else if (ch == 4) {
				cal.division(num1, num2);
			} else if (ch == 0) {

			}
		} while (true);

	}
}
