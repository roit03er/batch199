package if_Else_nested_ladder_Assignment04;

import java.util.Scanner;

public class RechargeAssistant {
	Scanner sc = new Scanner(System.in);
		public void showPlanDetails() {
			int no = sc.nextInt();
			
			if (no ==1) {
				System.out.println("You Selected $300 plan for 56 days");
			}else if (no ==2) {
				System.out.println("You Selected $199 plan for 28 days");
			}else if (no ==3) {
				System.out.println("You Selected $599 plan for 84 days");
			}else {
				System.out.println("Error");
			}
		}
}
