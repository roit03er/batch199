package Assignment_Constructor_Assi_03;

public class CJC {
	String instituteName;
	String instituteAddress;
	
	public CJC() {
		instituteName="Welcome to CJC";
		instituteAddress="KarveNagar";
	}
	public void printInstituteName() {
		System.out.println("Institute Name: "+instituteName);
	}
	public void printInstituteAddress() {
		System.out.println("Institute Address: "+instituteAddress);
	}
	public static void main(String[] args) {
		CJC c1 = new CJC();
		c1.printInstituteName();
		c1.printInstituteAddress();
	}
}
