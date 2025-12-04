package com.ecommerce.cart;

public class RemoveFromCart {
    public static void execute(int customerId, int productId) {
        CartModel cart = CartRepository.get(customerId);
        cart.removeItem(productId);
    }
}
