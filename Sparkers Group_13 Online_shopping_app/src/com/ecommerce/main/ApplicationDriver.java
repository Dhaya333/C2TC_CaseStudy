package com.ecommerce.main;

import java.util.Scanner;

public class ApplicationDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Admin Menu");
            System.out.println("2. Customer Menu");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            if (ch == 1) AdminMenu.start(sc);
            else if (ch == 2) CustomerMenu.start(sc);
            else if (ch == 3) break;
        }
        sc.close();
    }
}
