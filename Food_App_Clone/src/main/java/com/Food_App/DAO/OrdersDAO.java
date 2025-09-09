package com.Food_App.DAO;

import java.util.List;

import com.foodApp.Model.Orders;

public interface OrdersDAO {
	List<Orders> getAllOrders();
    Orders getOrderById(int orderId);
    int addOrder(Orders order);
    void updateOrder(Orders order);
    void deleteOrder(int orderId);
    
    
}
