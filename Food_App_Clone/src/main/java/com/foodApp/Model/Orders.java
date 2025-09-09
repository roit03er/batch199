package com.foodApp.Model;


import java.util.Date;

public class Orders {
    private int orderId;
    private int userId;
    private int restaurantId;
    private Date orderDate;
    private int totalAmount;
    private String status;
    private String paymentMode;
    private String address;

    public Orders(int orderId, int userId, int restaurantId, java.util.Date date, int totalAmount, String status, String paymentMode, String address) {
        this.orderId = orderId;
        this.userId = userId;
        this.restaurantId = restaurantId;
        this.orderDate = date;
        this.totalAmount = totalAmount;
        this.status = status;
        this.paymentMode = paymentMode;
        this.address=address;
    }

    public Orders() {
    	
    }

    public Orders(int i, int restaurantId2, int userId2, Date date, int totalAmount2, String status2,
			String paymentMode2) {
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    
    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
    public String toString() {
        return "Orders [orderId=" + orderId + ", restaurantId=" + restaurantId + ", userId=" + userId +
               ", orderDate=" + orderDate + ", totalAmount=" + totalAmount + ", status=" + status +
               ", paymentMode=" + paymentMode + "]";
    }
}
