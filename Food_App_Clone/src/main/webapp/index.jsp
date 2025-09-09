<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Login</title>
  <style>
    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #667eea, #764ba2);
      margin: 0;
      padding: 0;
      display: flex;
      height: 100vh;
      justify-content: center;
      align-items: center;
    }

    .login-container {
      background-color: white;
      padding: 30px 40px;
      border-radius: 12px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
      width: 300px;
      position: relative;
    }

    .login-container h2 {
      text-align: center;
      color: #333;
      margin-bottom: 20px;
    }

    .login-container label {
      display: block;
      margin-bottom: 8px;
      color: #555;
      font-weight: 500;
    }

    .login-container input[type="text"],
    .login-container input[type="password"] {
      width: 100%;
      padding: 10px;
      margin-bottom: 20px;
      border: 1px solid #ccc;
      border-radius: 8px;
      font-size: 14px;
    }

    .login-container input[type="submit"] {
      width: 100%;
      padding: 10px;
      background-color: #667eea;
      border: none;
      color: white;
      font-weight: bold;
      border-radius: 8px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    .login-container input[type="submit"]:hover {
      background-color: #5a67d8;
    }

    .error-message {
      color: red;
      text-align: center;
      margin-bottom: 15px;
      font-weight: bold;
    }
  </style>
</head>
<body>

  <div class="login-container">
  <h2>Login</h2>
  <div id="errorMessage" class="error-message">
    <% 
        // Retrieve message from session
        String errorMessage = (String) session.getAttribute("errorMessage");
        if (errorMessage != null && !errorMessage.isEmpty()) {
            out.println(errorMessage);
            session.removeAttribute("errorMessage"); // Remove it after displaying
        }
    %>
  </div>
  <form action="callingLoginServlet" method="post">
    <label for="name">Username</label>
    <input type="text" name="name" id="name" required>

    <label for="password">Password</label>
    <input type="password" name="password" id="password" required>

    <input type="submit" value="Login">
  </form>

  <p style="text-align:center; margin-top: 10px;">
    New user? 
    <a href="register.html" style="color:#667eea; font-weight:bold; text-decoration:none;">Register here</a>
  </p>
</div>
</body>
</html>