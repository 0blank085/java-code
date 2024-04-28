package com.day05.array;

// 判断数组 arr1 中的偶数并显示出来
// 数组的遍历
public class arrayTest3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int j = 0;
        for(int i = 0;i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(arr1[i]);

                // 偶数求和
                j = j + arr1[i];
            }
        }
        System.out.println("arr1 中偶数的和为" + j);
    }
}
