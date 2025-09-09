package Assigment_3;

public class Test {
		public static void main(String[] args) {
			Booking bk = new Booking();
			bk.bookingId=1;
			bk.bookingDate="23-04-2025";
			bk.timeSlot="7 PM to 9 PM";
			
			bk.cs= new Customer();
			
			bk.cs.cusName="Akansha";
			bk.cs.PhoneNo="845124587";
			bk.cs.CusCity="Nagpur";
			
			
			bk.cs.sr= new Service();
			bk.cs.sr.ServiceType="Rental Service";
			bk.cs.sr.price=1000;
			bk.cs.sr.duration="2 Hours";
			
			bk.cs.sr.cr = new Car();
			bk.cs.sr.cr.ModelName="Creata";
			bk.cs.sr.cr.registrationNumber="MH-12 AB 2432";
			bk.cs.sr.cr.color="White";
			
			
			System.out.println("Booking Id: "+bk.bookingId);
			System.out.println("Booking Date: "+bk.bookingDate);
			System.out.println("Time Slot: "+bk.timeSlot);
			
			
			System.out.println("Customer Name: "+bk.cs.cusName);
			System.out.println("Customer PhoneNumber: "+bk.cs.PhoneNo);
			System.out.println("Customer CityName: "+bk.cs.CusCity);
			
			System.out.println("Service Type: "+bk.cs.sr.ServiceType);
			System.out.println("Price: "+bk.cs.sr.price);
			System.out.println("Duration: "+bk.cs.sr.duration);
			
			System.out.println("Model of Car: "+bk.cs.sr.cr.ModelName);
			System.out.println("Registration Number: "+bk.cs.sr.cr.registrationNumber);
			System.out.println("Color :"+bk.cs.sr.cr.color);
		}
}
