package com.ecommerce.customer;

public class CreateCustomer {
    public static void execute(int id, String name, String email, String address) {
        CustomerModel c = new CustomerModel(id, name, email, address);
        CustomerRepository.add(c);
    }
}
