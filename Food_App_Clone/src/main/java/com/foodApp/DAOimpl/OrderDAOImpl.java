package com.foodApp.DAOimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Food_App.DAO.OrdersDAO;
import com.foodApp.Model.Orders;
import com.foodApp.util.DBConnection;

public class OrderDAOImpl implements OrdersDAO {

	private String GET_ALL_ORDERS="SELECT * FROM `orders`";
	private String GET_ORDER_BY_ID = "SELECT * FROM `orders` WHERE `orderId`=?";
	private String INSERT="INSERT INTO `orders` (`restaurantId`, `userId`, `orderDate`, `totalAmount`, `status`, `paymentMode`) VALUES (?, ?, ?, ?, ?, ?)";
	private String DELETE = "DELETE FROM `orders` WHERE `orderId`=?";
	private String UPDATE="update `orders` set `userId`=?,`restaurantId`=?,`orderDate`=?,`totalAmount`=?,`status`=?,`paymentMode`=?";
	@Override
	public List<Orders> getAllOrders() {
		List<Orders> orderList= new ArrayList<>();
		
		 try (Connection connection = DBConnection.getConnection();
		         PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_ORDERS);
		         ResultSet resultSet = preparedStatement.executeQuery()) {
		
			while(resultSet.next()) {
				int orderId = resultSet.getInt("orderId");
				int userId= resultSet.getInt("userId");
				int restaurantId = resultSet.getInt("restaurantId");
				Date orderDate= resultSet.getDate("OrderDate");
				int totalAmount= resultSet.getInt("totalAmount");
				String status= resultSet.getString("status");
				String paymentMode= resultSet.getString("paymentMode");
				String address=resultSet.getString("address");
				
				Orders or= new Orders(orderId, restaurantId,userId,orderDate,totalAmount,status,paymentMode,address);
				orderList.add(or);
			}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return orderList;
	}
	@Override
	public Orders getOrderById(int orderId) {
		Orders or = null;
	
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatment	= connection.prepareStatement(GET_ORDER_BY_ID);)
				
				{	
			preparedStatment.setInt(1, orderId);
			
			ResultSet resultSet = preparedStatment.executeQuery();
			
			while (resultSet.next()) {
				int orderId1 = resultSet.getInt("orderId");
				int userId = resultSet.getInt("UserId");
				int restaurantId= resultSet.getInt("restaurantId");
				Date orderDate= resultSet.getDate("OrderDate");
				int totalAmount= resultSet.getInt("totalAmount");
				String status= resultSet.getString("status");
				String paymentMode= resultSet.getString("paymentMode");
				String address=resultSet.getString("address");
				
				or = new Orders(orderId1,userId,restaurantId,orderDate,totalAmount,status,paymentMode,address);
			}
		
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
		
		return or;
	}

	@Override
	public int addOrder(Orders order) {
		int orderId=0;
	    try (Connection connection = DBConnection.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(
	             "INSERT INTO orders (restaurantId, userId, orderDate, totalAmount, status, paymentMode, address) VALUES (?, ?, ?, ?, ?, ?, ?)",
	             Statement.RETURN_GENERATED_KEYS)) {

	        preparedStatement.setInt(1, order.getRestaurantId());
	        preparedStatement.setInt(2, order.getUserId());
	        preparedStatement.setDate(3, new java.sql.Date(order.getOrderDate().getTime()));
	        preparedStatement.setInt(4, order.getTotalAmount());
	        preparedStatement.setString(5, order.getStatus());
	        preparedStatement.setString(6, order.getPaymentMode());
	        preparedStatement.setString(7, order.getAddress());

	        int i = preparedStatement.executeUpdate();

	        // Get generated key (orderId)
	       if (i==0) {
	    	   throw new SQLException("Creating order failed , no rows affected.");
	 
	        }
	       ResultSet rs = preparedStatement.getGeneratedKeys();
	       while (rs.next()) {
	    	   orderId= rs.getInt(1);
	       }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		return orderId;
	}


	@Override
	public void updateOrder(Orders order) {
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(UPDATE)) {

			preparedStatement.setInt(1, order.getRestaurantId());
			preparedStatement.setInt(2, order.getUserId());
			preparedStatement.setDate(3, new java.sql.Date(order.getOrderDate().getTime()));
			preparedStatement.setInt(4, order.getTotalAmount());
			preparedStatement.setString(5, order.getStatus());
			preparedStatement.setString(6, order.getPaymentMode());
			preparedStatement.setInt(7, order.getOrderId());

			int x = preparedStatement.executeUpdate();
			System.out.println(x);

		} catch (SQLException e) {
			e.printStackTrace();
	}

	}
	@Override
	public void deleteOrder(int orderId) {
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE)) {

			preparedStatement.setInt(1, orderId);
			int x = preparedStatement.executeUpdate();
			System.out.println("Deleted rows: " + x);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}


