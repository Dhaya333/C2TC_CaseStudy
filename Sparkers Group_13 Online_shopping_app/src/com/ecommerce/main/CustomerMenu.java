package com.ecommerce.main;

import java.util.*;
import com.ecommerce.customer.*;
import com.ecommerce.product.*;
import com.ecommerce.order.*;
import com.ecommerce.cart.*;

public class CustomerMenu {
    public static void start(Scanner sc) {
        while (true) {
            System.out.println("1. Create Customer");
            System.out.println("2. View Customers");
            System.out.println("3. View Products");
            System.out.println("4. Add To Cart");
            System.out.println("5. View Cart");
            System.out.println("6. Place Order");
            System.out.println("7. View My Orders");
            System.out.println("8. Back");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("Name: "); String name = sc.next();
                System.out.print("Email: "); String email = sc.next();
                System.out.print("Address: "); String address = sc.next();
                CreateCustomer.execute(id, name, email, address);
            }
            else if (ch == 2) {
                for (CustomerModel c : ViewCustomers.execute()) System.out.println(c);
            }
            else if (ch == 3) {
                for (ProductModel p : ViewProducts.execute()) System.out.println(p);
            }
            else if (ch == 4) {
                System.out.print("Customer ID: "); int cid = sc.nextInt();
                System.out.print("Product ID: "); int pid = sc.nextInt();
                System.out.print("Qty: "); int qty = sc.nextInt();
                AddToCart.execute(cid, pid, qty);
            }
            else if (ch == 5) {
                System.out.print("Customer ID: "); int cid = sc.nextInt();
                for (CartItem item : ViewCart.execute(cid))
                    System.out.println(item.getProduct().getName() + " x " + item.getQuantity());
            }
            else if (ch == 6) {
                System.out.print("Customer ID: "); int cid = sc.nextInt();
                Map<Integer, Integer> map = new HashMap<>();
                for (CartItem item : ViewCart.execute(cid))
                    map.put(item.getProduct().getProductId(), item.getQuantity());
                PlaceOrder.execute(cid, map);
                ClearCart.execute(cid);
            }
            else if (ch == 7) {
                System.out.print("Customer ID: "); int cid = sc.nextInt();
                for (OrderModel o : ViewOrderByCustomer.execute(cid))
                    System.out.println("Order: " + o.getOrderId() + " Status: " + o.getStatus());
            }
            else if (ch == 8) return;
        }
    }
}
