package com.shashwat.Arrays.Searching;

public class InfiniteArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,5,6,7,9,15,18,20,25,35,48,49,50,54,57,62,73,88,95,100,120,121,123};
        int target = 50;

        int ans = infinite_bs(arr, target);

        if (ans == -1)
            System.out.println("Element not found!!!");
        else
            System.out.println("Element is in index " + ans);
    }

    static int infinite_bs(int[] arr, int target){

        int start = 0, end = 1;

        while (start <= end) {

            if (target >= arr[start] && target <= arr[end]) {

                int mid = start + (end - start) / 2;

                if (target == arr[mid])
                    return mid;

                else if (target > arr[mid])
                    start = mid + 1;

                else
                    end = mid - 1;
            }

            else {
                start = end + 1;
                end = start * 2 + 1;
            }
        }
        return -1;
    }
}
