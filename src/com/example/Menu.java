package com.example;

import com.example.Converters.BidConverter;
import com.example.Converters.BuyerConverter;
import com.example.Converters.ProductConverter;
import com.example.Converters.SellerConverter;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    SellerConverter sellerConverter = new SellerConverter();
    BuyerConverter buyerConverter = new BuyerConverter();
    ProductConverter productConverter = new ProductConverter();
    BidConverter bidConverter = new BidConverter();
    Printer printer = new Printer();
    SQLRequest sqlRequest = new SQLRequest();

    public Menu() throws SQLException {
    }

    public void menubar() throws SQLException {
        System.out.println("Press '1' to insert new sellers");
        System.out.println("Press '2' to insert new buyers");
        System.out.println("Press '3' to insert new products");
        System.out.println("Press '4' to insert new bids");
        System.out.println("Press '5' to show all categories");
        System.out.println("Press '6' to remove your additions");
        int selecter = scanner.nextInt();
        switch (selecter) {
            case 1:
                System.out.println("Add new Seller: ");
                String newSeller = scanner.next();
                sellerConverter.sellerInsert(newSeller);
                break;
            case 2:
                System.out.println("Add new Buyer: ");
                String newBuyer = scanner.next();
                buyerConverter.buyerInsert(newBuyer);
                break;
            case 3:
                System.out.println("Add new Product: ");
                String newProduct = scanner.next();
                System.out.println("Add Seller`s Id: ");
                String newSellerId = scanner.next();
                productConverter.productInsert(newProduct, newSellerId);
                break;
            case 4:
                System.out.println("Add new Bid: ");
                String newBid = scanner.next();
                System.out.println("Add Product`s Id: ");
                String newProductId = scanner.next();
                System.out.println("Add Buyer`s Id: ");
                String newBuyerId = scanner.next();
                bidConverter.bidInsert(newBid, newProductId, newBuyerId);
                break;
            case 5:
                System.out.println("There are all items of auction: ");
                System.out.println("SELLERS:");
                printer.print(sellerConverter.convert(sqlRequest.executeQuery("SELECT * FROM Seller")));
                System.out.println("BUYERS:");
                printer.print(buyerConverter.convert(sqlRequest.executeQuery("SELECT * FROM Buyer")));
                System.out.println("PRODUCTS:");
                printer.print(productConverter.convert(sqlRequest.executeQuery("SELECT * FROM product")));
                System.out.println("BIDS:");
                printer.print(bidConverter.convert(sqlRequest.executeQuery("SELECT * FROM bid")));
                break;
            case 6:
                sqlRequest.reset();
                break;
            default:
                System.out.println("Enter right command!");
                break;
        }
    }
}