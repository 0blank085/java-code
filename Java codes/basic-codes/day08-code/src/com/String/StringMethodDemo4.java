package com.String;

import org.w3c.dom.ls.LSOutput;

/*
    String类的替换方法:
        public String replace(CharSequence target, CharSequence replacement)

                        参数1: 旧值
                        参数2: 新值

                   有返回值,需要新的字符串变量存储!
 */
public class StringMethodDemo4 {
    public static void main(String[] args) {
        String s = "wangchao";
        String replace = s.replace("wangchao", "chao");
        System.out.println(replace);
    }
}
