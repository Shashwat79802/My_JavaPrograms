package com.shashwat.Independent;

import java.util.Scanner;

public class SumOf_nums
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter no. to get their sum: ");
        while (true)
        {
            int num = in.nextInt();
            if (num == 0)
                break;
            else
                sum += num;
        }
        System.out.println("The sum is " + sum);
    }
}
