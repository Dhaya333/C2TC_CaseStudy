package com.ecommerce.admin;

public class FindAdmin {
    public static AdminModel byId(int id) {
        return AdminRepository.find(id);
    }
}
