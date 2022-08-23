package com.shashwat.Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 4;

        System.out.println("The target is at index: " + bs(arr, target, 0, arr.length-1));
    }

    static int bs(int[] arr, int target, int start, int end) {

        if (start > end)
            return -1;

        int mid = start + (end - start)/2;

        if (target == arr[mid])
            return mid;

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid])
                return bs(arr, target, start, mid-1);
            else
                return bs(arr, target, mid+1, end);
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return bs(arr, target, mid+1, end);
        }
        return bs(arr, target, start, mid-1);
    }
}
