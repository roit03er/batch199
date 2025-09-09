package com.foodApp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Food_App.DAO.OrderItemDAO;
import com.foodApp.Model.Order_Item;
import com.foodApp.util.DBConnection;

public class Order_ItemDAO_Imple implements OrderItemDAO {

	private String GET_Order_Item_BY_ID="SELECT * from `orderitem` WHERE  `orderItemId`=?";
	private String GET_ALL_ORDER_ITEM= "SELECT * from `orderitem`";
	private String UPDATE_ORDER_ITEM="UPDATE `orderitem` SET `orderId`=? , `menuId`=? , `quantity`=? , `totalAmount`=?";
	private String INSERT="INSERT into `orderitem` (`orderId`, `menuId` , `quantity` , `totalAmount`) values (?,?,?,?)";
	private String DELETE="";
	private String GET_ORDER_ITEM_BY_ORDER_ID = "SELECT * FROM orderitem JOIN orders ON orderitem.orderId = orders.orderId WHERE orderitem.orderId = ?";

	@Override
	public Order_Item getOrderItemById(int orderItemId) {
		Order_Item ot= null;
		
		
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatment	= connection.prepareStatement(GET_Order_Item_BY_ID);)
				
				{
		
					preparedStatment.setInt(1, orderItemId);
			
					ResultSet res = preparedStatment.executeQuery();
		
					while (res.next()) {
						int orderItId = res.getInt("orderItemId");
						int orderId = res.getInt("orderId");
						int menuId = res.getInt("menuId");
						int quantity = res.getInt("quantity");
						float totalAmount = res.getFloat("totalAmount");
						
						ot = new Order_Item(orderItId,orderId,menuId,quantity,totalAmount);
						
					}
		
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
		return ot;
	}

	@Override
	public List<Order_Item> getOrderItemsByOrderId(int orderId) {
		 List<Order_Item> orderItems = new ArrayList<>();

		    try (Connection conn = DBConnection.getConnection();
		         PreparedStatement stmt = conn.prepareStatement(GET_ORDER_ITEM_BY_ORDER_ID)) {

		        stmt.setInt(1, orderId);
		        ResultSet rs = stmt.executeQuery();

		        while (rs.next()) {
		            Order_Item item = new Order_Item();
		            item.setOrderItemId(rs.getInt("orderItemId"));
		            item.setOrderId(rs.getInt("orderId"));
		            item.setMenuId(rs.getInt("menuId"));
		            item.setQuantity(rs.getInt("quantity"));
		            item.setTotalAmount(rs.getFloat("totalAmount"));
		            int UserId = rs.getInt("UserId");
		            String orderDate = rs.getString("orderDate");
		            String status = rs.getString("status");
		            String paymentMode =rs.getString("paymentMode");

		            // You can display or use these values as needed
		            System.out.println("Order ID: " + orderId);
		            System.out.println("User ID: " + UserId);
		            System.out.println("Order Date: " + orderDate);
		            System.out.println("Status: " + status);
		            System.out.println("Payment Mode: "+ paymentMode);
		            System.out.println("-------------------------------");

		            orderItems.add(item);
		        }

		    } catch (SQLException e) {
		        e.printStackTrace();
		    }

		    return orderItems;
	}

	@Override
	public List<Order_Item> getOrderItemsByMenuId(int menuId) {
		List<Order_Item> orderItems = new ArrayList<>();
	    String sql = "SELECT * FROM orderitem WHERE menuId = ?";

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, menuId);
	        ResultSet rs = ps.executeQuery();

	        while (rs.next()) {
	            Order_Item item = new Order_Item();
	            item.setOrderItemId(rs.getInt("orderItemId"));
	            item.setOrderId(rs.getInt("orderId"));
	            item.setMenuId(rs.getInt("menuId"));
	            item.setQuantity(rs.getInt("quantity"));
	            item.setTotalAmount(rs.getFloat("totalAmount"));
	            orderItems.add(item);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

		return null;
	}

	@Override
	public List<Order_Item> getAllOrderItems() {
		
		List<Order_Item> orderItemList = new ArrayList<>();
		
		 try (Connection connection = DBConnection.getConnection();
		         PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_ORDER_ITEM );
		         ResultSet resultSet = preparedStatement.executeQuery()) {

		
			 	while (resultSet.next()) {
			 		int orderItId = resultSet.getInt("orderItemId");
			 		int orderId = resultSet.getInt("orderId");
			 		int menuId = resultSet.getInt("menuId");
			 		int quantity = resultSet.getInt("quantity");
			 		float totalAmount= resultSet.getFloat("totalAmount");
			 		
			 		
			 		Order_Item	ot = new Order_Item(orderItId,orderId,menuId,quantity,totalAmount);
	
			 	}
	

    } catch (SQLException e) {
        e.printStackTrace();
    }
		return orderItemList;
	}

	@Override
	public void updateOrderItem(Order_Item orderItem) {
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement =connection.prepareStatement(UPDATE_ORDER_ITEM);)

				{
			
			
			preparedStatement.setInt(1, orderItem.getOrderId());
			preparedStatement.setInt(2, orderItem.getMenuId());
			preparedStatement.setInt(3, orderItem.getQuantity());;
			preparedStatement.setFloat(4, orderItem.getTotalAmount());
			
			int i = preparedStatement.executeUpdate();
			
			
			System.out.println(i);
			
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}

	@Override
	public void addOrderItem(Order_Item orderItem) {
			
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement =	connection.prepareStatement(INSERT);)
		{
				
			preparedStatement.setInt(1, orderItem.getOrderId());
			preparedStatement.setInt(2, orderItem.getMenuId());
			preparedStatement.setInt(3, orderItem.getQuantity());
			preparedStatement.setFloat(4, orderItem.getTotalAmount());;
	
			
			int i = preparedStatement.executeUpdate();
			
			System.out.println(i);
			
		
	} catch (SQLException e) {
			
		e.printStackTrace();
	}
	}	

	@Override
	public void deleteOrderItem(int orderItemId) {
		 try (Connection conn = DBConnection.getConnection();
	             PreparedStatement ps = conn.prepareStatement(DELETE)) {
			 
			 
			 ps.setInt(1, orderItemId);
			 int i = ps.executeUpdate();
			 	
			 System.out.println("Deleted Order_Item: "+i);
			
			 
		 } catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
