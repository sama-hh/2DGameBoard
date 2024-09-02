package org.example;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(5));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(2));
    }

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        if( n > 1) {
            for (int i = 2; i < arr.length; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr[n];
    }

}
