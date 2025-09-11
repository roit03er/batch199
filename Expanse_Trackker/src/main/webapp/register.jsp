<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register - Expense Tracker</title>
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
        .box {
            background: rgba(255, 255, 255, 0.8);
            padding: 1.5rem;
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
        .box::before {
            content: '';
            position: absolute;
            top: -50%;
            left: -50%;
            width: 200%;
            height: 200%;
            background: radial-gradient(circle, rgba(110, 142, 251, 0.1) 0%, rgba(167, 119, 227, 0.1) 70%);
            animation: rotate 20s linear infinite;
            z-index: -1;
        }
        @keyframes rotate {
            from { transform: rotate(0deg); }
            to { transform: rotate(360deg); }
        }
        .box:hover {
            transform: translateY(-5px);
            box-shadow: 0 12px 40px rgba(0, 0, 0, 0.2);
        }
        h2 {
            color: #2c3e50;
            text-align: center;
            margin-bottom: 30px;
            font-size: 28px;
            text-shadow: 1px 1px 2px rgba(0,0,0,0.1);
            position: relative;
        }
        h2::after {
            content: '';
            position: absolute;
            bottom: -10px;
            left: 50%;
            transform: translateX(-50%);
            width: 50px;
            height: 3px;
            background: linear-gradient(90deg, #6e8efb, #a777e3);
            border-radius: 2px;
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
        }
        input[type="text"], input[type="password"], input[type="email"] {
            width: 100%;
            padding: 12px 15px;
            border: 2px solid rgba(110, 142, 251, 0.3);
            border-radius: 15px;
            box-sizing: border-box;
            font-size: 16px;
            transition: all 0.3s ease;
            background: rgba(255, 255, 255, 0.9);
        }
        input[type="text"]:focus, input[type="password"]:focus, input[type="email"]:focus {
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
        .error-message {
            color: #e74c3c;
            background: rgba(231, 76, 60, 0.1);
            padding: 10px;
            border-radius: 15px;
            margin: 10px 0;
            text-align: center;
            animation: shake 0.5s ease-in-out;
            backdrop-filter: blur(5px);
        }
        @keyframes shake {
            0%, 100% { transform: translateX(0); }
            25% { transform: translateX(-5px); }
            75% { transform: translateX(5px); }
        }
        .login-link {
            text-align: center;
            margin-top: 20px;
        }
        .login-link a {
            color: #6e8efb;
            text-decoration: none;
            transition: all 0.3s ease;
            position: relative;
            font-weight: 500;
        }
        .login-link a::after {
            content: '';
            position: absolute;
            bottom: -2px;
            left: 0;
            width: 0;
            height: 2px;
            background: linear-gradient(90deg, #6e8efb, #a777e3);
            transition: width 0.3s ease;
        }
        .login-link a:hover::after {
            width: 100%;
        }
        .login-link a:hover {
            color: #a777e3;
            transform: translateY(-2px);
        }
        .password-strength {
            height: 5px;
            margin-top: 5px;
            border-radius: 3px;
            transition: all 0.3s ease;
        }
        .strength-weak { background: #e74c3c; width: 33%; }
        .strength-medium { background: #f1c40f; width: 66%; }
        .strength-strong { background: #2ecc71; width: 100%; }
        .field-icon {
            position: absolute;
            right: 15px;
            top: 40px;
            color: #95a5a6;
            transition: color 0.3s ease;
        }
    </style>
    <script>
        function validatePassword() {
            const password = document.getElementById('password').value;
            const strengthBar = document.getElementById('password-strength');
            
            strengthBar.className = 'password-strength';
            
            if (password.length === 0) {
                return;
            }
            
            let strength = 0;
            if (password.length >= 8) strength++;
            if (password.match(/[a-z]/) && password.match(/[A-Z]/)) strength++;
            if (password.match(/\d/)) strength++;
            if (password.match(/[^a-zA-Z\d]/)) strength++;
            
            if (strength <= 2) {
                strengthBar.classList.add('strength-weak');
            } else if (strength === 3) {
                strengthBar.classList.add('strength-medium');
            } else {
                strengthBar.classList.add('strength-strong');
            }
        }

        function validateEmail() {
            const email = document.getElementById('email').value;
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            const emailIcon = document.getElementById('email-icon');
            
            if (emailRegex.test(email)) {
                emailIcon.style.color = '#2ecc71';
            } else {
                emailIcon.style.color = '#95a5a6';
            }
        }

        function validatePhone() {
            const phone = document.getElementById('phone').value;
            const phoneRegex = /^\d{10}$/;
            const phoneIcon = document.getElementById('phone-icon');
            
            if (phoneRegex.test(phone)) {
                phoneIcon.style.color = '#2ecc71';
            } else {
                phoneIcon.style.color = '#95a5a6';
            }
        }
    </script>
</head>
<body>
    <div class="box">
        <h2>Create Your Account</h2>
        <form action="RegisterServlet" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="name">Full Name</label>
                <input type="text" id="name" name="name" required placeholder="Enter your full name">
            </div>
            <div class="form-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required placeholder="Choose a username">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required placeholder="Create a password" oninput="validatePassword()">
                <div id="password-strength" class="password-strength"></div>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required placeholder="Enter your email" oninput="validateEmail()">
                <span id="email-icon" class="field-icon">✉</span>
            </div>
            <div class="form-group">
                <label for="phone">Phone Number</label>
                <input type="text" id="phone" name="phone" placeholder="Enter your phone number" oninput="validatePhone()">
                <span id="phone-icon" class="field-icon">📱</span>
            </div>
            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" id="address" name="address" placeholder="Enter your address">
            </div>
            <input type="submit" value="Create Account">
        </form>
        <% if (request.getAttribute("error") != null) { %>
            <div class="error-message"><%= request.getAttribute("error") %></div>
        <% } %>
        <div class="login-link">
            <a href="login.jsp">Already have an account? Login</a>
        </div>
    </div>
</body>
</html> 