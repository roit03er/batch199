package daoImple;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import Model.Expense;
import dao.ExpenseDAo;

public class ExpenseDAOImpl implements ExpenseDAo {
    private Connection conn;

    public ExpenseDAOImpl(Connection conn) {
        this.conn = conn;
    }
    public List<Expense> getAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        String query = "SELECT * FROM expenses";

        try (PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Expense expense = new Expense();
                expense.setId(rs.getInt("id"));
                expense.setUser_id(rs.getInt("user_id"));
                expense.setCategory(rs.getString("category"));
                expense.setDescription(rs.getString("description"));
                expense.setAmount(rs.getDouble("amount"));
                expense.setDate(rs.getDate("date"));
                expenses.add(expense);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return expenses;
    }

    public boolean addExpense(Expense e) {
        String sql = "INSERT INTO expenses (user_id, category, description, amount, date) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, e.getUser_id());
            ps.setString(2, e.getCategory());
            ps.setString(3, e.getDescription());
            ps.setDouble(4, e.getAmount());
            ps.setDate(5, new java.sql.Date(e.getDate().getTime()));
            int i = ps.executeUpdate();
            return i == 1;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public List<Expense> getExpensesByUserId(int userId) {
        List<Expense> list = new ArrayList<>();
        String sql = "SELECT * FROM expenses WHERE user_id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Expense e = new Expense();
                e.setUser_id(rs.getInt("user_id"));
                e.setCategory(rs.getString("category"));
                e.setDescription(rs.getString("description"));
                e.setAmount(rs.getDouble("amount"));
                e.setDate(rs.getDate("date"));
                list.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean deleteExpense(int expenseId) {
        String sql = "DELETE FROM expenses WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, expenseId);
            int i = ps.executeUpdate();
            return i == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
