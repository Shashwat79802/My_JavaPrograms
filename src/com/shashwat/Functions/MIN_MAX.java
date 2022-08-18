package com.shashwat.Functions;

import java.util.Scanner;

public class MIN_MAX
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter 3 numbs to get min & max: ");
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        int min = Min(a, b, c);
        int max = Max(a, b, c);

        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
    }

    static int Min(int a, int b, int c)
    {
        int min = Max(a,b,c);

        if (min > a)
            min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;

        return min;
    }
    static int Max(int a, int b, int c)
    {
        int max = 0;

        if (max < a)
            max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;

        return max;
    }
}
