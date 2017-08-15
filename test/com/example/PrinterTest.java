package com.example;

import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.*;

public class PrinterTest {

    Printer printer = new Printer();

    @Test
    public void sellersTest() throws SQLException {
        printer.sellers();
        assertFalse(printer.sellers().isEmpty());
        assertEquals(printer.sellers().size(), 5);
        assertEquals(printer.sellers().get(0), "Id = 1 | Name = Rob");
    }

    @Test
    public void buyersTest() throws SQLException {
        printer.buyers();
        assertFalse(printer.buyers().isEmpty());
        assertEquals(printer.buyers().size(), 10);
        assertEquals(printer.buyers().get(0), "Id = 1 | Name = Felicia");
    }

    @Test
    public void productsTest() throws SQLException {
        printer.products();
        assertFalse(printer.products().isEmpty());
        assertEquals(printer.products().size(), 10);
        assertEquals(printer.products().get(2), "Id = 3 | Name = sword | Seller`s Id = 4");
    }

    @Test
    public void bidsTest() throws SQLException {
        printer.bids();
        assertFalse(printer.bids().isEmpty());
        assertEquals(printer.bids().size(), 10);;
    }

}