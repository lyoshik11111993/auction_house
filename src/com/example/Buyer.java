package com.example;

public class Buyer {
    private int id;
    private String name;

    public Buyer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
}
