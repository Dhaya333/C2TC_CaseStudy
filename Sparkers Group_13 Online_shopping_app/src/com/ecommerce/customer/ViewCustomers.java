package com.ecommerce.customer;

import java.util.*;

public class ViewCustomers {
    public static List<CustomerModel> execute() {
        return new ArrayList<>(CustomerRepository.findAll());
    }
}
