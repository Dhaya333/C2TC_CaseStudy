package com.ecommerce.admin;

import java.util.*;

public class AdminRepository {
    private static final Map<Integer, AdminModel> admins = new HashMap<>();

    public static void add(AdminModel a) { admins.put(a.getAdminId(), a); }
    public static void remove(int id) { admins.remove(id); }
    public static AdminModel find(int id) { return admins.get(id); }
    public static Collection<AdminModel> findAll() { return admins.values(); }
}
