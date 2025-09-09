package Conditional_Statement;



// Statement : - wap for calculator class which having 2 methods add and sub if the first number 
//is smaller than second number then call add method for addition those 2 numbers otherwise call sub method for subtract
public class Calculator {
	
	int a =10;
	int b =15;
	
	public void add ( ) {
		System.out.println(a+b);
	}
	
	public void sub ( ) {
		System.out.println(a-b);
	}
	
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		if (cal.a <= cal.b) {
			cal.add();
		}else {
			cal.sub();
		}
	}
}
