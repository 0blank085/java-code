package com.String;

import org.w3c.dom.ls.LSOutput;

/*
    String 类常见的方法:

        public String() : 创建一个空白字符串，里面不含任何内容
        public String(Char[] chs): 根据传入的字符数组，创建字符对象
        public String(String original): 根据传入的字符串，来创建字符串对象

        --------------------------------------------------------------
        问题和思考
        1.打印对象名时应该出现对象的地址值，但是在字符串对象中没有出现？
        2.使用以上三种方法都没有直接String s = "abc"来的快

        区别
        主要是体现字符串对象的两种创建方法的区别
        1.双引号直接创建
        2.通过构造方法创建

        使用双引号直接创建出来的字符串是存放在字符串常量池中的，而使用构造方法创建出来的字符串是在内存空间中又开辟了一块新的空间进行存放，所以两者最大的区别则是地址不同!

---------------------------------------------------------------------
*/
public class StringDemo2 {
    public static void main(String[] args) {
//        1.同上
    String s1 = new String();
        System.out.println(s1);
//    2.
    char[] chs = {'a', 'b', 'c'};
    String s2 = new String(chs);
        System.out.println(s2);
//    3.
    String s3 = new String("abc");
        System.out.println(s3);
    }
}
