package com.shashwat.Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort
{
//    public static void main(String[] args) {
//
//        int[] arr = {1, 4, 45, 6, 10, 8};
//
//        bubbleSort(arr, arr.length - 1);
//        System.out.println("After sorting " + Arrays.toString(arr));
//    }
//
//    static void bubbleSort (int[] arr, int n) {
//
//        if (n == 1)
//            return;
//
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            if (arr[i] > arr[i+1]) {
//
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//                count++;
//            }
//        }
//
//        if (count == 0)
//            return;
//
//        bubbleSort(arr, n-1);
//    }
// ---------------------------------------------------------------------------------------------------------------------

    public static void main (String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, arr.length-1, 0);

        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    static void sort(int[] arr, int len, int idx) {

        if (len == 0)
            return;

        if (idx == len) {
            sort(arr, len - 1, 0);
        }
        else if (arr[idx] > arr[idx + 1]){
            int temp = arr[idx];
            arr[idx] = arr[idx+1];
            arr[idx+1] = temp;

            sort(arr, len, idx + 1);
        }
    }
}
