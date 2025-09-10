package Percentage_Based_Grade;

import java.util.Scanner;


public class Test {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Student1 stu = new Student1();
			
			System.out.println("Enter the Sub1 Marks");
			stu.sub1=sc.nextInt();
			System.out.println("Enter the Sub2 Marks");
			stu.sub2=sc.nextInt();
			System.out.println("Enter the Sub3 Marks");
			stu.sub3=sc.nextInt();
			System.out.println("Enter the Sub4 Marks");
			stu.sub4=sc.nextInt();
			System.out.println("Enter the Sub5 Marks");
			stu.sub5=sc.nextInt();
			
			int per= (stu.sub1+stu.sub2+stu.sub3+stu.sub4+stu.sub5)/5;
			
			String s=stu.calculator(per);
			String p= stu.performance(s);
			System.out.println();
		
		}
}
