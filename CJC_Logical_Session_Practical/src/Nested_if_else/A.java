package Nested_if_else;

public class A {
		public static void main(String[] args) {
			int marks=81;
			
			
			if (marks >35) {
				System.out.println("Pass");
			if (marks >=80) {
				System.out.println("A Grade");
			}else {
				System.out.println("B Grade");
			}
			}else {
				if (marks >30 && marks <35) {
					System.out.println("ATKT Pass");
				}else {
					System.out.println("fail");
				}
			}
				
			} 
			
}
