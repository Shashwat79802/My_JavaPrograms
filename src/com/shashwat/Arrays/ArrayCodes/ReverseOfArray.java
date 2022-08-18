package com.shashwat.Arrays.ArrayCodes;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the numb of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("\nArray before reverse: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Array after reverse:  " + Arrays.toString(arr));

    }

    static void reverse (int[] arr)
    {
        int len = arr.length/2, end = arr.length-1;

        for (int start = 0; start < len; start++)
        {
            int rev = arr[start];
            arr[start] = arr[end];
            arr[end] = rev;
            end--;
        }
    }
}
