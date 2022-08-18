package com.shashwat.Functions;

import java.util.Scanner;

public class PrimeNumbs_inGivenRange
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter from: ");
        int from = in.nextInt();
        System.out.print("Enter to: ");
        int to = in.nextInt();

        System.out.println("The prime no.s in the entered range are: ");
        for (int i = from; i <= to; i++){
            if (AllPrime(i))
                System.out.println(i);
        }
    }

    static boolean AllPrime (int i)
    {
        int c = 2, prime = 0;

        if (i == 0 || i ==1)
            return false;

        while (c*c <= i)
        {
            if (i % c == 0)
            {
                prime = 1;
                break;
            }
            c++;
        }
        return prime == 0;
    }
}

