package com.example;

import java.sql.*;

public class SQLRequest {
    private final Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AuctionHouse", "root", "");

    public SQLRequest() throws SQLException {
    }

    public ResultSet executeQuery(String sql){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return  preparedStatement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int update(String sql, String x){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            if (sql.contains("?")) {
                preparedStatement.setString(1, x);
                return  preparedStatement.executeUpdate();
            } else {
                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int update(String sql, String x, String y){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            if (sql.contains("?")) {
                preparedStatement.setString(1, x);
                preparedStatement.setString(2, y);
                return  preparedStatement.executeUpdate();
            } else {
                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int update(String sql, String x, String y, String z){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            if (sql.contains("?")) {
                preparedStatement.setString(1, x);
                preparedStatement.setString(2, y);
                preparedStatement.setString(3, z);
                return  preparedStatement.executeUpdate();
            } else {
                return preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //Method for resetting all my additions. May be called in case necessity.
    public void reset() throws SQLException {
        PreparedStatement sellerReset = connection.prepareStatement("DELETE FROM Seller WHERE ID>5");
        sellerReset.executeUpdate();
        PreparedStatement buyerReset = connection.prepareStatement("DELETE FROM Buyer WHERE ID>10");
        buyerReset.executeUpdate();
        PreparedStatement productReset = connection.prepareStatement("DELETE FROM Product WHERE ID>10");
        productReset.executeUpdate();
        PreparedStatement bidReset = connection.prepareStatement("DELETE FROM Bid WHERE ID>10");
        bidReset.executeUpdate();
    }
}
