package com.parctice;

import java.sql.SQLOutput;

public class skip {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("数字"+ i + "跳过");
            }
        }
    }
}
