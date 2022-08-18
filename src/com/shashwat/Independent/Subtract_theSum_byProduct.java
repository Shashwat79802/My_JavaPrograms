package com.shashwat.Independent;

import java.util.Scanner;

public class Subtract_theSum_byProduct
{
    public static void main(String[] agrs)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no.: ");
        int num = in.nextInt();
        int prod = 1, sum = 0;

        while( num != 0 )
        {
            int a = num % 10;
            sum += a;
            prod *= a;

            num /= 10;
        }

        System.out.println("\nThe output is " + (prod-sum));
    }
}
