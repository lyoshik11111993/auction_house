package com.example;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Reader reader = new Reader();
        System.out.println("SELLERS:");
        reader.sellers();
        System.out.println("BUYERS:");
        reader.buyers();
        System.out.println("PRODUCTS:");
        reader.products();
        System.out.println("BIDS:");
        reader.bids();
    }
}
