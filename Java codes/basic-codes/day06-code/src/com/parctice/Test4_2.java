package com.parctice;

import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
       int[] arr = {11,22,33,33,33,11,44};
       int[] arr1 = {};
       Scanner sc = new Scanner(System.in);
       int j = sc.nextInt();
       arr1 = CheckArrayIndex(arr,j);
       if(arr1.length == 0) {
           System.out.println("您要查找的数据在数组中不存在!");
       }
       else {
           for (int i = 0; i < arr1.length; i++) {
               System.out.println(arr1[i]);
           }
       }
    }
    public static int[] CheckArrayIndex(int[] arr, int j) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                count++;
            }
        }
        int[] result = new int[count];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                result[a] = i;
                a++;
            }
        }
        return result;
    }
}
