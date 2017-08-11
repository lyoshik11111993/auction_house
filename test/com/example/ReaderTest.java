package com.example;

import org.junit.Test;
import java.sql.SQLException;
import static org.junit.Assert.*;

public class ReaderTest {

    Reader reader = new Reader();

    @Test
    public void sellersTest() throws SQLException {
        reader.sellers();
        assertFalse(reader.sellers().isEmpty());
        assertEquals(reader.sellers().size(), 5);
        assertEquals(reader.sellers().get(0), "Id = 1 | Name = Rob");
    }

    @Test
    public void buyersTest() throws SQLException {
        reader.buyers();
        assertFalse(reader.buyers().isEmpty());
        assertEquals(reader.buyers().size(), 10);
        assertEquals(reader.buyers().get(0), "Id = 1 | Name = Felicia");
    }

    @Test
    public void productsTest() throws SQLException {
        reader.products();
        assertFalse(reader.products().isEmpty());
        assertEquals(reader.products().size(), 10);
        assertEquals(reader.products().get(2), "Id = 3 | Name = sword | Seller`s Id = 4");
    }

    @Test
    public void bidsTest() throws SQLException {
        reader.bids();
        assertFalse(reader.bids().isEmpty());
        assertEquals(reader.bids().size(), 10);
        assertTrue(reader.bids().get(0).contains("dress"));
    }

}