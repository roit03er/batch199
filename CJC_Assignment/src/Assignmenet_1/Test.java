package Assignmenet_1;

public class Test {	
	public static void main(String[] args) {
		Order or = new Order();
		or.orderId=1;
		or.orderDate="22-02-2025";
		or.paymentMethod="Online";
		
		or.cm= new Customer();
		
		or.cm.CustName="Rohit patil";
		or.cm.CustEmail="rohitpatil0062@gmail.com";
		or.cm.CustAddress="Karve Nagar Pune";
		
		or.cm.ct= new Cart();
	
		or.cm.ct.quantity=2;
		or.cm.ct.totalAmount=35210;
		
		or.cm.ct.pr= new Product();
		
		or.cm.ct.pr.PName="Sound System";
		or.cm.ct.pr.price=17234.00;
		or.cm.ct.pr.brand="LG";
		
		
		
		System.out.println("Order Id: "+or.orderId);
		System.out.println("Order Date: "+or.orderDate);
		
		System.out.println("Customer name: "+or.cm.CustName);
		System.out.println("Customer Email: "+or.cm.CustEmail);
		System.out.println("Customer Address: "+or.cm.CustAddress);
		
		System.out.println("Product Quantiy: "+or.cm.ct.quantity);
		System.out.println("Product TotalAmount: "+or.cm.ct.totalAmount);
		
		System.out.println("Product Name: "+or.cm.ct.pr.PName);
		System.out.println("Product Price: "+or.cm.ct.pr.price);
		System.out.println("Product Brand: "+or.cm.ct.pr.brand);
		
		
		
		
	}

}
