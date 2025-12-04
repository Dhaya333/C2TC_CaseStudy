package com.ecommerce.order;

public class FindOrder {
    public static OrderModel byId(int id) {
        return OrderRepository.find(id);
    }
}
