package com.shashwat.Functions;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter numb: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " = " + fact(n));
    }

    static long fact(int n)
    {
        long fact = 1;

        while (n != 0)
        {
            fact *= n;
            n--;
        }

        return fact;
    }
}
