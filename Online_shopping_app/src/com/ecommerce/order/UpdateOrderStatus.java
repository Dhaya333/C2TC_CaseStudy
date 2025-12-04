package com.ecommerce.order;

public class UpdateOrderStatus {
    public static void execute(int orderId, String status) {
        OrderModel o = OrderRepository.find(orderId);
        if (o != null) o.setStatus(status);
    }
}
