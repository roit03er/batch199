package Constructor;

public class A {

		public A (int i) {
			System.out.println(i);
		}

	private A() {
//		super();
		System.out.println("Constructor----A");
	}

	public static void main(String[] args) {
		System.out.println("Main--Method");
		A a = new A();
		A a1 = new A(1);
		B b = new B();
		B b2 = new B(3, 2, 6);
		B b1 = new B(4, 3);

	}
}