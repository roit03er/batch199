package Assigment_Scanner_1;

import java.util.Scanner;

public class Circle {
		 
	public void area() {
		
		Scanner sc = new Scanner(System.in);
		float pie=3.14f; ;
		float r=sc.nextFloat();
		
		float area= pie*r*r;
		
		System.out.println("Area of Circle: "+area);
		
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
	}
}
