package com.String;

import java.util.Scanner;

//使用nextLine()方法的时候会有一个问题，nextLine()在读取到回车键之后会结束！
//使用next()方法会导致数据不完整!
public class StringNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String nextLine = sc.nextLine();
    }
}
