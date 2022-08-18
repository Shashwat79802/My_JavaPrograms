package com.shashwat.Functions;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter numb: ");
        int n = in.nextInt();

        if (palin_check(n))
            System.out.println(n + " is Palindrome");
        else
            System.out.println(n + " is not Palindrome");
    }

    static boolean palin_check (int n)
    {
        int temp = n, rev = 0;

        while (temp != 0)
        {
            int LD = temp % 10;
            rev = rev *  10 + LD;
            temp /= 10;
        }

        return rev == n;
    }
}
