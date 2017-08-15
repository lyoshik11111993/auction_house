package com.example;

public class Product {
    private int id;
    private String name;
    private int sellerId;

    public Product(int id, String name, int sellerId){
        this.id = id;
        this.name = name;
        this.sellerId = sellerId;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSellerId(){
        return sellerId;
    }

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName() + " | Seller`s Id = " + getSellerId();
    }
}
