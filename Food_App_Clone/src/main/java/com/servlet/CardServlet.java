package com.servlet;

import java.io.IOException;
import com.foodApp.Model.Card;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/card")
public class CardServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        // Always keep cart persistent regardless of restaurant
        Card card = (Card) session.getAttribute("card");
        if (card == null) {
            card = new Card();
            session.setAttribute("card", card);
        }

        String action = req.getParameter("action");

        if (action != null) {
            switch (action) {
                case "add":
                    addItemToCard(req, card);
                    break;
                case "update":
                    updateCard(req, card);
                    break;
                case "delete":
                    deleteCard(req, card);
                    break;
                default:
                    System.out.println("Unknown action: " + action);
            }
        }

        // Redirect to cart page
        resp.sendRedirect("card.jsp");
    }

    private void addItemToCard(HttpServletRequest req, Card card) {
        try {
            String itemIdStr = req.getParameter("itemId");
            String name = req.getParameter("name");
            String priceStr = req.getParameter("price");

            if (itemIdStr == null || name == null || priceStr == null ||
                itemIdStr.isEmpty() || name.isEmpty() || priceStr.isEmpty()) {
                System.out.println("Missing itemId, name, or price while adding item to cart.");
                return;
            }

            int itemId = Integer.parseInt(itemIdStr);
            int price = Integer.parseInt(priceStr);

            card.addItem(itemId, name, price);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateCard(HttpServletRequest req, Card card) {
        try {
            String itemIdStr = req.getParameter("itemId");
            String quantityStr = req.getParameter("quantity");

            if (itemIdStr == null || quantityStr == null) {
                System.out.println("Missing itemId or quantity for update.");
                return;
            }

            int itemId = Integer.parseInt(itemIdStr);
            int quantity = Integer.parseInt(quantityStr);

            card.updateItemQuantity(itemId, quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void deleteCard(HttpServletRequest req, Card card) {
        try {
            String itemIdStr = req.getParameter("itemId");

            if (itemIdStr == null) {
                System.out.println("Missing itemId for delete.");
                return;
            }

            int itemId = Integer.parseInt(itemIdStr);
            card.removeItem(itemId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
