package Constructor;

public class B {
	public B() {
		System.out.println("Constructor---B");
	}

	public B(int a, int b) {
		this();
		System.out.println(a + b);
	}

	public B(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	
}
