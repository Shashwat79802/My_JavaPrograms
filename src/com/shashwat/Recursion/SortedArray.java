package com.shashwat.Recursion;

//The program checks if the provided array is sorted or not.
public class SortedArray
{
    public static void main (String args[]) {

        int[] arr = {1,2,3,4,5,6};

        System.out.println("The array is sorted? : " + sorted(arr, 0));
    }

     static boolean sorted (int[] arr, int idx) {

        if (idx+1 == arr.length)
            return true;

        return (arr[idx] < arr[idx+1] && sorted(arr, idx+1));
    }
}
