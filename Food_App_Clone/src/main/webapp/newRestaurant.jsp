<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.foodApp.Model.Restaurant, java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Restaurants | FoodApp</title>
  <style>
    :root {
      --bg-light: #f7f7f7;
      --bg-dark: #1e1e1e;
      --card-light: #ffffff;
      --card-dark: #2c2c2c;
      --text-light: #333;
      --text-dark: #f0f0f0;
      --accent: #e23744;
    }

    * {
      box-sizing: border-box;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      margin: 0;
      padding: 0;
    }

    body {
      background-color: var(--bg-light);
      color: var(--text-light);
      transition: background-color 0.4s, color 0.4s;
    }

    body.dark-mode {
      background-color: var(--bg-dark);
      color: var(--text-dark);
    }

    .navbar {
      background-color: #fff;
      padding: 1rem 2rem;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
      display: flex;
      justify-content: space-between;
      align-items: center;
      position: sticky;
      top: 0;
      z-index: 100;
      transition: background-color 0.4s;
    }

    .navbar.dark-mode {
      background-color: #222;
    }

    .navbar .logo {
      font-size: 1.7rem;
      font-weight: bold;
      color: var(--accent);
    }

    .navbar ul {
      list-style: none;
      display: flex;
      gap: 1.5rem;
    }

    .navbar a {
      text-decoration: none;
      color: inherit;
      font-weight: 500;
    }

    .toggle-switch {
      margin-left: 1rem;
    }

    .container {
      max-width: 1200px;
      margin: 2rem auto;
      padding: 0 1rem;
      display: grid;
      grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
      gap: 1.5rem;
    }

    .card {
      background-color: var(--card-light);
      border-radius: 12px;
      overflow: hidden;
      box-shadow: 0 4px 12px rgba(0,0,0,0.08);
      transition: transform 0.3s, background-color 0.4s;
    }

    .dark-mode .card {
      background-color: var(--card-dark);
    }

    .card:hover {
      transform: translateY(-5px);
    }

    .card img {
      width: 100%;
      height: 180px;
      object-fit: cover;
    }

    .card-content {
      padding: 1rem;
    }

    .card-content h3 {
      font-size: 1.25rem;
      margin-bottom: 0.5rem;
    }

    .description {
      font-size: 0.95rem;
      color: inherit;
      margin-bottom: 0.5rem;
    }

    .details {
      display: flex;
      justify-content: space-between;
      font-size: 0.9rem;
    }

    .rating {
      color: #ffa500;
    }

    .eta {
      font-weight: bold;
    }

    .card a {
      display: block;
      text-align: center;
      background-color: var(--accent);
      color: white;
      padding: 10px;
      font-weight: bold;
      text-decoration: none;
      transition: background-color 0.3s;
    }

    .card a:hover {
      background-color: #c12a34;
    }

    /* Toggle Switch */
    .switch {
      position: relative;
      display: inline-block;
      width: 50px;
      height: 24px;
    }

    .switch input {
      opacity: 0;
      width: 0;
      height: 0;
    }

    .slider {
      position: absolute;
      cursor: pointer;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      background-color: #ccc;
      transition: .4s;
      border-radius: 34px;
    }

    .slider:before {
      position: absolute;
      content: "";
      height: 18px;
      width: 18px;
      left: 3px;
      bottom: 3px;
      background-color: white;
      transition: .4s;
      border-radius: 50%;
    }

    input:checked + .slider {
      background-color: var(--accent);
    }

    input:checked + .slider:before {
      transform: translateX(26px);
    }
  </style>
</head>
<body>

  <nav class="navbar" id="navbar">
    <div class="logo">FoodApp</div>
    <ul>
      <li><a href="#">Home</a></li>
      <li><a href="#">Restaurants</a></li>
      <li><a href="#">Orders</a></li>
      <li><a href="#">Profile</a></li>
      <li class="toggle-switch">
        <label class="switch">
          <input type="checkbox" id="themeToggle">
          <span class="slider"></span>
        </label>
      </li>
    </ul>
  </nav>

  <div class="container">
    <%
      List<Restaurant> restaurants = (List<Restaurant>) request.getAttribute("allRestaurant");
      if (restaurants != null) {
        for (Restaurant restaurant : restaurants) {
    %>
      <div class="card">
        <img src="<%=restaurant.getImagePath()%>" alt="Restaurant">
        <div class="card-content">
          <h3><%= restaurant.getName() %></h3>
          <p class="description"><%= restaurant.getCuisineType() %></p>
          <div class="details">
            <span class="rating">⭐ <%= restaurant.getRating() %></span>
            <span class="eta"><%= restaurant.getDeliveryTime() %></span>
          </div>
        </div>
        <a href="menu?restaurantId=<%= restaurant.getRestaurantId() %>">Go to Menu</a>
      </div>
    <%
        }
      }
    %>
  </div>

  <script>
    const toggle = document.getElementById('themeToggle');
    const body = document.body;
    const navbar = document.getElementById('navbar');

    toggle.addEventListener('change', () => {
      body.classList.toggle('dark-mode');
      navbar.classList.toggle('dark-mode');
    });
  </script>

</body>
</html>
