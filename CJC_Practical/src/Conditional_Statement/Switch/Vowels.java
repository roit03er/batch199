package Conditional_Statement.Switch;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a= sc.next().charAt(0);
		
		switch (a == 'a' || a== 'e' || a=='i' || a=='o'|| a=='u' || 
				a =='A' || a=='E' || a =='I' || a =='O' ||a =='U' ? 1:0) {
		case 1: 
			System.out.println(a + " is Vowel");
		break;
		case 0:
			System.out.println(a+ " is Consonants");
			break;
		default:
			System.out.println("Invalid Inputs");
		}
	}
}
