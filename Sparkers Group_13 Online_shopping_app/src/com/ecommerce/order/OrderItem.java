package com.ecommerce.order;

import com.ecommerce.product.ProductModel;

public class OrderItem {
    private ProductModel product;
    private int quantity;

    public OrderItem(ProductModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ProductModel getProduct() { return product; }
    public int getQuantity() { return quantity; }
}
