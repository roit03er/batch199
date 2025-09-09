package Assigment_Scanner_1_Question_10;

import java.util.Scanner;

public class Company {
		Scanner sc = new Scanner(System.in);
	public void manager() {
			String mName= sc.nextLine();
			float mSalary= sc.nextFloat();
			String MDepartment= sc.next();
			int mAge = sc.nextInt();
			
			System.out.println("Enter the Manager Name: "+mName);
			System.out.println("Enter the Salary: "+mSalary);
			System.out.println("Enter the Age: "+mAge);
			System.out.println("Enter the Manager Department: "+MDepartment);
			
	}
	
	public void employee() {
		
			String eName= sc.nextLine();
			int eSalary= sc.nextInt();
			float Eexperience= sc.nextFloat();
			String eDepartment= sc.next();
			
			System.out.println("Enter the Employee Name: "+eName);
			System.out.println("Enter the Salary Employee: "+eSalary);
			System.out.println("Enter the Experience of Employee: "+Eexperience);
			System.out.println("Enter the Employee Department: "+eDepartment);
	}
	public static void main(String[] args) {
		Company cp= new Company();
		cp.manager();
		Company cp1= new Company();
		cp1.employee();
	}
}
