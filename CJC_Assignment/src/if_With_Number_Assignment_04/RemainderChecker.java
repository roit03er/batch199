package if_With_Number_Assignment_04;

public class RemainderChecker {
		public void checkRemainder (int a ,int b ) {
				int remainder = a%b;
				if (a %b==0) {
					System.out.println("No Remainder: "+remainder);
				}else {
					System.out.println("Remainder: "+remainder);
				}
		}
}	
