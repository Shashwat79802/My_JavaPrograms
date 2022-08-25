package com.shashwat.Recursion.Searching;

public class BinarySearch
{
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 6, 9, 15, 22, 28, 35, 41, 56};

        int ans = binarySearch(arr, 6, 0, arr.length-1);

        if (ans == -1){
            System.out.println("Target element is not in the array");
        }
        else
            System.out.println("Target is at index " + ans);
    }

    static int binarySearch(int[] arr, int target, int start, int end)
    {
        if (start > end)
            return -1;

        int mid = start + (end - start)/2;

        if (arr[mid] == target)
            return mid;

        if (arr[mid] > target)
            return binarySearch(arr, target, start, mid - 1);


        return binarySearch(arr, target, start + 1, end);

    }
}
