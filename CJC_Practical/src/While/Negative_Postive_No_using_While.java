package While;

import java.util.Scanner;

public class Negative_Postive_No_using_While {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i =1;
			if (n>=0) {
				while (i <=10) {
					System.out.println(n*i);
					i++;
				}
			}else if (n <=0) {
				while (i <=10) {
					System.out.println(n*i);
					i++;
				}
			}
		}
}
