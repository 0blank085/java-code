package com.parctice;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum = getSum(arr);
        System.out.println("数组中符合条件的数的和为" + sum);
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
