package com.ecommerce.common;

public class Response {
    private boolean success;
    private String message;

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() { return success; }
    public String getMessage() { return message; }

    public static Response ok(String msg) {
        return new Response(true, msg);
    }

    public static Response fail(String msg) {
        return new Response(false, msg);
    }
}
