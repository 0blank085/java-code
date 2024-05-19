package com.StringBuilder;
/*
    StringBuilder常用的方法:
        1.public StringBuilder append(任意类型) : 添加数据,并返回对象自己!
        2.public StringBuilder reverse(): 将缓冲区的内容进行反转！
        3.public int length() : 返回字符串长度!
        4.public String toString() : 将缓冲区的内容, 以String字符串类型返回!
 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //1.
        StringBuilder s1 = new StringBuilder();
//        StringBuilder s2 = s1.append("Hello");
//        s2.append("World");
//        综上所述
//        // 链式编程: 调用的方法是对返回的是对象时才可以继续向下调用方法!
//        s1.append("Hello").append("World").append("\n");
//        System.out.println(s1);
//        //字面意义上的反转!!! 例如 1234 变为 4321
//        s1.reverse();
//        System.out.println(s1);
        s1.append("Hello").append("World").append("\n");
        System.out.println(s1);
        // 情况: 数据在StringBuilder当中，需要调用方法时StringBuilder中没有我们所需要的方法且String中有时
        // 解决: 转换为String, 在调用
        String result = s1.toString();
        String[] words = result.split("l");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
