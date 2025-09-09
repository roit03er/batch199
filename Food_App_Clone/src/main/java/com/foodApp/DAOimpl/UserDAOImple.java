package com.foodApp.DAOimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import com.Food_App.DAO.UserDAO;
import com.foodApp.Model.User;
import com.foodApp.util.DBConnection;

public class UserDAOImple implements UserDAO {
	
	
	private  final String INSERT="INSERT into `user` (`name`,`username`,`password`,`email`, `phonenumber`,`address`,`role`,`created_date`,`last_login_date`) values(?,?,?,?,?,?,?,?,?)";
	private  final String UPDATE="UPDATE `user` SET `name`=?,`username`=?,`password`=?,`email`=?, `phonenumber`=?,`address`=?,`role`=? ";
	private String GET_USER_BY_ID="SELECT * from `user` WHERE `userid`=?";

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int userId) {
		User u=null;
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement =	connection.prepareStatement(GET_USER_BY_ID);)

				{
					
					preparedStatement.setInt(1, userId);
					
					ResultSet resultSet = preparedStatement.executeQuery();
					
					while (resultSet.next()) {
						
					int id = resultSet.getInt("userid");
						
				String name=	resultSet.getString("name");
				String username=	resultSet.getString("username");
				String password=	resultSet.getString("password");
				String email=	resultSet.getString("email");
				String phonenumber=	resultSet.getString("phonenumber");
				String address=	resultSet.getString("Address");
				String role=	resultSet.getString("Role");
				Timestamp created_date=	resultSet.getTimestamp("created_date");
				Timestamp last_login_date=	resultSet.getTimestamp("last_login_date");
					
				
				 u	=	new User(userId, name, username, password, email, phonenumber, address, role, created_date, last_login_date);
				
			
					}
				
				} catch (SQLException e) { 
					e.printStackTrace();
				}
		
		return u;
	}

	@Override
	public void addUser(User u) {
		
		try (Connection connection = DBConnection.getConnection();
		PreparedStatement preparedStatement =	connection.prepareStatement(INSERT);)

		{
			
			
			preparedStatement.setString(1, u.getName());
			preparedStatement.setString(2, u.getUsername());
			preparedStatement.setString(3, u.getPassword());
			preparedStatement.setString(4, u.getEmail());
			preparedStatement.setString(5, u.getPhone());
			preparedStatement.setString(6, u.getAddress());
			preparedStatement.setString(7, u.getRole());
			preparedStatement.setTimestamp(8, new Timestamp(System.currentTimeMillis()));
			preparedStatement.setTimestamp(9, new Timestamp(System.currentTimeMillis()));
			
			int x = preparedStatement.executeUpdate();
			System.out.println(x);
		
		} catch (SQLException e) { 
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User u) {
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement =	connection.prepareStatement(UPDATE);)

				{
					
					preparedStatement.setString(1, u.getName());
					preparedStatement.setString(2, u.getUsername());
					preparedStatement.setString(3, u.getPassword());
					preparedStatement.setString(4, u.getEmail());
					preparedStatement.setString(5, u.getPhone());
					preparedStatement.setString(6, u.getAddress());
					preparedStatement.setString(7, u.getRole());
					
					int i = preparedStatement.executeUpdate();
					
					System.out.println(i);
				} catch (SQLException e) { 
					e.printStackTrace();
				}
	}

	@Override
	public void deleteUser(int userid) {
		// TODO Auto-generated method stub
		
	}

	
}
