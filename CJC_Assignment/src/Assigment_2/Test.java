package Assigment_2;

public class Test {	
	public static void main(String[] args) {
		
		Hotel ht = new Hotel();
		ht.name="Taj Hotel";
		ht.location="Mumbai";
		ht.rating=9;
		
		ht.rc= new Reception();
		ht.rc.shiftTime="7 to 2";
		ht.rc.recepName="Jacks Alex";
		
		
		ht.rc.gs= new Guest();
		ht.rc.gs.GName="Pratik";
		ht.rc.gs.age=26;
		ht.rc.gs.ContactNo=847852454;
		
		ht.rc.gs.rm= new Room();
		ht.rc.gs.rm.roomType="Deluxe Ac premium";
		ht.rc.gs.rm.roomNumber=203;
		ht.rc.gs.rm.pricePerNight=10000;
		
		
		System.out.println("Hotel Name: "+ht.name);
		System.out.println("Hotel Location : "+ht.location);
		System.out.println("Hotel Rating: "+ht.rating);
		
		System.out.println("Hotel ShiftTime :"+ht.rc.shiftTime);
		System.out.println("Hotel Receptionist: "+ht.rc.recepName);
		
		System.out.println("Guest Name: "+ht.rc.gs.GName);
		System.out.println("Guest Age: "+ht.rc.gs.age);
		System.out.println("Guest Contact No: "+ht.rc.gs.ContactNo);
		
		System.out.println("Room Type: "+ht.rc.gs.rm.roomType);
		System.out.println("Room No: "+ht.rc.gs.rm.roomNumber);
		System.out.println("Room Price Per Night: "+ht.rc.gs.rm.pricePerNight);
		

	
	}

}
