package Conditional_Statement.Switch;

import java.util.Scanner;

public class Test2 {
		
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("User Input: ");
				int ch =sc.nextInt();
				
				switch(ch %2) {
				
				case 0 :
					System.out.println(ch+" is Even No");
					break;
					
				default: 
					System.out.println(ch +" is Odd No");
			}
		}
}
