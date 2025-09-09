package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet{

	private String jdbcURL="jdbc:mysql://localhost:3306/expense_tracker"; 
	private String jdbcUsername="root";
	private String jdbcPassword="rohit@090204";
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form parameters
        String name = request.getParameter("name");
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)) {
                String sql = "INSERT INTO user (name, username, password, email, phone, address) VALUES (?, ?, ?, ?, ?, ?)"; 
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, name);
                statement.setString(2, userName);
                statement.setString(3, passWord); 
                statement.setString(4, email);
                statement.setString(5, phone);
                statement.setString(6, address);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    response.sendRedirect("index.jsp");
                } else {
                    response.getWriter().println("Error: Could not register user.");
                }
            }
        }catch (Exception e) {
        	 e.printStackTrace();
        }
        
    }
}
