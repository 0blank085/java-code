package com.String;
/*
    String类用于遍历的方法:
        public char[] toCharArray() 将此字符串转换为一个字符数组

        public char charAt(int index) 通过索引号遍历字符串
 */
public class StringMethodDemo2 {
    public static void main(String[] args) {

    }

    private static void print2() {
        String name = "wangchao";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }

    private static/* 如果编写方法和主方法是平级的则需要加 static */ void print1() {
        String name = "wangchao";
        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}
