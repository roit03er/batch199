package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/foodapp";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "rohit@090204";

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("name");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        HttpSession session = req.getSession();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            String sql = "SELECT * FROM User WHERE userName = ? AND password = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                session.removeAttribute("errorMessage");
                session.setAttribute("username", username); // Optional: store user info
                resp.sendRedirect("newRestaurant.jsp"); // ✅ Redirect to restaurant page
            } else {
                session.setAttribute("errorMessage", "Invalid Username or Password");
                resp.sendRedirect("index.jsp"); // Back to login page with error
            }

            conn.close();
        } catch (Exception e) {
            session.setAttribute("errorMessage", "An error occurred: " + e.getMessage());
            resp.sendRedirect("index.jsp");
        }
    }
}
