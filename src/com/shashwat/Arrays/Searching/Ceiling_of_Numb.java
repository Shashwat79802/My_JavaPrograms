package com.shashwat.Arrays.Searching;

import org.w3c.dom.ls.LSOutput;

public class Ceiling_of_Numb
{
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 6, 7, 9, 10, 12, 14, 15, 16, 18, 19, 21, 22, 24};
        int target = 13, ans = ceiling(arr, target);

        if (ans == Integer.MAX_VALUE)
            System.out.println("Ceiling doesn't exists for the target number!!!");
        else
            System.out.println("The ceiling of "+target+" is "+ans);
    }

    static int ceiling(int[] arr, int target)
    {
        int start = 0, end = arr.length - 1;

        if (target < arr[start])
            return arr[start];

        else if(target > arr[end])
            return Integer.MAX_VALUE;

        while (start <= end)
        {
            int mid = start + (end - start)/2;

            if (arr[mid]==target)
                return arr[mid];

            else if (arr[mid]>target)
                end = mid - 1;

            else
                start = mid + 1;
        }
        return arr[start];
    }

}
