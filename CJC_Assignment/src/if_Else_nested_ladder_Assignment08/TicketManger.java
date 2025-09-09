package if_Else_nested_ladder_Assignment08;

import java.util.Scanner;

public class TicketManger {
	Scanner sc = new Scanner(System.in);
		public void bookTicket() {
			int input = sc.nextInt();
			if (input ==1) {
				System.out.println("Booking Confirmed : Pune to Mumbai");
			}else if (input ==2) {
				System.out.println("Booking Confirmed: Delhi to Jaipur");
			}else if (input ==3){
				System.out.println("Booking Confirmed: Bangalore to Chennai");
			}else {
				System.out.println("Invalid route Number , please enter 1,2 or 3");
			}
		}
}
