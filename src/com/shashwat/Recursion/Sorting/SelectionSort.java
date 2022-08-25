package com.shashwat.Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {

        int[] arr = {9, 5, 4, 1, 0};
        sort(arr, arr.length, 0, 0);

        System.out.println("Array after sorting is: " + Arrays.toString(arr));
    }

    public static void sort(int[] arr, int len, int maxIdx, int idx) {

        if (len == 0)
            return;

        else if (idx < len) {
            if (arr[maxIdx] < arr[idx]){
                maxIdx = idx;
            }

            sort(arr, len, maxIdx, idx + 1);
        }

        else {
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[len-1];
            arr[len-1] = temp;

            sort(arr, len - 1, 0, 0);
        }
    }
}
