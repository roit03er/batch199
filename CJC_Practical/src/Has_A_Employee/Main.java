package Has_A_Employee;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id=1;
		emp.name="Rohit Patil";
		emp.department="IT";
		
		emp.paddress= new Address();
		emp.paddress.cityName="Jalgaon";
		emp.paddress.areaName="Amalner";
		
		System.out.println("Employee Id: "+emp.id);
		System.out.println("Employee Name: "+emp.name);
		System.out.println("Employee Department: "+emp.department);
		System.out.println("Employee City Name: "+emp.paddress.cityName);
		System.out.println("Employee Area Name: "+emp.paddress.areaName);
	}
}
