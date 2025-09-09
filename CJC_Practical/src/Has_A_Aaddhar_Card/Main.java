package Has_A_Aaddhar_Card;

public class Main {
	
	public static void main(String[] args) {
		Person p = new Person();
		p.Pid=1;
		p.PName="Rohit Patil";
		
		
		
		p.ACard= new AadharCard();
		p.ACard.aadharName="rrrr";
		p.ACard.aadharNo=55655655;
		
		
		
//		AadharCard ad = new AadharCard();
//		ad.aadharNo=998921567;
//		ad.aadharName="Rohit patil";

//		p.ACard=ad;
		
		System.out.println(p.Pid);
		System.out.println(p.PName);
		System.out.println("UID Name"+p.ACard.aadharName);
		System.out.println(p.ACard.aadharNo);
		
	}

}
