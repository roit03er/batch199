package Has_A_Example;

public class Main {
		public static void main(String[] args) {
			
			
			Teacher tc = new Teacher();
			tc.Tid=1;
			tc.name="Prof. Pandit Sir";
			tc.College="Ssvps College Of Engineering Dhule";
			
//			Department dpt =  new Department();
//			dpt.DepartName="Electronics & Tel-Communication";
//			dpt.DepartName="Digital Electronics";
//			
//			tc.depart=dpt;
			
			tc.depart= new Department();
			tc.depart.DepartName="Electronics Tel-Communication";
			tc.depart.SubName="DC";
			
			
			System.err.println("Teacher Id: "+tc.Tid);
			System.out.println("Teacher Name: "+tc.name);
			System.out.println("College Name: "+tc.College);
			System.out.println("Department Name Of Teacher: "+tc.depart.DepartName);
			System.out.println("Subject Name of Teacher: "+tc.depart.SubName);
			
		}
}
