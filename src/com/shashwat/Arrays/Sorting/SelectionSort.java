package com.shashwat.Arrays.Sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main (String[] args){

        int[] arr = {-10, -15, 24, -4, 0, 5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++){
            int maxIdx = maxInArray(arr, arr.length-i);
            int lastIdx = arr.length - i - 1;
            swap(arr, maxIdx, lastIdx);
            }
    }
    static void swap (int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int maxInArray(int[] arr, int len)
    {
        int maxIdx = 0;
        for (int i = 0; i < len; i++){
            if (arr[i] > arr[maxIdx])
                maxIdx = i;
        }
        return maxIdx;
    }
}