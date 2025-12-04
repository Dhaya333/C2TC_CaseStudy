package com.ecommerce.product;

public class ProductModel {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public ProductModel(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }

    public void setName(String n) { this.name = n; }
    public void setPrice(double p) { this.price = p; }
    public void setStockQuantity(int q) { this.stockQuantity = q; }

    public String toString() {
        return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", stock=" + stockQuantity + "]";
    }
}
