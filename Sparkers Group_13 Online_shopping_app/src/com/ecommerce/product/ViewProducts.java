package com.ecommerce.product;

import java.util.*;

public class ViewProducts {
    public static List<ProductModel> execute() {
        return new ArrayList<>(ProductRepository.findAll());
    }
}
