package com.ecommerce.cart;

public class GetCartTotal {
    public static double execute(int customerId) {
        double sum = 0;
        for (CartItem item : CartRepository.get(customerId).getItems().values()) {
            sum += item.getProduct().getPrice() * item.getQuantity();
        }
        return sum;
    }
}
