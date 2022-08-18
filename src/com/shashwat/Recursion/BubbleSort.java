package com.shashwat.Recursion;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {

        int[] arr = {1, 4, 45, 6, 10, 8};

        bubbleSort(arr, arr.length - 1);
        System.out.println("After sorting " + Arrays.toString(arr));
    }

    static void bubbleSort (int[] arr, int n) {

        if (n == 1)
            return;

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] > arr[i+1]) {

                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
        }

        if (count == 0)
            return;

        bubbleSort(arr, n-1);
    }
}
