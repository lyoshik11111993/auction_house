package com.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reader {
    public List<String> sellers() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuctionHouse", "root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Seller");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Seller> sellers = new ArrayList<>();
        while (resultSet.next()){
            Seller seller = new Seller(resultSet.getInt(1), resultSet.getString(2));
            sellers.add(seller);
        }
        return sellers.stream().map(element -> "Id = " + element.getId()+ " | Name = " + element.getName()).collect(Collectors.toList());
    }

    public List<String> buyers() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuctionHouse", "root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Buyer");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Buyer> buyers = new ArrayList<>();
        while (resultSet.next()){
            Buyer buyer = new Buyer(resultSet.getInt(1), resultSet.getString(2));
            buyers.add(buyer);
        }
        return buyers.stream().map(element -> "Id = " + element.getId()+ " | Name = " + element.getName()).collect(Collectors.toList());
    }

    public List<String> products() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuctionHouse", "root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Product> products = new ArrayList<>();
        while (resultSet.next()){
            Product product = new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
            products.add(product);
        }
        return products.stream().map(element -> "Id = " + element.getId() +
                " | Name = " + element.getName() + " | Seller`s Id = " + element.getSellerId())
                .collect(Collectors.toList());
    }

    public List<String> bids() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuctionHouse", "root", "");
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM bid");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Bid> bids = new ArrayList<>();
        while (resultSet.next()){
            Bid bid = new Bid(resultSet.getInt(1), resultSet.getString(2),
                    resultSet.getInt(3), resultSet.getInt(4),
                    resultSet.getInt(5), resultSet.getInt(6),
                    resultSet.getInt(7), resultSet.getInt(8),
                    resultSet.getInt(9));
                bids.add(bid);
        }
        return bids.stream().map(element -> "Id = " + element.getId()+
                " | Name = " + element.getName() + " | Product`s Id = " + element.getProductId() +
                " | Buyer`s Id = " + element.getBuyerId() + " | First Bet = " + element.getFirstBet() +
                " | Second Bet = " + element.getSecondBet() + " | Third Bet = " + element.getThirdBet() +
                " | Fourth Bet = " +element.getFourthBet() + " | Last Bet = " + element.getLastBet())
                .collect(Collectors.toList());
    }

    public void print(List<String> list){
        list.forEach(System.out::println);
    }
}
