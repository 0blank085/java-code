package com.test;

import java.util.Scanner;

/*
    案例: 控制台输入字符串判断其是否为对称字符串！
 */
public class StringBuilderTest1 {
    public static void main(String[] args) {
        System.out.print("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        String s1 = str.substring(0, len/2);
        String s2 = str.substring(len/2);
        StringBuilder sb = new StringBuilder(s2).reverse();
        String s3 = sb.toString();
        System.out.print("此字符串是否为对称字符串:");
        if(s1.equals(s3)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
