package com.shashwat.Arrays.Sorting;

import java.util.Arrays;
import java.util.*;

public class Solution
{
    public static void main(String[] args){

        int[] intervals = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(intervals, 9)));
    }

    static int[] twoSum(int[] arr, int target) {

        int i;

        for (i = 0; i < arr.length; i++) {

            int ans = binarySearch (arr, target - arr[i], i+1, arr.length - 1);

            if (ans > -1){
                return new int[] {i+1, ans+1};
            }
        }

        return new int[] {};
    }

    static int binarySearch (int[] arr, int target, int start, int end) {

        while (start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == target)
                return mid;

            else if (arr[mid] < target)
                start = mid + 1;

            else
                end = mid - 1;
        }
        return -1;
    }
}
