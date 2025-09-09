package Assigment_Scanner_1_Question_8;

import java.util.Scanner;

public class Course {
	public void details() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Course Details: ");
		
		String CourseName= sc.nextLine();
		int CourseId= sc.nextInt();
		String courseSub= sc.next();
		String courseLocation= sc.next();
		
		System.out.println("Course Name: "+CourseName);
		System.out.println("Course Id: "+CourseId);
		System.out.println("Course Sub: "+courseSub);
		System.out.println("Course Location: "+courseLocation);
	}
	public static void main(String[] args) {
		Course cs = new Course();
		cs.details();
	}
}
