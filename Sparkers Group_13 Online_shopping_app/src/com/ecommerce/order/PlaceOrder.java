package com.ecommerce.order;

import java.util.*;
import com.ecommerce.customer.CustomerModel;
import com.ecommerce.customer.CustomerRepository;
import com.ecommerce.product.ProductModel;
import com.ecommerce.product.ProductRepository;

public class PlaceOrder {
    public static void execute(int customerId, Map<Integer, Integer> productQtyMap) {
        CustomerModel customer = CustomerRepository.find(customerId);
        if (customer == null) return;

        List<OrderItem> items = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : productQtyMap.entrySet()) {
            ProductModel p = ProductRepository.find(e.getKey());
            if (p != null && p.getStockQuantity() >= e.getValue()) {
                p.setStockQuantity(p.getStockQuantity() - e.getValue());
                items.add(new OrderItem(p, e.getValue()));
            }
        }

        int id = OrderRepository.generateId();
        OrderModel order = new OrderModel(id, customer, items, "Pending");
        OrderRepository.add(order);
    }
}
