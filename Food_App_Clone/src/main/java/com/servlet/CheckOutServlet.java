package com.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import com.Food_App.DAO.OrdersDAO;
import com.foodApp.DAOimpl.OrderDAOImpl;
import com.foodApp.DAOimpl.Order_ItemDAO_Imple;
import com.foodApp.Model.Card;
import com.foodApp.Model.CardItem;
import com.foodApp.Model.Order_Item;
import com.foodApp.Model.Orders;
import com.foodApp.Model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/checkout")
public class CheckOutServlet extends HttpServlet {

    private OrdersDAO ordersDAO;

    @Override
    public void init() {
        ordersDAO = new OrderDAOImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Card cart = (Card) session.getAttribute("cart");
        User user = (User) session.getAttribute("user");

        if (user == null) {
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
            return;
        }

        if (cart != null && user != null && !cart.getItems().isEmpty()) {
            // Extract form data
            String paymentMode = request.getParameter("paymentMode");
            String address = request.getParameter("address");

            // Create and populate order object
            Orders order = new Orders();
            order.setUserId(user.getUserId());
            Object restIdObj = session.getAttribute("restaurantId");
            order.setRestaurantId(restIdObj != null ? (int) restIdObj : 0);
            order.setOrderDate(new Timestamp(new Date().getTime()));
            order.setPaymentMode(paymentMode);
            order.setAddress(address);
            order.setStatus("Pending");

            // Calculate total
            double totalAmount = 0;
            for (CardItem item : cart.getItems().values()) {
                totalAmount += item.getPrice() * item.getQuantity();
            }
            order.setTotalAmount((int) totalAmount);

            try {
                // Save order
                ordersDAO.addOrder(order); // NOTE: addOrder returns void, so you need to retrieve generated ID another way if needed

                // Optionally, retrieve the latest inserted orderId if required
                // Here assuming you have logic elsewhere to fetch it if necessary

                // Save order items
                Order_ItemDAO_Imple orderItemDAO = new Order_ItemDAO_Imple();
                for (CardItem item : cart.getItems().values()) {
                    int menuId = item.getOrderItemId();
                    int quantity = item.getQuantity();
                    float totalPrice = (float) item.getTotalPrice();

                    Order_Item orderItem = new Order_Item();
                    orderItem.setOrderId(order.getOrderId()); // if you have the orderId after insertion
                    orderItem.setMenuId(menuId);
                    orderItem.setQuantity(quantity);
                    orderItem.setTotalAmount(totalPrice);

                    orderItemDAO.addOrderItem(orderItem);
                }

                // Clear cart and store order info
                session.removeAttribute("card");
                session.setAttribute("order", order);
                response.sendRedirect("order_confirmation.jsp");

            } catch (Exception e) {
                e.printStackTrace();
                response.sendRedirect("error.jsp");
            }
        } else {
            // Cart is empty or user is not logged in
            response.sendRedirect("card.jsp");
        }
    }
}