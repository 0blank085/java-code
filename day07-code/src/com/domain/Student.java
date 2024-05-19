package com.domain;
//JavaBean 的写法
public class Student {
//    成员变量私有化
    private String name;
    private int age;
    //    构造方法 空参 有参

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//    对于私有化的成员变量提供setXXX 和 getXXX 方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

