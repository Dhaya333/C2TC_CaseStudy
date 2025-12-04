package com.ecommerce.customer;

public class UpdateCustomer {
    public static void updateName(int id, String newName) {
        CustomerModel c = CustomerRepository.find(id);
        if (c != null) c.setUsername(newName);
    }

    public static void updateEmail(int id, String newEmail) {
        CustomerModel c = CustomerRepository.find(id);
        if (c != null) c.setEmail(newEmail);
    }

    public static void updateAddress(int id, String newAddress) {
        CustomerModel c = CustomerRepository.find(id);
        if (c != null) c.setAddress(newAddress);
    }
}
