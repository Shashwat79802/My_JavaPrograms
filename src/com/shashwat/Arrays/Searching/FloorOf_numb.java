package com.shashwat.Arrays.Searching;

public class FloorOf_numb
{
    public static void main(String[] args){
        int[] arr = {1, 3, 4, 6, 7, 9, 10, 12, 14, 15, 16, 18, 19, 21, 22, 24};
        int target = 20, ans = floor(arr, target);

        if(ans == -1)
            System.out.println("Floor doesn't exists for the target!!!");
        else
            System.out.println("The floor of "+target+" is "+ans);
    }

    static int floor(int[] arr, int target)
    {
        int start = 0, end = arr.length - 1;

        if (target < arr[start])
            return -1;

        else if (target > arr[end])
            return arr[end];

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
        return arr[end];
    }
}
