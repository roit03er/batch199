package Do_While;

import java.util.Scanner;

public class A {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
					do {
					System.out.println("Menu");
					System.out.println("1. Paneer");
					System.out.println("2. Veg Biryani");
					System.out.println("3. Exist");
					
					System.out.println("Enter the No upto 3");
					int ch = sc.nextInt();
					
					if(ch==3) {
						break;
					}
					
					if (ch==1) {
						System.out.println("Panner");
					}else if (ch==2) {
						System.out.println("Veg Biryani");
					}
				}while (true);
				
				
			}
}
