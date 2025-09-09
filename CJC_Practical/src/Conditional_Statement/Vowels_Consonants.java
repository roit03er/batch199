package Conditional_Statement;

public class Vowels_Consonants {
	public static void main(String[] args) {
		char a = 'Z';
		
		if ( a == 'a' || a == 'e' || a =='i' || a =='o' || a =='u' || 
			a =='A' || a == 'E'|| a == 'I' || a == 'O' || a =='U') {
			
			System.out.println(a + " is Vowel");
		}
		else {
			System.out.println(a + " is consonants");
		}
		
	}
}
