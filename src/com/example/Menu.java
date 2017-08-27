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

    public Menu() throws SQLException {
    }

    public void menubar() {
        System.out.println("Hello! Welcome to our auction house! Make your choise: ");
        System.out.println("Press '1' for insert new sellers");
        System.out.println("Press '2' for insert new buyers");
        System.out.println("Press '3' for insert new products");
        System.out.println("Press '4' for insert new bids");
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
            default:
                System.out.println("Enter right command!");
                break;
        }
    }
}
