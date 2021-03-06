package com.example.ClassesOfObjects;

public class Seller {
    private int id;
    private String name;

    public Seller(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Id = " + getId()+ " | Name = " + getName();
    }
}
