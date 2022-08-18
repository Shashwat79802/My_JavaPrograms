package com.shashwat.Functions;

import java.util.Scanner;

public class Prime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter no. to check prime: ");
        int num = in.nextInt();

        int prime = prime_check(num);

        if (num == 0 || num == 1)
            System.out.println(num + " is neither prime nor composite...");
        else if (prime == 1)

            System.out.println(num + " is not prime...");
        else
            System.out.println(num + " is prime...");
    }

    static int prime_check(int n)
    {
        int c = 2, prime = 0;

        while (c*c <= n)
        {
            if (n % c == 0)
            {
                prime = 1;
                break;
            }
            c++;
        }
        return prime;
    }

}


