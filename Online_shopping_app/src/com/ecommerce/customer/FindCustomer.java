package com.ecommerce.customer;

public class FindCustomer {
    public static CustomerModel byId(int id) {
        return CustomerRepository.find(id);
    }
}
