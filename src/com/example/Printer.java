package com.example;

import java.util.List;

public class Printer<T> {

    public void print(List<T> list){
        list.forEach(System.out::println);
    }
}
