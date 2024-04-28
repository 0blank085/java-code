package com.parctice;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        System.out.print("请输入评委人数:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(true) {
            if (i <= 0) {
                System.out.println("输入错误，请重新输入");
                i = sc.nextInt();
            }
            else {
                break;
            }
        }
        int avg = GetAvg(i);
        System.out.println("平均分为:" + avg);
    }
    public static int GetAvg(int i ){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[i];
        for (int j = 0; j < i; j++) {
            System.out.print("请第" + (j + 1) + "位评委打分:");
            int k = sc.nextInt();
            if (k < 0 || k > 100) {
                System.out.println("输入有误，请重新输入");
                k = sc.nextInt();
            }
            arr[j] = k;
        }
        int min = getmin(arr);
        int max = getmax(arr);
        int sum = 0;
        int avg;
        for (int j = 0; j < arr.length; j++) {
           sum += arr[j];
        }
        avg = (sum - min - max) / (arr.length - 2);
        return avg;
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
    public static int getmin(int[] arr) {
        int j = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (j > arr[i]) {
                j = arr[i];
            }
        }
        return j;
    }
}
