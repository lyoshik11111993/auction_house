package com.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Printer<T> {

    public void print(List<T> list){
        list.forEach(System.out::println);
    }
}
