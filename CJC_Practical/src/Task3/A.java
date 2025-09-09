package Task3;

public class A {
	int c;
	float f;
	byte b;

	public void m1() {
		c = 21;
		f = 3.5f;
		b = 3;

	}

	public void display() {
		A a = new A();
		a.m1();

		System.out.println(c);
		System.out.println(f);
		System.out.println(b);
	}

	public static void main(String[] args) {
		A a = new A();
		a.m1();
		a.display();

	}
}
