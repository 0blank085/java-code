package com.practice;
/*
            前提: java 中创建对象必须要有类的存在!

            类: 一组相关属性和行为的集合
            对象: 是根据类创建出来的实体

            类和对象的关系:

                1）依赖关系: 对象的创建需要一类为前提
                2）数量关系: 根据一个类可以创建读个对象，但是一个对象只能有一个类

            属性(名词): 在代码中使用成员变量显示，成员变量跟之前定义变量一样，只不过位置发生了改变，在类中则在方法外
            行为(动词): 在代码中使用成员方法表示，成员方法跟之前定义方法的格式一样，只不过需要去掉 static 关键字

        */
public class Sutdent_code {

    /*
    变量的注意事项:

    1.变量名不可以重复定义

    2.一条语句，可以定义出多个变量，中间使用 , 号链接分隔

    3.变量在使用之前，必须完成赋值

    4.变量使用是要注意变量的适用范围
        */

//    属性
    int age = 23;
    String name = "梨花";
//    行为
    public void study(String name) {
        System.out.println("学习成绩" + name);
        // 此处this用于this_Demo中的演示
        System.out.println("学习成绩" + this.name);
    }

    public void setAge(int age) {
        System.out.println("学生年龄为" + age);
    }
}
