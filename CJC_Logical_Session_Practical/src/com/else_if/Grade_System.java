	package com.else_if;

import java.util.Scanner;

public class Grade_System {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);	
				
				System.out.println("Enter the Marks: ");
				int n = sc.nextInt();
				
				if (n>90 && n<=100) {
					System.out.println("A Grade");
				}else if (n >80 && n<=90) {
					System.out.println("B Grade");
				}else if (n>70 && n<=80) {
					System.out.println("C Grade");
				}else if (n>60 && n<=70) {
					System.out.println("D Grade");
				}else if (n>=35 && n <=60) {
					System.out.println("Pass");
				}else {
					System.out.println("Fail");
				}
			}
}
