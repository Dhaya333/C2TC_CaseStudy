package com.ecommerce.customer;

public class CustomerModel {
    private int userId;
    private String username;
    private String email;
    private String address;

    public CustomerModel(int userId, String username, String email, String address) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    public int getUserId() { return userId; }
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    public void setUsername(String u) { this.username = u; }
    public void setEmail(String e) { this.email = e; }
    public void setAddress(String a) { this.address = a; }

    public String toString() {
        return "Customer [userId=" + userId + ", username=" + username + ", email=" + email + ", address=" + address + "]";
    }
}
