package if_Else_nested_ladder_Assignment05;

import java.util.Scanner;

public class DeliveryStatusChecker {
	Scanner sc = new Scanner(System.in);
	public void trackParcel() {
		int input = sc.nextInt();
		if (input ==101) {
			System.out.println("Your Parcel is in transit");
		}else if (input==202) {
			System.out.println("Your Parcel has been delivered");
		}else if (input ==303) {
			System.out.println("Your parcel is delayed");
		}
	}

}
