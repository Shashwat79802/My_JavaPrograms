package com.shashwat.Independent;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = inp.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is odd");
        }
    }
}
