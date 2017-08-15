package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SellerConverter {
    public List<Seller> convert(ResultSet resultSet) throws SQLException {
        List<Seller> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Seller convertSingle(ResultSet resultSet) throws SQLException{
        return new Seller(resultSet.getInt(1), resultSet.getString(2));
    }
}
