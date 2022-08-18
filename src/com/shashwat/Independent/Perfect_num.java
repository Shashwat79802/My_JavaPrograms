package com.shashwat.Independent;

import java.util.Scanner;

public class Perfect_num
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter num to check whether perfect: ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++){

            if (n % i == 0)
                sum += i;
        }

        if (n == sum)
            System.out.print("\n" + n + " is a perfect number");
        else {
            System.out.print("\n" + n + " is not a perfect number");
        }
    }
}
