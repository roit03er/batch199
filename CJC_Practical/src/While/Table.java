package While;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any No to print the Table :");
		int n = sc.nextInt();
		System.out.println("Enter the limit: ");
		int itr = sc.nextInt();

		int i = 1;

		while (i <= itr) {
			System.out.println(n * i);
			i++;
		}
	}
}
