<%@ page import="java.util.*, Model.Expense" %>
<%@ page session="true" %>
<%
    List<Expense> expenses = (List<Expense>) request.getAttribute("expenses");
Double total = (Double) request.getAttribute("total");
Integer count = (Integer) request.getAttribute("count");
%>
	
<html>
<head>
    <title>View Expenses</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #f5f7fa 0%, #c3cfe2 100%);
            margin: 0;
            padding: 20px;
            min-height: 100vh;
        }
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 20px;
        }
        h2 {
            color: #2c3e50;
            text-align: center;
            margin-bottom: 30px;
            font-size: 28px;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.1);
        }
        .expenses-table {
            width: 100%;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            border-collapse: collapse;
            overflow: hidden;
            margin-bottom: 20px;
        }
        .expenses-table th {
            background: #3498db;
            color: white;
            padding: 15px;
            text-align: left;
            font-weight: 500;
            text-transform: uppercase;
            font-size: 14px;
        }
        .expenses-table td {
            padding: 15px;
            border-bottom: 1px solid #eee;
            color: #2c3e50;
        }
        .expenses-table tr:hover {
            background-color: #f8f9fa;
            transition: background-color 0.3s ease;
        }
        .expenses-table tr:last-child td {
            border-bottom: none;
        }
        .amount {
            font-weight: 600;
            color: #e74c3c;
        }
        .category {
            display: inline-block;
            padding: 5px 10px;
            border-radius: 15px;
            font-size: 12px;
            font-weight: 500;
            background: #e8f4fc;
            color: #3498db;
        }
        .date {
            color: #7f8c8d;
            font-size: 14px;
        }
        .actions {
            text-align: center;
            margin-top: 20px;
        }
        .btn {
            display: inline-block;
            padding: 12px 24px;
            background: #3498db;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            margin: 0 10px;
            transition: all 0.3s ease;
        }
        .btn:hover {
            background: #2980b9;
            transform: translateY(-2px);
        }
        .summary {
            background: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
        }
        .summary-item {
            text-align: center;
            padding: 15px;
        }
        .summary-item h3 {
            color: #7f8c8d;
            margin: 0;
            font-size: 14px;
            text-transform: uppercase;
        }
        .summary-item p {
            color: #2c3e50;
            margin: 5px 0 0;
            font-size: 24px;
            font-weight: 600;
        }
        .total-amount {
            color: #e74c3c;
        }
        .no-expenses {
            text-align: center;
            padding: 40px;
            color: #7f8c8d;
            font-size: 18px;
        }
        @media (max-width: 768px) {
            .expenses-table {
                display: block;
                overflow-x: auto;
            }
            .summary {
                flex-direction: column;
            }
            .summary-item {
                margin-bottom: 10px;
            }
        }
    </style>
    <script>
        function formatDate(dateString) {
            const options = { year: 'numeric', month: 'short', day: 'numeric' };
            return new Date(dateString).toLocaleDateString(undefined, options);
        }

        function formatAmount(amount) {
            return '$' + parseFloat(amount).toFixed(2);
        }

        
    </script>
</head>
<body>
    <div class="container">
        <h2>Your Expenses</h2>
        
        <div class="summary">
    <div class="summary-item">
        <h3>Total Expenses</h3>
        <p class="total-amount">$<%= String.format("%.2f", total != null ? total : 0.0) %></p>
    </div>
    <div class="summary-item">
        <h3>Number of Expenses</h3>
        <p><%= count != null ? count : 0 %></p>
    </div>
</div>


        <% if (expenses != null && !expenses.isEmpty()) { %>
            <table class="expenses-table">
                <thead>
                    <tr>
                        <th>Category</th>
                        <th>Description</th>
                        <th>Amount</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <% for (Expense e : expenses) { %>
                        <tr>
                            <td><span class="category"><%= e.getCategory() %></span></td>
                            <td><%= e.getDescription() %></td>
                            <td class="amount"><%= String.format("$%.2f", e.getAmount()) %></td>
                            <td class="date"><%= e.getDate() %></td>
                        </tr>
                    <% } %>
                </tbody>
            </table>
        <% } else { %>
            <div class="no-expenses">
                <p>No expenses found. Start tracking your expenses!</p>
            </div>
        <% } %>

        <div class="actions">
            <a href="addExpense.jsp" class="btn">Add New Expense</a>
            <a href="login.jsp" class="btn">Logout</a>
        </div>
    </div>
</body>
</html> 