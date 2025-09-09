package Assignment_Constructor_Assi_02;

public class CJC {
		String institeName;
		
		public CJC () {
			institeName="Welcome to CJC";
		}
		
		public void cjcInfo() {
			System.out.println("Institute Name: "+institeName);
		}
		public static void main(String[] args) {
			CJC c1 = new CJC();
		}
}
