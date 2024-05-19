package com.String;
/*
    String类的截取方法:
        public String substring(int beginIndex) 根据输入的索引号位置开始截取字符串到字符串结尾
        public String substring(int beginIndex, int endIndex) 从 beginIndex 开始截取 , 到 endIndex 结束
        注意: 使用该方法时是放回一个新的字符串，所以需要创建一个字符串存放新的字符串!
 */
public class StringMethodDemo3 {
    public static void main(String[] args) {
        String name = "wangchao";
        String s1 = name.substring(0, 2);
        String s2 = name.substring(2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
