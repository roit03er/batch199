<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login - Expense Tracker</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            min-height: 100vh;
            display: flex;
            justify-content: center;
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
        .container {
            background: rgba(255, 255, 255, 0.85);
            padding: 2.5rem;
            border-radius: 20px;
            box-shadow: 0 8px 32px rgba(0, 0, 0, 0.15);
            width: 100%;
            max-width: 400px;
            text-align: center;
            backdrop-filter: blur(10px);
            border: 1px solid rgba(255, 255, 255, 0.3);
            transform: translateY(0);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
            position: relative;
            overflow: hidden;
        }
        .container::before {
            content: '';
            position: absolute;
            top: -50%;
            left: -50%;
            width: 200%;
            height: 200%;
            background: radial-gradient(circle, rgba(255,255,255,0.1) 0%, rgba(255,255,255,0) 70%);
            animation: rotate 20s linear infinite;
            z-index: -1;
        }
        @keyframes rotate {
            from { transform: rotate(0deg); }
            to { transform: rotate(360deg); }
        }
        .container:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 40px rgba(0, 0, 0, 0.2);
        }
        .logo {
            width: 100px;
            height: 100px;
            margin-bottom: 1.5rem;
            transition: transform 0.3s ease;
            filter: drop-shadow(0 4px 6px rgba(0, 0, 0, 0.1));
        }
        .logo:hover {
            transform: scale(1.1) rotate(5deg);
        }
        h2 {
            color: #2c3e50;
            margin-bottom: 2rem;
            font-size: 28px;
            font-weight: 600;
            position: relative;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.1);
        }
        h2::after {
            content: '';
            position: absolute;
            bottom: -10px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 3px;
            background: linear-gradient(90deg, #3498db, #2980b9);
            border-radius: 2px;
        }
        .form-group {
            margin-bottom: 1.5rem;
            text-align: left;
            position: relative;
        }
        .form-group input {
            width: 100%;
            padding: 12px 15px;
            border: 2px solid rgba(224, 224, 224, 0.8);
            border-radius: 10px;
            font-size: 16px;
            box-sizing: border-box;
            transition: all 0.3s ease;
            background: rgba(255, 255, 255, 0.9);
        }
        .form-group input:focus {
            border-color: #3498db;
            box-shadow: 0 0 0 3px rgba(52, 152, 219, 0.2);
            outline: none;
            transform: translateY(-2px);
        }
        .form-group input::placeholder {
            color: #95a5a6;
        }
        .form-group i {
            position: absolute;
            right: 15px;
            top: 50%;
            transform: translateY(-50%);
            color: #95a5a6;
        }
        input[type="submit"] {
            background: linear-gradient(135deg, #3498db, #2980b9);
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 10px;
            cursor: pointer;
            width: 100%;
            font-size: 16px;
            font-weight: 600;
            transition: all 0.3s ease;
            text-transform: uppercase;
            letter-spacing: 1px;
            position: relative;
            overflow: hidden;
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
            background: linear-gradient(135deg, #2980b9, #3498db);
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(52, 152, 219, 0.3);
        }
        .error-message {
            color: #e74c3c;
            background: rgba(231, 76, 60, 0.1);
            padding: 10px;
            border-radius: 8px;
            margin: 1rem 0;
            font-size: 14px;
            animation: shake 0.5s ease-in-out;
            backdrop-filter: blur(5px);
        }
        @keyframes shake {
            0%, 100% { transform: translateX(0); }
            25% { transform: translateX(-5px); }
            75% { transform: translateX(5px); }
        }
        .register-link {
            color: #3498db;
            text-decoration: none;
            display: inline-block;
            margin-top: 1.5rem;
            font-weight: 500;
            transition: all 0.3s ease;
            position: relative;
        }
        .register-link::after {
            content: '';
            position: absolute;
            bottom: -2px;
            left: 0;
            width: 0;
            height: 2px;
            background: linear-gradient(90deg, #3498db, #2980b9);
            transition: width 0.3s ease;
        }
        .register-link:hover::after {
            width: 100%;
        }
        .register-link:hover {
            color: #2980b9;
            transform: translateY(-2px);
        }
        .welcome-text {
            color: #7f8c8d;
            margin-bottom: 2rem;
            font-size: 16px;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.1);
        }
    </style>
</head>
<body>
    <div class="container">
        <img src="https://cdn-icons-png.flaticon.com/512/2382/2382469.png" alt="Expense Tracker Logo" class="logo">
        <h2>Welcome Back</h2>
        <p class="welcome-text">Track your expenses with ease</p>
        <form action="LoginServlet" method="post">
            <div class="form-group">
                <input type="text" name="username" placeholder="Username" required>
            </div>
            <div class="form-group">
                <input type="password" name="password" placeholder="Password" required>
            </div>
            <input type="submit" value="Sign In">
        </form>
        <% if (request.getAttribute("error") != null) { %>
            <p class="error-message"><%= request.getAttribute("error") %></p>
        <% } %>
        <a href="register.jsp" class="register-link">Don't have an account? Register</a>
    </div>
</body>
</html> 