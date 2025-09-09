import java.util.List;
import java.util.Scanner;

import com.foodApp.DAOimpl.Order_ItemDAO_Imple;
import com.foodApp.Model.Order_Item;

public class OrderItem_Launch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// INSERTING - ORDERITEM
		
//		System.out.println("Enter the Order Id: ");
//		int orderId = scan.nextInt();
//		
//		System.out.println("Enter the Menu Id: ");
//		int menuId=scan.nextInt();
//		
//		System.out.println("Enter the quantity: ");
//		int quantity= scan.nextInt();
//		
//		System.out.println("Enter the TotalAmount: ");
//		int totalAmount = scan.nextInt();
//		
//		Order_Item ot = new Order_Item(0,orderId, menuId , quantity , totalAmount);
//		
//		OrderItemDAO dao  = new Order_ItemDAO_Imple();
//		dao.addOrderItem(ot);
//		
//		System.out.println("Order Item Inserted Successfully.");
		
		
		
		// GET-ORDER-ITEM-BY-ORDER ID

		
		
//		
//		Order_ItemDAO_Imple dao = new Order_ItemDAO_Imple();
//
//		System.out.println("Enter the Order Id to view Order Details with Items:");
//		int orderIdForDetails = scan.nextInt();
//
//		List<Order_Item> items = dao.getOrderItemsByOrderId(orderIdForDetails);
//
//		for (Order_Item item : items) {
//		    System.out.println("Item ID: " + item.getOrderItemId());
//		    System.out.println("Menu ID: " + item.getMenuId());
//		    System.out.println("Quantity: " + item.getQuantity());
//		    System.out.println("Total Amount: " + item.getTotalAmount());
//		    System.out.println("---------------------------");
//		
//		
		
		
		
			//DELETE ORDERITEM//
//		
//		  Order_ItemDAO_Imple dao = new Order_ItemDAO_Imple();
//		  System.out.print("Enter OrderItem ID to delete: ");
//	        int id = scan.nextInt();
//
//		        dao.deleteOrderItem(id);
		
		
		//UPDATE - ORDERITEM
		
		Order_ItemDAO_Imple dao = new Order_ItemDAO_Imple();
		
		        System.out.print("Enter OrderItemID to Update: ");
		        int orderItemId = scan.nextInt();
		
		        System.out.print("Enter Order ID: ");
		        int orderId = scan.nextInt();
		
		        System.out.print("Enter MenuID: ");
		        int menuId = scan.nextInt();
		
		        System.out.print("Enter the Quantity: ");
		        int Quantity = scan.nextInt();
		        
		        System.out.println("Enter the TotalAmount: ");
		        int totalAmount= scan.nextInt();
		        
		        Order_Item or = new Order_Item(orderItemId,orderId,menuId,Quantity,totalAmount);
		
		        Order_Item orderItem = new Order_Item();
	
		        dao.updateOrderItem(orderItem);
		
		        System.out.println("Order-Item updated successfully.");
				
		
		
		
	}
}

