package Calculator_Scanner;

import java.util.Scanner;

public class test2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the No in Int: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the No in byte: ");
		byte b = sc.nextByte();
		
		System.out.println("Enter the Name in String: ");
		String s = sc.next();
		
		System.out.println("Enter the Character in Char");
		char ch = sc.next().charAt(0);
		
		System.out.println("Enter the No in Long: ");
		long l= sc.nextLong();
		
		System.out.println("Enter the No in Short: ");
		short sh = sc.nextShort();
		
		System.out.println("Enter the True/False in Boolean: ");
		boolean b1 = sc.nextBoolean();
		
		System.out.println("Enter the No in Float: ");
		float ft = sc.nextFloat();
		
		
	}

}
