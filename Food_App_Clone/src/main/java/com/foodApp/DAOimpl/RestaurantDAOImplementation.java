package com.foodApp.DAOimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Food_App.DAO.RestaurantDAO;
import com.foodApp.Model.Restaurant;
import com.foodApp.util.DBConnection;

public class RestaurantDAOImplementation implements RestaurantDAO {

	private static String GET_RESTAURANT_BY_ID="SELECT * from `restaurant` WHERE  `restaurantId`=?";
	private static String INSERT="INSERT into `restaurant` (`name`, `address`, `cuisineType`, `deliveryTime`, `adminUserId`, `rating`, `isActive`, `imagePath`) values (?,?,?,?,?,?,?,?)";
	private static String UPDATE="UPDATE  `restaurant` SET `name`=? , `address`=? , `cuisineType`=? , `deliveryTime`=?, `adminUserId`=? , `rating`=?, `imagePath`=? ";
	private static String DELETE="DELETE  from restaurant WHERE restaurantId=?";
	private static String GET_ALL_RESTAURANTS =" SELECT * FROM `restaurant`";
	@Override
	public List<Restaurant> getAllRestaurant() {
		List<Restaurant> restaurantList = new ArrayList<>();

	    try (Connection connection = DBConnection.getConnection();
	         PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_RESTAURANTS );
	         ResultSet resultSet = preparedStatement.executeQuery()) {

	        while (resultSet.next()) {
	            int resId = resultSet.getInt("restaurantId");
	            String name = resultSet.getString("name");
	            String address = resultSet.getString("address");
	            String cuisineType = resultSet.getString("cuisineType");
	            String deliveryTime = resultSet.getString("deliveryTime");
	            String adminUserId = resultSet.getString("adminUserId");
	            String rating = resultSet.getString("rating");
	            String isActive = resultSet.getString("isActive");
	            String imagePath = resultSet.getString("imagePath");

	            Restaurant r = new Restaurant(resId, name, address, cuisineType, deliveryTime, adminUserId, rating, isActive, imagePath);
	            restaurantList.add(r);
	        }

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return restaurantList;
	}
		
	@Override
	public Restaurant getRestaurantByid(int restaurantId) {
		Restaurant r = null;
		
		
		try (Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatment	= connection.prepareStatement(GET_RESTAURANT_BY_ID);)
		
		{
		
			preparedStatment.setInt(1, restaurantId);
		
		
			 ResultSet resultSet= preparedStatment.executeQuery();
			
			while (resultSet.next()) {
				
				int resId= resultSet.getInt("restaurantId");
				String name= resultSet.getString("name");
				String address= resultSet.getString("address");
				String cuisineType= resultSet.getString("cuisineType");
				String deliveryTime= resultSet.getString("deliveryTime");
				String adminUserId= resultSet.getString("adminUserId");
				String rating= resultSet.getString("rating");
				String isActive =resultSet.getString("isActive");
				String imagePath = resultSet.getString("imagePath");
				
				
				r = new Restaurant(resId, name, address, cuisineType, deliveryTime, adminUserId, rating, isActive, imagePath);
				
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return r;	
	}
	@Override
	public void addRestaurant(Restaurant r) {
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement =	connection.prepareStatement(INSERT);)

				{
					preparedStatement.setString(1,r.getName());
					preparedStatement.setString(2, r.getAddress());
					preparedStatement.setString(3, r.getCuisineType());
					preparedStatement.setString(4, r.getDeliveryTime());
					preparedStatement.setString(5, r.getAdminUserId());
					preparedStatement.setString(6, r.getRating());
					preparedStatement.setString(7, r.getIsActive());
					preparedStatement.setString(8, r.getImagePath());
					
					int i = preparedStatement.executeUpdate();
					System.out.println(i);
				
				} catch (SQLException e) {
					e.printStackTrace();
				}
	
}
	@Override
	public void updateRestaurant(Restaurant r) {
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement =	connection.prepareStatement(UPDATE);)

				{
			
				preparedStatement.setString(1, r.getName());
				preparedStatement.setString(2, r.getAddress());
				preparedStatement.setString(3, r.getCuisineType());
				preparedStatement.setString(4, r.getDeliveryTime());
				preparedStatement.setString(5, r.getAdminUserId());
				preparedStatement.setString(6, r.getRating());
				preparedStatement.setString(7, r.getIsActive());
				preparedStatement.setString(3, r.getImagePath());
				
				int x = preparedStatement.executeUpdate();
				
				System.out.println(x);
	
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
	}
	
	@Override
	public void deleteRestaurant(int restaurantId) {
	  
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement ps = conn.prepareStatement(DELETE)) {

	            ps.setInt(1, restaurantId);
	            int x = ps.executeUpdate();
	            System.out.println("Deleted rows: " + x);

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}

