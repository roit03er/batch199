package Logical_Practical;

public class ArmStrong_No {
				public static void main(String[] args) {
					int num =151;
					int originalNo=num;
					double sum =0;
					String str = Integer.toString(num);
					
					
					int length = str.length();
					
					while (num>0) {
							int temp =num%10;
							sum = sum+Math.pow(temp, length);
							num=num/10;
					}
					if (sum == originalNo) {
						System.out.println("ArmStrong No ");
					}
					else {
						System.out.println("Not ArmStrong");
					}
					
				}
}
