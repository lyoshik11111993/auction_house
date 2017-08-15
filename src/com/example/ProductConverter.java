package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductConverter {
    public List<Product> convert(ResultSet resultSet) throws SQLException {
        List<Product> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Product convertSingle(ResultSet resultSet) throws SQLException{
        return new Product(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
    }
}
