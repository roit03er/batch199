<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page import="com.foodApp.Model.Card, com.foodApp.Model.CardItem, java.util.*" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Your Cart</title>
    <style>
        body {
            background-color: #121212;
            color: white;
            font-family: Arial, sans-serif;
            padding: 30px;
        }

        h1 {
            text-align: center;
            color: red;
            margin-bottom: 30px;
        }

        .cart-container {
            width: 600px;
            margin: auto;
            background-color: #1f1f1f;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 12px rgba(255, 0, 0, 0.3);
        }

        .cart-item {
            border-bottom: 1px solid #444;
            padding: 15px 0;
        }

        .item-name {
            font-size: 20px;
            font-weight: bold;
            color: #ffffff;
        }

        .item-info {
            margin: 5px 0;
            color: #cccccc;
        }

        .quantity-controls {
            margin-top: 10px;
        }

        .quantity-btn, .remove-btn {
            background-color: red;
            color: white;
            border: none;
            padding: 5px 10px;
            margin: 0 2px;
            border-radius: 5px;
            cursor: pointer;
            font-weight: bold;
        }

        .quantity-btn:disabled {
            opacity: 0.6;
            cursor: not-allowed;
        }

        .remove-btn {
            background-color: #e74c3c;
        }

        .quantity-controls form {
            display: inline;
        }

        .total {
            text-align: right;
            font-size: 18px;
            color: #ff5252;
            margin-top: 20px;
        }

        .checkout-btn {
            width: 100%;
            margin-top: 25px;
            padding: 12px;
            font-size: 16px;
            background-color: red;
            color: white;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            font-weight: bold;
        }

        .empty-message {
            text-align: center;
            color: #888;
            margin-top: 30px;
        }
    </style>
</head>
<body>

<h1>Your Cart</h1>

<div class="cart-container">
<%
    Card card = (Card) session.getAttribute("card");

    if (card != null && card.getItems() != null && !card.getItems().isEmpty()) {
        for (CardItem item : card.getItems().values()) {
%>
    <div class="cart-item">
        <div class="item-name"><%= item.getItemName() %></div>
        <div class="item-info">Price: ₹<%= item.getPrice() %></div>
        <div class="item-info">Total: ₹<%= item.getTotalPrice() %></div>

        <div class="quantity-controls">

            <!-- Decrease Quantity -->
            <form action="card" method="post">
                <input type="hidden" name="action" value="update" />
                <input type="hidden" name="itemId" value="<%= item.getOrderItemId() %>" />
                <input type="hidden" name="quantity" value="<%= item.getQuantity() - 1 %>" />
                <button class="quantity-btn" <%= item.getQuantity() == 1 ? "disabled" : "" %>>-</button>
            </form>

            <span style="margin: 0 10px;"><%= item.getQuantity() %></span>

            <!-- Increase Quantity -->
            <form action="card" method="post">
                <input type="hidden" name="action" value="update" />
                <input type="hidden" name="itemId" value="<%= item.getOrderItemId() %>" />
                <input type="hidden" name="quantity" value="<%= item.getQuantity() + 1 %>" />
                <button class="quantity-btn">+</button>
            </form>

            <!-- Remove Item -->
            <form action="card" method="post">
                <input type="hidden" name="action" value="delete" />
                <input type="hidden" name="itemId" value="<%= item.getOrderItemId() %>" />
                <button class="remove-btn">Remove</button>
            </form>
        </div>
    </div>
<%
        } // end for
%>
    <div class="total">
        Grand Total: ₹<%= card.getTotalPrice() %>
    </div>

    <form action="checkOut.jsp" method="post">
        <input type="submit" class="checkout-btn" value="Proceed to Checkout" />
    </form>
<%
    } else {
%>
    <div class="empty-message">
        Your cart is empty.
    </div>
<%
    }
%>
</div>

</body>
</html>
