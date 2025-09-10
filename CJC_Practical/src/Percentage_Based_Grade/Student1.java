package Percentage_Based_Grade;

public class Student1 {

	int sub1;
	int sub2;
	int sub3;
	int sub4;
	int sub5;
	
	public String calculator(float percentage) {
		System.out.println(percentage);
		if (percentage>=90 && percentage<=100) {
			return "A+";
		}else if (percentage>=75 && percentage<90) {
			return "A";
		}else if (percentage>=60 && percentage<75) {
			return "B+";
		}else if (percentage>=50 && percentage<60) {
			return "B";
		}else if (percentage>=35 && percentage<50) {
			return "C";
		}else {
			return "Fail";
		}
	}
	
	public String performance(String Grade) {
		
		if (Grade=="A+") {
			return "Very Good";
		}else if (Grade=="A") {
			return "Good";
		}else if (Grade=="B+") {
			return "Average";
		}else if (Grade =="B") {
			return "Medium Average";
		}else if (Grade=="C") {
			return "improve";
		}else 
			return "Need To Improve";
		}
	
	}
