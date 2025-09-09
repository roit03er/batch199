<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.foodApp.Model.Menu, java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Restaurant Menu</title>
    <style>
        body {
            margin: 0;
            font-family: 'Poppins', 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #fff1f0 0%, #f9f9f9 100%);
            min-height: 100vh;
        }
        .header {
            background: #fff;
            padding: 32px 0 16px 0;
            box-shadow: 0 2px 12px rgba(255, 0, 80, 0.07);
            text-align: center;
        }
        .header h1 {
            margin: 0;
            font-size: 2.2rem;
            color: #e23744;
            font-weight: 700;
            letter-spacing: 1px;
        }
        .menu-container {
            display: flex;
            flex-wrap: wrap;
            padding: 40px 0;
            gap: 32px;
            justify-content: center;
            background: transparent;
        }
        .menu-card {
            background: #fff;
            border-radius: 18px;
            width: 320px;
            box-shadow: 0 6px 24px rgba(226, 55, 68, 0.08), 0 1.5px 4px rgba(0,0,0,0.04);
            transition: transform 0.18s cubic-bezier(.4,0,.2,1), box-shadow 0.18s cubic-bezier(.4,0,.2,1);
            border: 1.5px solid #f5f5f5;
            overflow: hidden;
            position: relative;
        }
        .menu-card:hover {
            transform: translateY(-8px) scale(1.03);
            box-shadow: 0 12px 32px rgba(226, 55, 68, 0.13), 0 2px 8px rgba(0,0,0,0.06);
            border-color: #ffe3e3;
        }
        .menu-image {
            width: 100%;
            height: 180px;
            object-fit: cover;
            border-top-left-radius: 18px;
            border-top-right-radius: 18px;
            background: #f8f8f8;
        }
        .menu-content {
            padding: 18px 22px 16px 22px;
        }
        .menu-content h3 {
            margin: 0;
            font-size: 1.18rem;
            color: #222;
            font-weight: 600;
            letter-spacing: 0.2px;
        }
        .price-rating {
            margin-top: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        .price {
            font-size: 1.08rem;
            color: #e23744;
            font-weight: 700;
            letter-spacing: 0.5px;
        }
        .rating {
            background: #48c479;
            color: #fff;
            font-size: 0.95rem;
            padding: 3px 10px 3px 8px;
            border-radius: 12px;
            font-weight: 600;
            display: flex;
            align-items: center;
            gap: 2px;
            box-shadow: 0 1px 4px rgba(72,196,121,0.08);
        }
        .best-seller {
            position: absolute;
            top: 12px;
            left: 12px;
            background: #ffb300;
            color: #fff;
            font-size: 0.85rem;
            font-weight: 700;
            padding: 3px 10px;
            border-radius: 8px;
            box-shadow: 0 1px 4px rgba(255,179,0,0.12);
            letter-spacing: 0.5px;
        }
        .description {
            margin-top: 12px;
            color: #666;
            font-size: 0.98rem;
            line-height: 1.5;
            min-height: 44px;
        }
        .add-cart-btn {
            margin-top: 16px;
            width: 100%;
            background: #e23744;
            color: #fff;
            border: none;
            border-radius: 8px;
            padding: 10px 0;
            font-size: 1rem;
            font-weight: 600;
            cursor: pointer;
            transition: background 0.2s;
        }
        .add-cart-btn:hover {
            background: #b71c2a;
        }
        @media (max-width: 900px) {
            .menu-container {
                padding: 20px 0;
                gap: 18px;
            }
            .menu-card {
                width: 95vw;
                max-width: 400px;
            }
        }
    </style>
</head>
<body>
<%
    List<Menu> menus = (List<Menu>) request.getAttribute("allMenusByRestaurant");
%>
<div class="header">
    <h1>Menu</h1>
</div>
<div class="menu-container">
    <%
        if (menus == null || menus.isEmpty()) {
    %>
        <div style="font-size:1.2rem;color:#e23744;font-weight:600;padding:40px;">No menu items available.</div>
    <%
        } else {
            for (Menu menu : menus) {
    %>
    <div class="menu-card">
        <% if (menu.getRating() >= 4.5) { %>
            <div class="best-seller">Best Seller</div>
        <% } %>
        <img class="menu-image" src="<%=menu.getImagePath() %>" alt="Item Image">
        <div class="menu-content">
            <h3><%=menu.getItemName() %></h3>
            <div class="price-rating">
                <span class="price">₹<%=menu.getPrice() %></span>
                <span class="rating"><%=menu.getRating() %> ★</span>
            </div>
            <p class="description"><%=menu.getDescription() %></p>
            
            
            
     <form action="card" method="post">
    <input type="hidden" name="action" value="add" />
    <input type="hidden" name="itemId" value="<%= menu.getMenuId() %>" />
    <input type="hidden" name="name" value="<%= menu.getItemName() %>" />
    <input type="hidden" name="price" value="<%= menu.getPrice() %>" />
    <input type="hidden" name="restaurantId" value="<%= menu.getRestaurantId() %>" />
    <button type="submit" class="add-cart-btn">Add to Cart</button>
</form>


            
            
        </div>
    </div>
    <%      }
        }
    %>
</div>
</body>
</html>