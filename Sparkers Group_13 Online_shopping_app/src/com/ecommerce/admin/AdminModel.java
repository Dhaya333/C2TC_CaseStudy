package com.ecommerce.admin;

public class AdminModel {
    private int adminId;
    private String username;
    private String email;

    public AdminModel(int adminId, String username, String email) {
        this.adminId = adminId;
        this.username = username;
        this.email = email;
    }

    public int getAdminId() { return adminId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }

    public void setUsername(String u) { this.username = u; }
    public void setEmail(String e) { this.email = e; }

    public String toString() {
        return "Admin [adminId=" + adminId + ", username=" + username + ", email=" + email + "]";
    }
}
