package com.test;

import java.util.Scanner;
/*
    案例: 屏蔽 TMD!
 */
public class StringTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.replace("TMD", "***");
        System.out.println(s1);
    }
}
