package Controller;


import java.io.IOException;
import java.sql.Connection;
import java.text.SimpleDateFormat;

import Model.Expense;
import Model.User;
import dao.ExpenseDAo;
import daoImple.ExpenseDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import util.DBConnection;

public class AddExpenseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        User user = (User) session.getAttribute("user");

        String category = request.getParameter("category");
        String description = request.getParameter("description");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String dateStr = request.getParameter("date");

        try {
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
            Expense expense = new Expense(0, user.getUser_id(), category, description, amount, date);

            Connection conn = DBConnection.getConnection();
            ExpenseDAo expenseDAO = new ExpenseDAOImpl(conn);

            if (expenseDAO.addExpense(expense)) {
                response.sendRedirect("viewExpenses.jsp");
            } else {
                request.setAttribute("error", "Failed to add expense.");
                request.getRequestDispatcher("addExpense.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

