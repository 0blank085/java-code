package com.StringBuilder;

/*
    StringBuilder的作用: 提高字符串的操作效率
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        methon1();
    }

    private static void methon1() {
        long startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(i);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

    private static void methon() {
        //获取1970年1月1日0时0分0秒到现在的时间毫秒值 (1秒 = 1000毫秒)
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        System.out.println(s);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
