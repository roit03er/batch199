package Assignment_Constructor_Assi_07;

public class MobileRechargeApp {
	
	String appName;
	String developerName;
	String supportEmail;
	
	public MobileRechargeApp() {
		appName="QuickRecharge";
		developerName="Recharge Solutions Ltd";
		supportEmail="hr@quickrecharge.com";
		
	}
	public void showAppDetails() {
		System.out.println("App Name: "+appName);
		System.out.println("Developer Name: "+developerName);
		System.out.println("Support Email: "+supportEmail);
	}
	
}

