package Assignment_Constructor_Assi_06;

public class BusBookingApp {
	String appTitle;
	String companyName;
	String supportEmail;
	
	public BusBookingApp() {
		appTitle="QuickBus Booking App";
		companyName="QuickTech Pvt ltd";
		supportEmail="support@quickbus.com";
		
	}
	public void displayAppInfo() {
		System.out.println("App Title: "+appTitle);
		System.out.println("Company Name: "+companyName);
		System.out.println("Support Email: "+supportEmail);
	}
	
	
}
