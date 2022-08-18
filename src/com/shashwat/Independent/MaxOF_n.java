package com.shashwat.Independent;

import java.util.Scanner;

public class MaxOF_n
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int max = 0;
        System.out.println("Enter no. to find max of them: ");

        while (true)
        {
            int n = in.nextInt();

            if (n > max)
                max = n;

            if (n == 0)
                break;
        }
        System.out.println("The max of the entered input is: " + max);
    }
}
