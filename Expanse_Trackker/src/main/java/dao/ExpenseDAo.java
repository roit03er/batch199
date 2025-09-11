package dao;

import java.util.List;

import Model.Expense;

public interface ExpenseDAo {
	 boolean addExpense(Expense expense);
	    List<Expense> getExpensesByUserId(int userId);
	    List<Expense> getAllExpenses();
	    boolean deleteExpense(int expenseId);
}

