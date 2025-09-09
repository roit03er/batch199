package TASK;

public class A {

	public void m1() {
		System.out.println("M1 Method---A");
		B b = new B();
		b.m2();
	}

	public static void main(String[] args) {
		A a = new A();     
		a.m1();            
		C c = new C();
		c.m3();
	}
	
}
