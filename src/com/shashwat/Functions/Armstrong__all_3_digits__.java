package com.shashwat.Functions;

import java.util.Scanner;

public class Armstrong__all_3_digits__
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("\nAll the 3 digits armstrong numbers are: ");

        for (int i = 100; i!= 1000; i++)
        {
            if(arms(i))
                System.out.println(i);
        }

    }

    static boolean arms(int n)
    {
            int temp = n, sum = 0;

            while (temp > 0)
            {
                int LD = temp % 10;
                sum += LD*LD*LD;
                temp /= 10;
            }
            return sum == n;
    }
}
