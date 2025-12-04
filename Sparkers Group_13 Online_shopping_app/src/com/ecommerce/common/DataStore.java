package com.ecommerce.common;

import java.util.*;

public class DataStore {
    private static final Map<String, Object> store = new HashMap<>();

    public static void put(String key, Object value) {
        store.put(key, value);
    }

    public static Object get(String key) {
        return store.get(key);
    }

    public static boolean exists(String key) {
        return store.containsKey(key);
    }
}
