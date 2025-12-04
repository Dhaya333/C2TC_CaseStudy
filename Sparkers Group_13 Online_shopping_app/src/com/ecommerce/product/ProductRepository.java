package com.ecommerce.product;

import java.util.*;

public class ProductRepository {
    private static final Map<Integer, ProductModel> products = new HashMap<>();

    public static void add(ProductModel p) { products.put(p.getProductId(), p); }
    public static void remove(int id) { products.remove(id); }
    public static ProductModel find(int id) { return products.get(id); }
    public static Collection<ProductModel> findAll() { return products.values(); }

    public static List<ProductModel> searchByName(String name) {
        List<ProductModel> list = new ArrayList<>();
        for (ProductModel p : products.values()) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) list.add(p);
        }
        return list;
    }

    public static void adjustStock(int id, int diff) {
        ProductModel p = products.get(id);
        if (p != null) p.setStockQuantity(p.getStockQuantity() + diff);
    }
}
