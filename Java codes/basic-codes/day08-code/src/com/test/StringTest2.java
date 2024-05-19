package com.test;

import java.util.Scanner;
/*
    案例: 输入一串字符串判断有多少个小写字符，大写字符，数字字符，其他字符不算!
 */
public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int word = 0,Word = 0,num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                word++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                Word++;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num++;
            }
        }
        System.out.println("小写字母数为:" + word);
        System.out.println("大写字母数为:" + Word);
        System.out.println("数字字母数为:" + num);
    }
}
