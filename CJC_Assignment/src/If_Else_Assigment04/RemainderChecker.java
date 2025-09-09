package If_Else_Assigment04;

public class RemainderChecker {
		public void checkRemainder(int dividend , int divisor) {
			
			int remainder = dividend %divisor;
			if (dividend % divisor ==0) {
				System.out.println("No Remainder");
			}else {
				System.out.println("Remainder is Value: "+remainder);
			}
		}
}
