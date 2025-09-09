package Conditional_Statement.Switch;

public class Age_With_Switch {
	public static void main(String[] args) {
		
		int age =55;
		
		switch(age >= 18 ? 1:0){
		case 0 : 
			System.out.println(age + " Age is Not Eligible for Voting");
			break;
			
		case 1 : 
			System.out.println(age + "  Age Eligible for Voting");
			break;
			
		
		default: 
			System.out.println("Invalid Input");
		}
		
	}
}
