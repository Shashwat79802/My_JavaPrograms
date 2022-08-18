package com.shashwat.Arrays.Searching;

import java.util.*;

public class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the size of array: ");
        int n = in.nextInt();

        int[] nums = new int[n];

        if (n>0) {
            System.out.print("Enter the elements: ");
            for (int ele = 0; ele < n; ele++)
                nums[ele] = in.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        int ans = linearSearch(nums, target);

        if(ans==-1)
            System.out.print("\nEmpty Array!!");
        else if (ans==-2)
            System.out.print("\nTarget Element not found!!");
        else
            System.out.println("\nTarget element is in index " + ans);
    }

    static int linearSearch(int[] arr, int target)
    {
        if (arr.length==0)
            return -1;

        for (int index = 0; index < arr.length; index++ ){
            if (arr[index]==target)
                return index;
        }

        return -2;
    }
}
