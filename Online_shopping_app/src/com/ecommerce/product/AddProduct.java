package com.ecommerce.product;

public class AddProduct {
    public static void execute(int id, String name, double price, int stock) {
        ProductModel p = new ProductModel(id, name, price, stock);
        ProductRepository.add(p);
    }
}
