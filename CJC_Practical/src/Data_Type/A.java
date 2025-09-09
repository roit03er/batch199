package Data_Type;

public class A {
	byte b=51;
	short s=5552;
	int i=54786;
	float f=70.0f;
	double d=500.2;
	char c='d';
	boolean flag=true;
	long l=65879741;
	String s1="Rohit Patil";
	A a;

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
		A a = new A();
		a.m1();
	}

}
