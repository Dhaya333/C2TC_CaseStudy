package com.ecommerce.customer;

public class DeleteCustomer {
    public static void execute(int id) {
        CustomerRepository.remove(id);
    }
}
