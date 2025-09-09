package HAS_A_Relationship;

public class Test {
	public static void main(String[] args) {
		
		Student stu = new Student();
		stu.rollNo=1;
		stu.name="Rohit patil";
		
		stu.laddress= new Address();
		stu.laddress.cityName="Pune";
		stu.laddress.areaName="KarveNagar";
		
		stu.paddress= new Address();
		stu.paddress.cityName="Mumbai";
		stu.paddress.areaName="CBD Belapur";
		
//		Address a = new Address();
//		a.cityName="Mumbai";
//		a.areaName="CBD Belapur Navi Mumbai";
		
//		stu.paddress=a;
		
		System.out.println("Roll No: "+stu.rollNo);
		System.out.println("Name of Student: "+stu.name);
		System.out.println("Local Address(City):"+stu.laddress.cityName);
		System.out.println("Local Address(Area Name): "+stu.laddress.areaName);
		System.out.println("Permanant Address(City):"+stu.paddress.cityName);
		System.out.println("Permanant Address(AreaName):"+stu.paddress.areaName);
	}
}
