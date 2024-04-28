package com.day05.array;

public class arrayTest4 {
    public static void main(String[] args) {
        // 判断最大值
        int[] arr = {1,5,2,56,6,333,2,123,22};
        int[] arr1 = {1111,5,2,56,6,333,2,123,22};
//        int max = getmax(arr);
        int max = getmax(arr1);
        int Avg= getAvg(arr1);
        System.out.println("arr中的最大值为" + max);
        System.out.println("arr的平均值为" + Avg);
    }
    public static int getmax(int[] arr) {
        int j = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (j < arr[i]) {
                j = arr[i];
            }
        }
        return j;
    }
    public static int getAvg(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j = j + arr[i];
        }
        j = j / arr.length;
        return j;
    }
}