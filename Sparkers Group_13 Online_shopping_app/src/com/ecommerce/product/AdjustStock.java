package com.ecommerce.product;

public class AdjustStock {
    public static void increase(int id, int qty) {
        ProductRepository.adjustStock(id, qty);
    }

    public static void decrease(int id, int qty) {
        ProductRepository.adjustStock(id, -qty);
    }
}
