package com.foodApp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private  static final String url="jdbc:mysql://localhost:3306/foodapp";
	private  static final String username="root";
	private  static final String password="rohit@090204";
	private  static Connection connection;
	 
   public static   Connection	getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 connection=	DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}
}
