package com.shashwat;

import java.util.Scanner;

public class Occurrence
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the no.: ");
        long num = in.nextLong();
        long num2 = num;

        System.out.print("Enter the no. to count it's occurrence: ");
        int n = in.nextInt();
        int count = 0;

        while (num != 0)
        {
            int a = (int)(num % 10);

            if (a == n)
            {
                count++;
            }
            num /= 10;
        }
        System.out.println("\nThe occurrence of " + n + " in " + num2 + " is: " + count);
    }
}
