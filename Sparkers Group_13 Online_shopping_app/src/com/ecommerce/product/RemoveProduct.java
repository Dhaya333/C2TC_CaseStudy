package com.ecommerce.product;

public class RemoveProduct {
    public static void execute(int id) {
        ProductRepository.remove(id);
    }
}
