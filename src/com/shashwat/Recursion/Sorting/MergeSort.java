package com.shashwat.Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1};
        arr = sort(arr);   //A new object will be returned i.e. a new array
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    static int[] sort(int[] arr) {

        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        int[] ans = merge(left, right);

        return ans;
    }

    static int[] merge(int[] first, int[] second) {

        int i = 0, j = 0, k = 0;
        int[] ans = new int[first.length + second.length];

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            }
            else{
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            ans[k++] = first[i++];
        }

        while (j < second.length) {
            ans[k++] = second[j++];
        }

        return ans;
    }
}
