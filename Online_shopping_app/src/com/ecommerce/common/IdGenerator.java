package com.ecommerce.common;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger productId = new AtomicInteger(100);
    private static final AtomicInteger customerId = new AtomicInteger(1000);
    private static final AtomicInteger adminId = new AtomicInteger(1);
    private static final AtomicInteger orderId = new AtomicInteger(1);

    public static int nextProductId() { return productId.getAndIncrement(); }
    public static int nextCustomerId() { return customerId.getAndIncrement(); }
    public static int nextAdminId() { return adminId.getAndIncrement(); }
    public static int nextOrderId() { return orderId.getAndIncrement(); }
}
