package com.ecommerce.cart;

import com.ecommerce.product.ProductModel;
import com.ecommerce.product.ProductRepository;

public class AddToCart {
    public static void execute(int customerId, int productId, int qty) {
        ProductModel p = ProductRepository.find(productId);
        if (p == null) return;

        CartModel cart = CartRepository.get(customerId);
        cart.addItem(new CartItem(p, qty));
    }
}
