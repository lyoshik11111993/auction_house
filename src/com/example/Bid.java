package com.example;

public class Bid {
    private int id;
    private String name;
    public int productId;
    public int buyerId;
    public int firstBet;
    public int secondBet;
    public int thirdBet;
    public int fourthBet;
    public int lastBet;

    public Bid(int id, String name, int productId, int buyerId, int firstBet, int secondBet,
               int thirdBet, int fourthBet, int lastBet){
        this.id = id;
        this.name = name;
        this.productId = productId;
        this.buyerId = buyerId;
        this.firstBet = firstBet;
        this.secondBet = secondBet;
        this.thirdBet = thirdBet;
        this.fourthBet = fourthBet;
        this.lastBet = lastBet;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public int getFirstBet() {
        return firstBet;
    }

    public int getSecondBet() {
        return secondBet;
    }

    public int getThirdBet() {
        return thirdBet;
    }

    public int getFourthBet() {
        return fourthBet;
    }

    public int getLastBet() {
        return lastBet;
    }
}
