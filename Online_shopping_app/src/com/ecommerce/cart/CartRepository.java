package com.ecommerce.cart;

import java.util.*;

public class CartRepository {
    private static final Map<Integer, CartModel> carts = new HashMap<>();

    public static CartModel get(int customerId) {
        return carts.computeIfAbsent(customerId, c -> new CartModel(c));
    }

    public static void clear(int customerId) {
        CartModel cart = carts.get(customerId);
        if (cart != null) cart.clear();
    }
}
