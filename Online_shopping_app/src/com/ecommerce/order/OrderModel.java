package com.ecommerce.order;

import java.util.List;
import com.ecommerce.customer.CustomerModel;

public class OrderModel {
    private int orderId;
    private CustomerModel customer;
    private List<OrderItem> items;
    private String status;

    public OrderModel(int orderId, CustomerModel customer, List<OrderItem> items, String status) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.status = status;
    }

    public int getOrderId() { return orderId; }
    public CustomerModel getCustomer() { return customer; }
    public List<OrderItem> getItems() { return items; }
    public String getStatus() { return status; }

    public void setStatus(String s) { this.status = s; }
}
