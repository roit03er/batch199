package Conditional_Statement.Switch;

public class Calculator {
	
	public void addition() {
		System.out.println(10+20);
	}
	public void subraction() {
		System.out.println(20-10);
	}
	public void multiplication() {
		System.out.println(20*10);
	}
	public void division() {
		System.out.println(200/10);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int ch = 2;
		
		switch (ch) {
		case 1: 
			cal.addition();
			System.out.println("Addition Method calling");
			break;
			
		case 2: 
			cal.subraction();
			System.out.println("Subraction method calling");
			break;
		
		case 3: 
			cal.multiplication();
			System.out.println("Multiplication method calling");
			break;
			
		case 4: 
			cal.division();
			System.out.println("Division Method calling");
			break;
		
		default:
			System.out.println("Invalid Inputs");
		}
		
		
	}
	
}	

