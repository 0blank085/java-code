package com.practice;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        book.id = "001";
        book.name = "三国杀";
        book.price = 88.88;
        book.Show(book.id, book.name, book.price);
    }
}
