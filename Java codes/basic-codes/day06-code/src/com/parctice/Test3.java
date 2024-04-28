package com.parctice;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = {11,22,33};
        boolean check = CheckArray(arr1,arr2);
        System.out.println(check);
    }
    public static boolean CheckArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr1.length ) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
