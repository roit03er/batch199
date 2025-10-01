package Logical_Practical;

public class Strong_Number {
			public static void main(String[] args) {
				int num =145;
				int sum =0;
				int originalNo = num;
				
				while (num>0) {
					int temp =num %10;
					int fact =1;
					
					for (int i =1; i<=temp;i++) {
						fact =fact*i;
					}
					sum = sum +fact; 
					num =num/10;
				}
				
				if (originalNo==num) {
					System.out.println("Strong Number");
				}else {
					System.out.println("Not Strong Number");
				}
				System.out.println("Code Executed");
			}
}
