package com.example;

import com.example.Converters.BidConverter;
import com.example.Converters.BuyerConverter;
import com.example.Converters.ProductConverter;
import com.example.Converters.SellerConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.sql.SQLException;
import java.util.Scanner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class MenuTest {

    Scanner scanner = new Scanner(System.in);
    SQLRequest sqlRequest = new SQLRequest();
    Printer printer = new Printer();
    @Mock
    SellerConverter sellerConverter;
    @Mock
    BuyerConverter buyerConverter;
    @Mock
    ProductConverter productConverter;
    @Mock
    BidConverter bidConverter;

    public MenuTest() throws SQLException {
    }

    @Test
    public void menubar() throws SQLException {

    }

}