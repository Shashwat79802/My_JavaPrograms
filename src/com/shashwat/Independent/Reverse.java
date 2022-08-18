package com.shashwat.Independent;

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter the no. to reverse it: ");
        long num = in.nextLong();
        long rev = 0, num2 = num;

        while (num != 0)
        {
            int a = (int)(num % 10);
            rev = rev * 10 + a;
            num /= 10;
        }
        System.out.println("The reverse of " + num2 + " is " + rev);
    }
}
