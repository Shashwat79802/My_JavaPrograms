package com.shashwat.Recursion.Searching;

public class LinearSearch {
    public static void main (String args[]) {

        int[] arr = {2, 4, 1, 8, 6, 0};
        int target = 5;

        System.out.println("Target is at: " + search(arr, target, 0));
    }

    public static int search (int[] arr, int target, int idx) {

        if (idx == arr.length)
            return -1;               //-1 means target doesn't exist in the array

        if (arr[idx] == target)
            return idx;

        return search (arr, target,idx + 1);
    }
}
