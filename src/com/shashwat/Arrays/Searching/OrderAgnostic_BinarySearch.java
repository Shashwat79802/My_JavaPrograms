package com.shashwat.Arrays.Searching;

public class OrderAgnostic_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1000, 556, 105, 100, 99, 89, 45, 8, 5, 2, 1};
        int target = 8, ans = orderAgnostic_bs(arr, target);

        if (ans == -1)
            System.out.println("\nTarget element not found!!!");
        else
            System.out.println("\nTarget element is in index: " + ans);

    }

    static int orderAgnostic_bs(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            else if (arr[start] < arr[end]) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }
}
