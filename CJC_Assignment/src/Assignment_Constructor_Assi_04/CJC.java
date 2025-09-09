package Assignment_Constructor_Assi_04;

public class CJC {
	String instituteName;
	String instituteAddress;
	
	public CJC(String InstName, String InstAddress) {
			instituteAddress=InstAddress;
			instituteName=InstName;
			System.out.println("InstiteName: "+InstName);
			System.out.println("InstitudeAddress: "+instituteAddress);
	}
	public static void main(String[] args) {
		CJC c1= new CJC("CJC", "KarveNagar");
		
	}
}
