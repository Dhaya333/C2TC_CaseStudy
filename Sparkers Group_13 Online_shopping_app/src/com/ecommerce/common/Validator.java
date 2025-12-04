package com.ecommerce.common;

public class Validator {
    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isEmailValid(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static boolean isPositive(int n) {
        return n > 0;
    }
}
