package com.ecommerce.cart;

import java.util.*;

public class CartModel {
    private int customerId;
    private Map<Integer, CartItem> items = new HashMap<>();

    public CartModel(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() { return customerId; }
    public Map<Integer, CartItem> getItems() { return items; }

    public void addItem(CartItem item) {
        int id = item.getProduct().getProductId();
        if (items.containsKey(id)) {
            CartItem existing = items.get(id);
            existing.setQuantity(existing.getQuantity() + item.getQuantity());
        } else {
            items.put(id, item);
        }
    }

    public void removeItem(int productId) {
        items.remove(productId);
    }

    public void clear() {
        items.clear();
    }
}
