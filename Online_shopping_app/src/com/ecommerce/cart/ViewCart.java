package com.ecommerce.cart;

import java.util.*;

public class ViewCart {
    public static Collection<CartItem> execute(int customerId) {
        return CartRepository.get(customerId).getItems().values();
    }
}
