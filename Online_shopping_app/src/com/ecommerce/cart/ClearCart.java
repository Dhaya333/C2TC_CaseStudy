package com.ecommerce.cart;

public class ClearCart {
    public static void execute(int customerId) {
        CartRepository.clear(customerId);
    }
}
