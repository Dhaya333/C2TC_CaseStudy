package com.ecommerce.main;

import java.util.*;
import com.ecommerce.product.*;
import com.ecommerce.admin.*;
import com.ecommerce.order.OrderModel;
import com.ecommerce.order.ViewAllOrders;

public class AdminMenu {
    public static void start(Scanner sc) {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Products");
            System.out.println("4. Create Admin");
            System.out.println("5. View Admins");
            System.out.println("6. Update Order Status");
            System.out.println("7. View Orders");
            System.out.println("8. Back");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            if (ch == 6) {
                System.out.print("Order ID: "); 
                int id = sc.nextInt();
                System.out.print("Status: "); 
                String status = sc.next();

                com.ecommerce.order.UpdateOrderStatus.execute(id, status);
            }

            else if (ch == 1) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("Name: "); String name = sc.next();
                System.out.print("Price: "); double price = sc.nextDouble();
                System.out.print("Stock: "); int qty = sc.nextInt();
                AddProduct.execute(id, name, price, qty);
            }
            else if (ch == 2) {
                System.out.print("ID: "); int id = sc.nextInt();
                RemoveProduct.execute(id);
            }
            else if (ch == 3) {
                for (ProductModel p : ViewProducts.execute()) System.out.println(p);
            }
            else if (ch == 4) {
                System.out.print("ID: "); int id = sc.nextInt();
                System.out.print("Name: "); String name = sc.next();
                System.out.print("Email: "); String email = sc.next();
                CreateAdmin.execute(id, name, email);
            }
            else if (ch == 5) {
                for (AdminModel a : ViewAdmins.execute()) System.out.println(a);
            }
            else if (ch == 7) {
                for (OrderModel o : ViewAllOrders.execute())
                    System.out.println("Order: " + o.getOrderId());
            }
            else if (ch == 8) return;
        }
    }
}
