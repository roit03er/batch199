package if_Else_nested_ladder_Assignment02;

import java.util.Scanner;

public class ChannelPicker {
	
		Scanner sc = new Scanner(System.in);
		public void selectChannel() {
			System.out.println("Enter the no to Selected the Channel: ");
		int no = sc.nextInt();
		if (no==1) {
			System.out.println("You Selected TV9 Marathi News");
		}else if(no ==2){
			System.out.println("You Selected ABP News");
		}else if (no ==3) {
			System.out.println("You Selected Aaj Tak");
		}else {
			System.out.println("Error Message");
		}
	}
}
