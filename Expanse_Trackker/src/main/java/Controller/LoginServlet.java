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
import jakarta.servlet.http.HttpSession;
import util.DBConnection;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection conn = DBConnection.getConnection();
        UserDAO userDAO = new UserDAOImpl(conn);
        User user = userDAO.login(username, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("user_id",user.getUser_id() );
            response.sendRedirect("addExpense.jsp");
        } else {
            request.setAttribute("error", "Invalid credentials.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
