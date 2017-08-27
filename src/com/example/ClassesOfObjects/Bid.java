package com.example.ClassesOfObjects;

public class Bid {
    private int id;
    private int size;
    public int productId;
    public int buyerId;


    public Bid(int id, int size, int productId, int buyerId){
        this.id = id;
        this.size = size;
        this.productId = productId;
        this.buyerId = buyerId;
    }

    public int getId(){
        return id;
    }

    public int getSize(){
        return size;
    }

    public int getProductId() {
        return productId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Bid`s Size = " + getSize() +
                " | Product`s Id = " + getProductId() + " | Buyer`s Id = " + getBuyerId();
    }
}
