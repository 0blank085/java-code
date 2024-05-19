package com.practice;

/*
    使用场景: 成员变量和局部变量名重名时使用, 在Java中this使用的就近原则

    this 可以区分成员变量和局部变量重名问题
    --------------------------------------------

    this 可以调用本类成员（变量，方法）
    this.本类成员变量
    this.本类成员方法
    --------------------------------------------

    this.的省略规则:  本类成员方法: 没有条件，this.可以直接省略
                    本类成员变量: 方法中没有出现重名的变量，this.  才可以省略

    this介绍: 代表当前类对象的引用(地址),谁调用this，this就代表谁.
*/
public class this_Demo {
    public static void main(String[] args) {
        Sutdent_code sutdent = new Sutdent_code();
//        成员变量
        sutdent.name = "fuck";
        sutdent.study("fffff");// name: "fffff" 为局部变量

    }
}
