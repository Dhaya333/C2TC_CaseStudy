package com.ecommerce.order;

import java.util.*;

public class ViewOrderByCustomer {
    public static List<OrderModel> execute(int customerId) {
        return OrderRepository.findByCustomer(customerId);
    }
}
