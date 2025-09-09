package Data_Type;

public class B {

	static byte b=51;
	static short s=5552;
	static int i=54786;
	static float f=70.0f;
	static double d=500.2;
	static char c='d';
	static boolean flag=true;
	static long l=65879741;
	static String s1="Rohit Patil";
	static A a;

		public void m1() {
			System.out.println(b);
			System.out.println(s);
			System.out.println(i);
			System.out.println(f);
			System.out.println(d);
			System.out.println(c);
			System.out.println(flag);
			System.out.println(l);
			System.out.println(s1);
			System.out.println(a);
		}

		public static void main(String[] args) {
			B b = new B();
			b.m1();
		}

	}

}
