package com.ecommerce.order;

import java.util.*;

public class ViewAllOrders {
    public static List<OrderModel> execute() {
        return new ArrayList<>(OrderRepository.findAll());
    }
}
