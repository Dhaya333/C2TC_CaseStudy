package com.ecommerce.admin;

import java.util.*;

public class ViewAdmins {
    public static List<AdminModel> execute() {
        return new ArrayList<>(AdminRepository.findAll());
    }
}
