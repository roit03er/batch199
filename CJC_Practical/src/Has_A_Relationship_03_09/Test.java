package Has_A_Relationship_03_09;

public class Test {
		
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.Eid=232;
		emp.EName="Rohit Patil";
		emp.ESalary=98645;
		
		
		
		emp.dp=new Department();
		
		emp.dp.Did=1;
		emp.dp.DName="IT";
		
		emp.cp= new Company();
		emp.cp.cName="Cognizant";
		emp.cp.CAddress="HinjeWadi Phase-III Pune";
		
		System.out.println("Employee Id: "+emp.Eid);
		System.out.println("Employee Name: "+emp.EName);
		System.out.println("Employee Salary: "+emp.ESalary);
		System.out.println("Employee Department Id: "+emp.dp.Did);
		System.out.println("Department Name: "+emp.dp.DName);
		System.out.println("Company Name: "+emp.cp.cName);
		System.out.println("Company Address: "+emp.cp.CAddress);
	}
}
