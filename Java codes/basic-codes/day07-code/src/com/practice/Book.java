package com.practice;

public class Book {
    String id;
    String name;
    double price;

    public void Show(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        System.out.println(id + " " + name + " " + price);
    }
}
