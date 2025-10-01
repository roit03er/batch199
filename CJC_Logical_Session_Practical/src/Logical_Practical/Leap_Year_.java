package Logical_Practical;

public class Leap_Year_ {
	public static void main(String[] args) {
		int year = 2001;

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
							System.out.println("Leap Year");
				}else {
					System.out.println("Not a Leap year ");
				}
			}else {
				System.out.println(" leap Years");
			}
		}else {
			System.out.println("Not a Leap Year");
		}
	}
}
