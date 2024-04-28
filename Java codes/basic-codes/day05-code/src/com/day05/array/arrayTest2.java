package com.day05.array;

public class arrayTest2 {
    public static void main(String[] args) {
        // 数组的完整格式
        // 数据类型【】 数组名 = new 数组名【】 {}；
        // 简化版
        // 数据类型【】 数组名 ={}；


        // 此处演示简化版
        int[] arr1 = {1,2,3};
        System.out.println(arr1[0]);



        // 错误
        /*[I@10f87f48
         @ 只是一个分隔符
         [ 代表数据为数组
         I 代表数据类型为 int 型
         后面的为地址
         */
        System.out.println(arr1);
    }
}
