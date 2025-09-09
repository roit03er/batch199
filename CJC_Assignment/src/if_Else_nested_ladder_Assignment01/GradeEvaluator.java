package if_Else_nested_ladder_Assignment01;

import java.util.Scanner;

public class GradeEvaluator {
	Scanner sc = new Scanner(System.in);
	public void evaluateGrade() {
		int input= sc.nextInt();
		
		if(input>0 && input <40) {
			System.out.println("C");
		
		}else if (input >40 && input<80) {
			System.out.println("B");
		}else if (input >80 && input<=100) {
			System.out.println("A");
		}
	}
}
