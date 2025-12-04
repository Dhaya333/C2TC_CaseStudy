package com.ecommerce.cart;

import com.ecommerce.product.ProductModel;

public class CartItem {
    private ProductModel product;
    private int quantity;

    public CartItem(ProductModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public ProductModel getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int q) { this.quantity = q; }
}
