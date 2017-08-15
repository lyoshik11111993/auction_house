package com.example;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        Printer printer = new Printer();
        SQLRequest sqlRequest = new SQLRequest();
        SellerConverter sellerConverter = new SellerConverter();
        BuyerConverter buyerConverter = new BuyerConverter();
        ProductConverter productConverter = new ProductConverter();
        BidConverter bidConverter = new BidConverter();

        System.out.println("SELLERS:");
        printer.print(sellerConverter.convert(sqlRequest.executeQuery("SELECT * FROM Seller")));
        System.out.println("BUYERS:");
        printer.print(buyerConverter.convert(sqlRequest.executeQuery("SELECT * FROM Buyer")));
        System.out.println("PRODUCTS:");
        printer.print(productConverter.convert(sqlRequest.executeQuery("SELECT * FROM product")));
        System.out.println("BIDS:");
        printer.print(bidConverter.convert(sqlRequest.executeQuery("SELECT * FROM bid")));
    }
}
