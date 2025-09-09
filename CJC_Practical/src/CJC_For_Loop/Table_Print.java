package CJC_For_Loop;

import java.util.Scanner;

public class Table_Print {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			for (int i=m; i<=n; i++) {
				if (i %2==0) {
					System.out.println(i);
				}
			}
		}
}
