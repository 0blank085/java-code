package com.String;
/*
    String类的优点:
            1.Java 程序中所有的双引号字符串，都是String这个类的对象(属于是Java中唯一一个拥有这种特性的对象了)

            2.字符串一但被创建就不可更改其字符串内容了，若想更改只能使用新的对象进行替换.
            证明被放在studentDemo中

            3.String字符串虽然不可以改变，但是可以共享.
            字符串常量池：它的存在会导致字符串在使用双引号创建时会优先检查在字符串常量池中是否存在!
                    存在: 复用
                    不存在: 创建
*/
public class StringDemo1 {
    public static void main(String[] args) {
//        验证对象的方法
//        System.out.println("hello world".toUpperCase());

//        证明共享
//        String s1 = "aaa";
//        String s2 = "aaa";
//        System.out.println(s1 == s2);


    }
}
