package Assignment_Constructor_Assi_08;

public class Calculator {
		int a ;
		int b;
		
		public Calculator() {
			a=10;
			b=20;
		}
		
		public void add() {
			System.out.println("Addition: "+(a+b));
		}
		
		public void sub() {
			System.out.println("Substraction: "+(a-b));
		}
		
		public void mul() {
			System.out.println("Multiplication: "+(a*b));
		}
		
		public void div() {
			System.out.println("Division: "+(a/b));
		}
}
