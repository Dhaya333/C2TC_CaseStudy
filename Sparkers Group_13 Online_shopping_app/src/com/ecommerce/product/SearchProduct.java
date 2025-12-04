package com.ecommerce.product;

import java.util.*;

public class SearchProduct {
    public static List<ProductModel> byName(String name) {
        return ProductRepository.searchByName(name);
    }
}
