package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PlaceOrderServlet")
public class OrderConfirmationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        // You can fetch cart items and user info here
        // Example: List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");

        // Save order to database (you can use your OrderDAO here)

        // Clear cart
        session.removeAttribute("cart");

        // Forward to confirmation page
        req.getRequestDispatcher("order_confirmation.jsp").forward(req, resp);
    }
}

