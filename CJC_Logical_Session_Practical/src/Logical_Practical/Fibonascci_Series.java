package Logical_Practical;

public class Fibonascci_Series {
			public static void main(String[] args) {
				int range =8;
				
				int start=0;
				int second =1;
				
				
				for (int i =1; i<range; i++) {
					System.out.println(start);
					int next =start+second;
						start = second;
						second=next;
						
				}
				System.out.println(start);
				
			}
}
