package Assigment_Scanner_1;

import java.util.Scanner;

public class Rectangle {
	public void area() {
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		double width = sc.nextDouble();

		double rectangle = length * width;
		System.out.println("Area of Rectangle: " + rectangle);
	}

	public static void main(String[] args) {
		Rectangle rt = new Rectangle();
		rt.area();
	}
}
