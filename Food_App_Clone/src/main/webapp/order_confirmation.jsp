<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Order Confirmed</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
            text-align: center;
            padding: 50px;
        }

        .confirmation-container {
            max-width: 600px;
            margin: 0 auto;
            background: #fff;
            border-radius: 16px;
            padding: 30px;
            box-shadow: 0 10px 25px rgba(0, 0, 0, 0.1);
        }

        .confirmation-image img {
            max-width: 100%;
            height: auto;
            border-radius: 12px;
        }

        h1 {
            font-size: 32px;
            color: #333;
            margin-top: 20px;
        }

        p {
            font-size: 18px;
            color: #666;
            margin: 10px 0 30px;
        }

        .home-button {
            text-decoration: none;
            background-color: #ff5722;
            color: #fff;
            padding: 12px 24px;
            border-radius: 8px;
            font-size: 16px;
            transition: background 0.3s;
        }

        .home-button:hover {
            background-color: #e64a19;
        }
    </style>
</head>
<body>

<div class="confirmation-container">
    <div class="confirmation-image">
        <img src="resources/images/order-confirmed.png" alt="Order Confirmed">
    </div>
    <h1>Order Confirmed</h1>
    <p>Your order has been confirmed! Thank you!</p>
    <a href="index.jsp" class="home-button">Go to Home</a>
</div>

</body>
</html>
