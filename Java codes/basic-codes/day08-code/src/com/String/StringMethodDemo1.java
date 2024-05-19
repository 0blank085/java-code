package com.String;
/*
    String类中用于比较的方法 :

        public boolean equals(Object anObject) 将此字符串与指定的对象比较(主要用于比较字符串内容)

        public boolean equalsIgnoreCase(String anotherString) 将此String与另一个String比较，不考虑大小写
 */
public class StringMethodDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println("-------------------------------");
        String ss1 = "abc";
        String ss2 = "ABC";
        System.out.println(ss1.equals(ss2)); // false
        System.out.println(ss1.equalsIgnoreCase(ss2)); // true
        System.out.println("-------------------------------");
    }
}
