package com.foodApp.Model;

import java.util.HashMap;
import java.util.Map;

public class Card {

    private Map<Integer, CardItem> items = new HashMap<>();

    public void addItem(int id, String name, double price) {
        if (items.containsKey(id)) {
            CardItem item = items.get(id);
            item.setQuantity(item.getQuantity() + 1);
        } else {
            items.put(id, new CardItem(id, name, price, 1));
        }
    }

    public void updateItemQuantity(int id, int quantity) {
        if (items.containsKey(id)) {
            if (quantity <= 0) {
                items.remove(id);
            } else {
                items.get(id).setQuantity(quantity);
            }
        }
    }

    public void removeItem(int id) {
        items.remove(id);
    }

    public Map<Integer, CardItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return items.values().stream()
                .mapToDouble(CardItem::getTotalPrice)
                .sum();
    }
}
