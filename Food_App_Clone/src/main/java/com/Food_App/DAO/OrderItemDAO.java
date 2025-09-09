package com.Food_App.DAO;

import java.util.List;

import com.foodApp.Model.Order_Item;

public interface OrderItemDAO {
	 Order_Item getOrderItemById(int orderItemId);
	    List<Order_Item> getOrderItemsByOrderId(int orderId);
	    List<Order_Item> getOrderItemsByMenuId(int menuId);
	    List<Order_Item> getAllOrderItems();
	    void updateOrderItem(Order_Item orderItem);
	    void  addOrderItem(Order_Item orderItem);
	    void deleteOrderItem(int orderItemId);
}
