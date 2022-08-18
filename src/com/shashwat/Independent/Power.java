package com.shashwat.Independent;

import java.util.Scanner;

public class Power
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num: ");
        int n = in.nextInt();

        System.out.print("Enter the power: ");
        int pow = in.nextInt();
        int ans = 1;

        for (int i = 1; i <= pow; i++)
        {
            ans *= n;
        }
        System.out.print("\n" + n + " power " + pow + " = " + ans);
    }
}
