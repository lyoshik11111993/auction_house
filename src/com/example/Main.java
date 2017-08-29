package com.example;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Menu menu = new Menu();
        String closer = null;
        System.out.println("Hello! Welcome to our auction house! Make your choise: ");
        while (closer != "q") {
            menu.menubar();
            System.out.println("-----------------------------------");
            System.out.println("Select another action: ");
            System.out.println("Press 'q' for closing auction.");
            System.out.println("-----------------------------------");
        }
    }
}
