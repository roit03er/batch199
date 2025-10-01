package com.else_if;
import java.util.Scanner;
public class Age {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int age = sc.nextInt();
			
			if (age >=1 && age <=13) {
				System.out.println("Kids");
			}else if (age>13 && age <=20){
				System.out.println("Teenager");
			}else if (age>20 && age<=40) {
				System.out.println("Young");
			}else if (age >40 && age <=100) {
				System.out.println("Senior Citizen");
			}else {
				System.out.println("Seat Only Home (God Gifted)");
			}
		}
}
