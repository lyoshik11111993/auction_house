package com.example.Converters;

import com.example.ClassesOfObjects.Buyer;
import com.example.SQLRequest;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BuyerConverter {
    private SQLRequest sqlRequest = new SQLRequest();

    public BuyerConverter() throws SQLException {
    }

    public List<Buyer> convert(ResultSet resultSet) throws SQLException {
        List<Buyer> list = new ArrayList<>();
        while (resultSet.next()){
            list.add(convertSingle(resultSet));
        }
        return list;
    }

    private Buyer convertSingle(ResultSet resultSet) throws SQLException{
        return new Buyer(resultSet.getInt(1), resultSet.getString(2));
    }

    public void buyerInsert(String x){
        sqlRequest.update("INSERT INTO Buyer (`Name`) VALUES (?)", x);
    }
}
