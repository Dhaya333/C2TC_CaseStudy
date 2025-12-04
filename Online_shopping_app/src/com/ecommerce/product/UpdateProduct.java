package com.ecommerce.product;

public class UpdateProduct {
    public static void updateName(int id, String newName) {
        ProductModel p = ProductRepository.find(id);
        if (p != null) p.setName(newName);
    }

    public static void updatePrice(int id, double newPrice) {
        ProductModel p = ProductRepository.find(id);
        if (p != null) p.setPrice(newPrice);
    }

    public static void updateStock(int id, int newStock) {
        ProductModel p = ProductRepository.find(id);
        if (p != null) p.setStockQuantity(newStock);
    }
}
