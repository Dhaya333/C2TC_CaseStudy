package com.ecommerce.order;

import java.util.*;

public class OrderRepository {
    private static final Map<Integer, OrderModel> orders = new HashMap<>();
    private static int nextId = 1;

    public static int generateId() { return nextId++; }
    public static void add(OrderModel o) { orders.put(o.getOrderId(), o); }
    public static OrderModel find(int id) { return orders.get(id); }
    public static Collection<OrderModel> findAll() { return orders.values(); }

    public static List<OrderModel> findByCustomer(int customerId) {
        List<OrderModel> result = new ArrayList<>();
        for (OrderModel o : orders.values()) {
            if (o.getCustomer().getUserId() == customerId) result.add(o);
        }
        return result;
    }
}
