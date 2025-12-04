package com.ecommerce.customer;

import java.util.*;

public class CustomerRepository {
    private static final Map<Integer, CustomerModel> customers = new HashMap<>();

    public static void add(CustomerModel c) { customers.put(c.getUserId(), c); }
    public static void remove(int id) { customers.remove(id); }
    public static CustomerModel find(int id) { return customers.get(id); }
    public static Collection<CustomerModel> findAll() { return customers.values(); }
}
