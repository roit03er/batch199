package If_Else_Assigment08;

public class AgeChecker {
	public void checkEligibility (int age) {
		if (age >=18) {
			System.out.println("Eligible for Vote: "+age);
		}else {
			System.out.println("Not Eligible for Vote:"+age);
		}
	}
}
