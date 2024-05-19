package com.practice;

public class StudentTest {
    public static void main(String[] args) {
        // 这里是对自己所创建的类进行使用，和使用java自带的类方法差不多~
        Sutdent_code sutdent = new Sutdent_code();
        System.out.println(sutdent.age);
        System.out.println(sutdent.name);
        sutdent.setAge(sutdent.age);
    }
}
