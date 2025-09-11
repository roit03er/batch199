package Controller;

import java.io.IOException;
import java.sql.Connection;

import Model.User;
import dao.UserDAO;
import daoImple.UserDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.DBConnection;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        User user = new User(0, name, username, password, email, phone, address);

        Connection conn = DBConnection.getConnection();
        UserDAO userDAO = new UserDAOImpl(conn);

        if (userDAO.registerUser(user)) {
            request.setAttribute("message", "Registration successful. Now you can login.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            request.setAttribute("error", "Registration failed. Try again.");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }

    }
}
