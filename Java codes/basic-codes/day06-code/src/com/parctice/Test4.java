package com.parctice;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int Check = CheckArrayIndex(arr,j);
        System.out.println(Check);
    }
    public static int CheckArrayIndex(int[] arr, int j) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == j) {
                index = i;
            }
        }
        return index;
    }
}
