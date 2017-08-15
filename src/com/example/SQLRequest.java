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
}
