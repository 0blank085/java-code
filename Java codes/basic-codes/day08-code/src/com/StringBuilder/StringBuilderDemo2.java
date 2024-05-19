package com.StringBuilder;
/*
    StringBuilder介绍:
        1.一个可变的字符序列
        2.StringBuilder是字符串缓冲区,将其理解为容器,这个容器可以存储任意的数据类型，但是只要进入这个容器，全部变成字符串。

    StringBuilder的构造方法:
        public StringBuilder() : 创建一个空白的字符串缓冲区(容器), 其初始容量为16个字符
        public StringBuilder(String str) : 创建字符串缓冲区时是可以自带参数的!
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("1111");
        //下面体现了可变!
//        System.out.println(s1);
//        s1.append("Hello");
//        System.out.println(s1);
//        s1.append("World");
//        System.out.println(s1);

        // 这里体现了StringBuilder会自动扩容
//        s1.append("12345678901234567890");
//        System.out.println(s1);
        System.out.println(s1);
    }
}
