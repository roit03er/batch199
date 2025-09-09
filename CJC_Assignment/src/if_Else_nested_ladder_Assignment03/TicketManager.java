package if_Else_nested_ladder_Assignment03;

import java.util.Scanner;

public class TicketManager {
	Scanner sc = new Scanner(System.in);

	public void bookTicket() {
		System.out.println("Enter the No for book the Ticket");
		int input = sc.nextInt();
		
		if (input ==1) {
			System.out.println("Booking is Confirmed: Pune to Mumbai");
		}else if (input ==2) {
			System.out.println("Booking is Confirmed: Delhi to Jaipur");
		}else if (input ==3) {
			System.out.println("Booking is Confirmed: Bangalore to Chennai");
		}

	}
}
