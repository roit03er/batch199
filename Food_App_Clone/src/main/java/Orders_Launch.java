import java.util.Scanner;

import com.Food_App.DAO.OrdersDAO;
import com.foodApp.DAOimpl.OrderDAOImpl;
import com.foodApp.Model.Orders;

public class Orders_Launch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		//GET Order By Id
//		System.out.println("Enter the Id:- ");
//		int id=scanner.nextInt();
//		
//		OrderDAOImpl  ordeIMp= new OrderDAOImpl();
//		
//		Orders or = ordeIMp.getOrderById(id);
//		
//		System.out.println(or);
//		
		
		
		
		
		
		
	
		
		
		
		//GetALL restaurant:
		
//		OrderDAOImpl orDAO = new OrderDAOImpl();
//		List<Orders> orderList = orDAO.getAllOrders();
//		
//		for (Orders  o : orderList) {
//			System.out.println("OrderID: "+o.getOrderId());
//			System.out.println("RestaurantId: "+o.getRestaurantId());
//			System.out.println("UserId: "+o.getUserId());
//			System.out.println("OrderDate: "+o.getOrderDate());
//			System.out.println("totalAmount: "+o.getTotalAmount());
//			System.out.println("Status: "+o.getStatus());
//			System.out.println("PaymentMode: "+o.getPaymentMode());
//			
//			System.out.println("----------------------------------------");
//		}
		
		
		
		
//		Inserting Order
		
	System.out.print("Enter Restaurant ID: ");
        int restaurantId = scanner.nextInt();

        System.out.print("Enter Your User ID: ");
        int userId = scanner.nextInt();

        System.out.print("Enter Total Amount: ");
        int totalAmount = scanner.nextInt();

        scanner.nextLine(); 
        System.out.print("Enter Status (e.g., Pending): ");
        String status = scanner.nextLine();

        System.out.print("Enter Payment Mode (Online/Cash): ");
        String paymentMode = scanner.nextLine();

        Orders order = new Orders(0, restaurantId, userId, new java.util.Date(), totalAmount, status, paymentMode);

        OrdersDAO dao = new OrderDAOImpl();
        dao.addOrder(order);

        System.out.println("Order placed successfully.");
        scanner.close();
		
	}

}
		
		
		// DELETE ORDER
		
//		OrderDAOImpl orDAO = new OrderDAOImpl();
//		System.out.println("Enter Order Id to Delete: ");
//		int id= scanner.nextInt();
//		orDAO.deleteOrder(id);
		
		
		
//		Updated-ORDER
		
//		OrderDAOImpl dao = new OrderDAOImpl();
//
//        System.out.print("Enter Order ID to Update: ");
//        int orderId = scanner.nextInt();
//
//        System.out.print("Enter New Restaurant ID: ");
//        int restaurantId = scanner.nextInt();
//
//        System.out.print("Enter New User ID: ");
//        int userId = scanner.nextInt();
//
//        System.out.print("Enter New Total Amount: ");
//        int totalAmount = scanner.nextInt();
//        scanner.nextLine(); // consume newline
//
//        System.out.print("Enter New Status (e.g., Delivered): ");
//        String status = scanner.nextLine();
//
//        System.out.print("Enter New Payment Mode (Cash/Online): ");
//        String paymentMode = scanner.nextLine();
//
//        // Set current date for update
//        java.util.Date currentDate = new java.util.Date();
//
//        // Create updated order object
//        Orders updatedOrder = new Orders(orderId, restaurantId, userId, currentDate, totalAmount, status, paymentMode);
//
//        // Call DAO to update
//        dao.updateOrder(updatedOrder);
//
//        System.out.println("Order updated successfully.");
//		
		
    

