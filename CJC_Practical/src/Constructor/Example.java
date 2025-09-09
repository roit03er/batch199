package Constructor;

//Class
public class Example {
	public Example () {
		System.out.println("Constructor ----");
	}
	
	public static void main(String[] args) {
		Example ex = new Example();
		Example ex1= new Example();
//		Example ex1 = new Example(2,3);
//		Example ex2= new Example(3,4,5);
//		Example ex3= new Example(1);
	}
}
