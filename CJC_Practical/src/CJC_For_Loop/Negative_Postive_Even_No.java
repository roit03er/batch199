package CJC_For_Loop;

import java.util.Scanner;

public class Negative_Postive_Even_No {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n >= 0)
		{
			for (int i = 2; i <= 10; i++) 
			{
				System.out.println(n * i);
			}
		} else if (n <= 0)
		{
			for (int i = 1; i <= 10; i++) 
			{

				System.out.println(n * i);
			}
		} 
		else
		{
			System.out.println("Rest of Code");
		}
	}
}
