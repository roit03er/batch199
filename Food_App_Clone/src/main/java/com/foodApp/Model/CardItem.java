package com.foodApp.Model;

public class CardItem {
    private int orderItemId;
    private int restaurantId;
    private String itemName;
    private int quantity;
    private double price; // Changed to double

    // Constructor used by Card class (restaurantId not needed here)
    public CardItem(int orderItemId, String itemName, double price, int quantity) {
        this.orderItemId = orderItemId;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Full constructor (if needed for future use)
    public CardItem(int orderItemId, int restaurantId, String itemName, int quantity, double price) {
        this.orderItemId = orderItemId;
        this.restaurantId = restaurantId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
