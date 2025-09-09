package Conditional_Statement;

public class Divisible_3_And_5 {
	
	public static void main(String[] args) {
		int num =22;
		
		if (num %3 ==0 || num % 5 ==0) {
			System.out.println( num+" is Divisible by 3 or 5");
		}
		else {
			System.out.println(" Not Divisible by 3 or 5");
		}
		
	}
}
