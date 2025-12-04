package com.ecommerce.admin;

public class DeleteAdmin {
    public static void execute(int id) {
        AdminRepository.remove(id);
    }
}
