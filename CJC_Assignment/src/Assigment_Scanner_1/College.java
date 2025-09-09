package Assigment_Scanner_1;

import java.util.Scanner;

public class College {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Clg Name");
			String clgName= sc.nextLine();
			String cityName= sc.nextLine();
			int pinCode= sc.nextInt();
			String type = sc.next();
			
			System.out.println("College Name= "+clgName);
			System.out.println("City Name= "+cityName);
			System.out.println("Pin Code= "+pinCode);
			System.out.println("Institute Code= "+type);
		}
}
