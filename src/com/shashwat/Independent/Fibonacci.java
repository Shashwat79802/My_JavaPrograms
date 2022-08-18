package com.shashwat.Independent;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter limit of Fibonacci Series: ");
        int n = in.nextInt();

        int f = 0, s = 1, t;

        System.out.print("\nFibonacci Series: " + f + " " + s);

        for (int i = 2; i < n; i++)
        {
            t = f + s;
            System.out.print(" " + t);
            f = s;
            s = t;
        }
        System.out.println("\n");
    }
}
