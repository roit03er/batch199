package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

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

public class ViewExpensesServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession(false);
	    User user = (User) session.getAttribute("user");

	    if (user == null) {
	        response.sendRedirect("login.jsp");
	        return;
	    }

	    try {
	        Connection conn = DBConnection.getConnection();
	        ExpenseDAo expenseDAO = new ExpenseDAOImpl(conn);
	        List<Expense> expenses = expenseDAO.getExpensesByUserId(user.getUser_id());

	        double totalAmount = 0;
	        for (Expense e : expenses) {
	            totalAmount += e.getAmount();
	        }

	        request.setAttribute("expenses", expenses);
	        request.setAttribute("total", totalAmount);
	        request.setAttribute("count", expenses.size());

	        request.getRequestDispatcher("viewExpenses.jsp").forward(request, response);
	    } catch (Exception e) {
	        e.printStackTrace();
	        response.sendRedirect("error.jsp");
	    }
	}

}
