package com.enpacsulation;
/*
    1.成员变量的私有化(为了保证数据的安全)

    2.使用时通常是根据私有化的对象设置setXXX和getXXX方法进行使用
*/
public class student {
    private int age;
    public void setAge(int age) {
        if (age > 0 && age < 256) {
            this.age = age;
        }
        else {
            System.out.println("您输入数据有错误,人类的目前年龄界限为0~256岁!");
        }
    }
    public int getAge() {
        return age;
    }
}
