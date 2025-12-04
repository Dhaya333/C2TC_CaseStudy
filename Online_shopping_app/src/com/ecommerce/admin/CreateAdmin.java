package com.ecommerce.admin;

public class CreateAdmin {
    public static void execute(int id, String name, String email) {
        AdminModel a = new AdminModel(id, name, email);
        AdminRepository.add(a);
    }
}
