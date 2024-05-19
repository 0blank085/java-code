package com.test;

import java.util.Scanner;

public class StringTest1 {
//    需求：可以验证用户登入，且共有三次机会，登陆成功或失败都要有反馈!
    public static void main(String[] args) {
        String name = "王德法";
        String password = "123456";
        int i = 3;
        int j = i;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name1 = sc.nextLine();
        System.out.println("请输入用户密码:");
        String password1 = sc.nextLine();
        while(j > 0) {
            if (name.equals(name1)) {
                if (password.equals(password1)) {
                    System.out.println("登陆成功！");
                    System.out.println("感谢您的使用！");
                    break;
                } else {
                    System.out.println("用户名或密码错误，请重新输入(您还有" + (i--) + "次机会)");
                    j--;
                    System.out.println("请输入用户名:");
                    name1 = sc.nextLine();
                    System.out.println("请输入用户密码:");
                    password1 = sc.nextLine();
                }
            } else {
                System.out.println("用户名或密码错误，请重新输入(您还有" + (i--) + "次机会)");
                j--;
                System.out.println("请输入用户名:");
                name1 = sc.nextLine();
                System.out.println("请输入用户密码:");
                password1 = sc.nextLine();
            }
        }
    }
}
