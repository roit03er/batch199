<%@ page import="Model.User" %>
<%@ page session="true" %>
<%
    User user = (User) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head>
    <title>Add Expense</title>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Poppins', 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            position: relative;
            overflow: hidden;
        }
        body::before {
            content: '';
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            background: url('https://images.unsplash.com/photo-1533106497176-45ae19e68ba2?ixlib=rb-1.2.1&auto=format&fit=crop&w=1950&q=80') center/cover no-repeat;
            filter: blur(8px) brightness(0.9);
            transform: scale(1.1);
            z-index: -1;
        }
        h2 {
            color: #ffffff;
            text-align: center;
            margin: 30px 0;
            font-size: 32px;
            text-shadow: 2px 2px 4px rgba(0,0,0,0.2);
            position: relative;
            font-family: 'Poppins', 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            font-weight: 600;
        }
        h2::after {
            content: '';
            position: absolute;
            bottom: -10px;
            left: 50%;
            transform: translateX(-50%);
            width: 60px;
            height: 3px;
            background: linear-gradient(90deg, #ffffff, rgba(255,255,255,0.5));
            border-radius: 2px;
        }
        form {
            background: rgba(255, 255, 255, 0.8);
            padding: 30px;
            border-radius: 20px;
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 500px;
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            transform: translateY(0);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }
        form:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 40px rgba(0, 0, 0, 0.2);
        }
        .form-group {
            margin-bottom: 20px;
            position: relative;
        }
        .form-group label {
            display: block;
            margin-bottom: 8px;
            color: #2c3e50;
            font-weight: 500;
            font-family: 'Poppins', sans-serif;
        }
        input[type="text"], input[type="number"], input[type="date"] {
            width: 100%;
            padding: 12px 15px;
            border: 2px solid rgba(110, 142, 251, 0.3);
            border-radius: 15px;
            box-sizing: border-box;
            font-size: 16px;
            transition: all 0.3s ease;
            background: rgba(255, 255, 255, 0.9);
            margin: 8px 0;
            font-family: 'Poppins', sans-serif;
        }
        input[type="text"]:focus, input[type="number"]:focus, input[type="date"]:focus {
            border-color: #6e8efb;
            outline: none;
            box-shadow: 0 0 0 3px rgba(110, 142, 251, 0.2);
            transform: translateY(-2px);
        }
        input[type="submit"] {
            background: linear-gradient(135deg, #6e8efb, #a777e3);
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 15px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
            font-weight: 600;
            margin-top: 20px;
            transition: all 0.3s ease;
            text-transform: uppercase;
            letter-spacing: 1px;
            position: relative;
            overflow: hidden;
            font-family: 'Poppins', sans-serif;
        }
        input[type="submit"]::before {
            content: '';
            position: absolute;
            top: 0;
            left: -100%;
            width: 100%;
            height: 100%;
            background: linear-gradient(90deg, transparent, rgba(255,255,255,0.2), transparent);
            transition: 0.5s;
        }
        input[type="submit"]:hover::before {
            left: 100%;
        }
        input[type="submit"]:hover {
            background: linear-gradient(135deg, #a777e3, #6e8efb);
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(110, 142, 251, 0.3);
        }
        .links {
            margin-top: 20px;
            text-align: center;
        }
        .links a {
            color: #ffffff;
            text-decoration: none;
            transition: all 0.3s ease;
            position: relative;
            font-weight: 500;
            margin: 0 10px;
            font-family: 'Poppins', sans-serif;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.2);
        }
        .links a::after {
            content: '';
            position: absolute;
            bottom: -2px;
            left: 0;
            width: 0;
            height: 2px;
            background: linear-gradient(90deg, #ffffff, rgba(255,255,255,0.5));
            transition: width 0.3s ease;
        }
        .links a:hover::after {
            width: 100%;
        }
        .links a:hover {
            color: #ffffff;
            transform: translateY(-2px);
            text-shadow: 2px 2px 4px rgba(0,0,0,0.3);
        }
    </style>
</head>
<body>
    <h2>Add New Expense</h2>
    <form action="AddExpenseServlet" method="post">
        <div class="form-group">
            <label for="category">Category</label>
            <input type="text" id="category" name="category" required placeholder="Enter expense category">
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <input type="text" id="description" name="description" required placeholder="Enter expense description">
        </div>
        <div class="form-group">
            <label for="amount">Amount</label>
            <input type="number" step="0.01" id="amount" name="amount" required placeholder="Enter amount">
        </div>
        <div class="form-group">
            <label for="date">Date</label>
            <input type="date" id="date" name="date" required>
        </div>
        <input type="submit" value="Add Expense">
    </form>
    <div class="links">
        <a href="ViewExpensesServlet">View All Expenses</a>
        <a href="login.jsp">Logout</a>
    </div>
</body>
</html>