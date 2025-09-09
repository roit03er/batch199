package Data_Type.Local_Instance_Variable;

public class A {
	int a = 12;

	public void add() {
		int b = 23;
		System.out.println(a + b);

	}
	public void sub() {
		int c =10;
		System.out.println(a-c);
	}
	
	public void div() {
		int d = 6;
		System.out.println(a/d);
	}
	
	public void mul() {
		int m = 10;
		System.out.println(a*m);
	}

	public static void main(String[] args) {
		A a = new A();
		a.add();
		a.sub();
		a.div();
		a.mul();
	}
}
