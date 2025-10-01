package ArithMatic_Operation_method;

public class A {
		public void m1(int a , int b) {
			System.out.println("Addition: "+(a+b));
			System.out.println("Subraction: "+(a-b));
			System.out.println("Multiplication: "+a*b);
			System.out.println("Remainder: "+a%b);
			System.out.println("Divisor: "+a/b);
		}
		
		public void m2 (int a , int b) {
			
			System.out.println("a less than B: "+(a<b));
			System.out.println("a less than or equal to B: "+(a<=b));
			System.out.println("A Greater than B "+(a>b));
			System.out.println("A Greater than or equal to B: "+(a>=b));
			System.out.println("A is equal to B : "+(a==b));
			System.out.println("A is not equal to B "+(a!=b));
		}
		
		public void m3 (Boolean  a1 , boolean  b1 ) {

			System.out.println(a1&&b1);
			System.out.println(a1||b1);
			System.out.println(!b1);
		}
		public static void main(String[] args) {
			A a = new A();
			a.m1(20, 10);
			System.out.println();
			System.out.println("*************************");
			a.m2(20, 10);
			System.out.println();
			System.out.println("*************************");
			a.m3(true, false);
		}
}
