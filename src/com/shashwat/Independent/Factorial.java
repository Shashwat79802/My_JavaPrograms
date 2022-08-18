package com.shashwat.Independent;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter no. to get it's factorial: ");
        int n = in.nextInt();
        long fact = 1;

        for( int i = 1; i <= n; i++ )
        {
            fact *= i;
        }

        System.out.println("The factorial of " + n + " is " + fact);
    }
}
