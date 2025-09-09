package Assigment_Scanner_1;

import java.util.Scanner;

public class Question_2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter the Side");
			int side = sc.nextInt();
			int area = side*side;
			int perimeter = 4*side;
			
			System.out.println("Area of Square: "+area);
			System.out.println("Area of Perimeter: "+perimeter);
		}
}
