package com.String;

/*
    String类的切割方法:
        public String[] split(String regex) : 根据传入字符当作规则，切割当前字符串
        注意: '.'在 regex 中为通配符,想要使用'.'必须要写成 '\\.'的格式
 */
public class StringMethodDemo5 {
    public static void main(String[] args) {

        String s = "11.222.3333";

        String[] s1 = s.split("\\.");
       for ( int i = 0; i < s1.length; i++ ) {
           System.out.println(s1[i]);
       }
       String[] s2 = s.split(".");
       for ( int i = 0; i < s2.length; i++ ) {
           System.out.println(s2[i]);
       }
    }
}
