
public class B {
		public void m1(int a , float b) {
			System.out.println("Addition: "+(a+b));
			System.out.println("Subraction: "+(a-b));
			System.out.println("Multiplication: "+a*b);
			System.out.println("Remainder: "+a%b);
			System.out.println("Divisor: "+a/b);
		}
		
		public void m2 (float a , double b ) {
			
			System.out.println("a less than B: "+(a<b));
			System.out.println("a less than or equal to B: "+(a<=b));
			System.out.println("A Greater than B "+(a>b));
			System.out.println("A Greater than or equal to B: "+(a>=b));
			System.out.println("A is equal to B : "+(a==b));
			System.out.println("A is not equal to B "+(a!=b));
		}
		
		public void m3 (boolean  a1 , boolean b1  ) {
			System.out.println(a1&&b1);
			System.out.println(a1||b1);
			System.out.println(!b1);
		}
		
		public static void main(String[] args) {
			B b = new B();
			b.m1(30, 30.0f);
			b.m2(300.0f, 4560.0);
			b.m3(true , false);
		}
}
