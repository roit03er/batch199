package if_Else_nested_ladder_Assignment07;

import java.util.Scanner;

public class ChannelPicker {
	Scanner sc = new Scanner(System.in);
		public void seletedChannel()   
		{
			int input= sc.nextInt();
			if (input ==1) {
				System.out.println("You Selected TV9 Marathi News");
			}else if (input ==2) {
				System.out.println("You Selected ABP News");
			}else {
				System.out.println("You Selected Aaj Tak");
			}
		}
}


