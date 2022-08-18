package com.shashwat.Arrays.ArrayCodes;

import java.util.Scanner;

public class Max_Min_inArray
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the numb of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }

        System.out.println("The maximum value in the array is: " + max(arr));
        System.out.println("The minimum value in the array is: " + min(arr));
    }

    static int max(int[] arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static int min(int[] arr)
    {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
