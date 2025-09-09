package Has_A_Manage_Class;

public class Test {
	
	public static void main(String[] args) {
		
		Child ch = new Child();
		ch.CName="Rohit Patil";
		ch.CAge=21;
		ch.Education="B.Tech";
		ch.height=6.0f;
		ch.SchoolName="SSVPS College Of Engineering";
		
		ch.ft= new Father ();
		ch.ft.FName="Sanjay";
		ch.ft.FAge=50;
		ch.ft.Fheight=5.6f;
		ch.ft.Work="Business Man";
		
		ch.mt= new Mother();
		ch.mt.Mname="Savita";
		ch.mt.MAge=43;
		
		ch.gf = new GrandFather();
		ch.gf.GName="Tukaram";
		ch.gf.Gage=78;
		ch.gf.height=5.3f;
		
		
		System.out.println("Child Name: "+ch.CName);
		System.out.println("Child Age: "+ch.CAge);
		System.out.println("Child Education: "+ch.Education);
		System.out.println("Child Name: "+ch.height);
		System.out.println("Child School Name: "+ch.SchoolName);
		
		System.out.println("Father Name: "+ch.ft.FName);
		System.out.println("Father Age: "+ch.ft.FName);
		System.out.println("Father Work : "+ch.ft.Work);
		System.out.println("Father Height: "+ch.ft.Fheight);
		
		System.out.println("Mother Name: "+ch.mt.Mname);
		System.out.println("Mother Age: "+ch.mt.MAg);		
	}
}
