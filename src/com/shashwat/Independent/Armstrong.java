package com.shashwat.Independent;

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int num1, num2, arm1 = 0, arm2 = 0;

        System.out.print("\nEnter two no.s to find out whether armstrong: ");
        num1 = in.nextInt();
        num2 = in.nextInt();

        int num_a = num1, num_b = num2;

        while ( (num1 != 0) && (num2 != 0) )
        {
            int a = num1 % 10;
            arm1 += a*a*a;
            num1 /= 10;

            int b = num2 % 10;
            arm2 += b*b*b;
            num2 /= 10;
        }


        if (num_a == arm1)
        {
            System.out.println(num_a + " is an Armstrong no.");
        }
        else{
            System.out.println(num_a + " is not an Armstrong no.");
        }
        if (num_b == arm2)
        {
            System.out.println(num_b + " is an Armstrong no.");
        }
        else{
            System.out.println(num_b + " is not an Armstrong no.");
        }
    }
}
