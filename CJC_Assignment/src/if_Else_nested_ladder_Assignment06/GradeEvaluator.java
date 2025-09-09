package if_Else_nested_ladder_Assignment06;

import java.util.Scanner;

public class GradeEvaluator {
	Scanner sc = new Scanner(System.in);
		public void evaluateGrade() {
			System.out.println("Enter the Marks: ");
			int marks = sc.nextInt();
			
			if (marks>=90 && marks <=100) {
				System.out.println("Grade A");
			}else if (marks>=75 && marks <=90) {
				System.out.println("Grade B");
			}else if (marks>=50 && marks <=75) {
				System.out.println("Grade C");
			}else {
				System.out.println("Fail");
			}
		}
}
