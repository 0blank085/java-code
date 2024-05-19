package com.test;

import java.util.Scanner;

/*
    案例: 输入一串电话号码自动屏蔽中间四位数字!
 */
public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入11位数字的正确电话号码:");
        String s = sc.nextLine();
        while (true) {
            if (s.length() < 11) {
                System.out.print("您输入的电话号码不符合标准,请输入11位数字的正确电话号码:");
                s = sc.nextLine();
            }
            else{
                String s1 = s.substring(0,3);
                String s2 = s.substring(7);
                System.out.println("您输入的电话号码为:" + s1 + "****" + s2);
                break;
            }
        }
    }
}
